package com.osadmin.util;

/**
 * Created by RandolfJay on 16/5/25.
 */
public class EncodeDecodeUtil {
    /*
     * 所有文本框，都必须先经过htmlEncode再入库（防sql注入）
     * 所有显示，如果是单行文本框无须经过htmlDecode
     * 定义：单行文本框输入的内容都是没有格式的内容 推定：所有在单行文本框输入html标签的都是不良行为
     * 带编辑器的多行文本框的内容应该经过htmlDecode，保持其固有格式
     * 注意到script已经被强力转义不再decode还原，因此给你有格式又怎么样？
     */
    public static String htmlEncode(String html) {
        if (html != null) {
            // 必要
            return html
                    .replaceAll("＆", "＆amp;")
                    .replaceAll("<", "＆lt;")
                    .replaceAll(">", "＆gt;")
                    .replaceAll("\"", "＆quot;")
                    .replaceAll(" ", "＆nbsp;")
                    // 一些可能出现问题的半角符号，还是要转义的。
                    // ，+、*、|、\、?等符号在正则表达示中有相应的不同意义。要写成\\,\\+之类
                    .replaceAll("[+]", "＋")
                    .replaceAll("-", "－")
                    // \最为特殊，对于正则表达式敏感也对于java字符串敏感，其在replace的写法为\\\\
                    .replaceAll("\\\\", "＼").replaceAll("/", "／")
                    .replaceAll("[*]", "＊")
                    .replaceAll(":", "：")
                    .replaceAll("[?]", "？")
                    .replaceAll("[|]", "｜")
                    // 非必要，但是还是转义吧
                    .replaceAll("￠", "＆cent;").replaceAll("£", "＆pound;")
                    .replaceAll("¥", "＆yen;").replaceAll("§", "＆sect;")
                    .replaceAll("©", "＆copy;").replaceAll("®", "＆reg;")
                    .replaceAll("×", "＆times;").replaceAll("÷", "＆divide;");
        } else {
            //避免控制入库导致报错，如果遇到空值，先替换成一个空格
            //主要是防止表单验证时，某些浏览器因为兼容性问题，取不到表单某些项的值
            return " ";
        }
    }
    // 这里与htmlEncode成轴对称！正如汇编语言，变量的出栈入栈互成对子才能保护现场一样
    // 写得我很蛋疼，手工把它反过来了
    public static String htmlDecode(String html) {
        if (html != null) {
            return html.replaceAll("＆divide;", "÷")
                    .replaceAll("＆times;", "×")
                    .replaceAll("＆reg;", "®")
                    .replaceAll("＆copy;", "©")
                    .replaceAll("＆sect;", "§")
                    .replaceAll("＆yen;", "¥")
                    .replaceAll("＆pound;", "£")
                    .replaceAll("＆cent;", "￠")
                    // “非必要，但是还是转义吧”部分
                    .replaceAll("｜", "|").replaceAll("？", "?")
                    // 在replace中,在第一个位置要写成[*]，在第二个位置就不用这样写
                    // 因为这里不是正则表达式
                    .replaceAll("：", ":").replaceAll("＊", "*")
                    .replaceAll("／", "/").replaceAll("＼", "\\")
                    .replaceAll("－", "-")
                    .replaceAll("＋", "+")
                    // “一些可能出现问题的半角符号，还是要转义的。”部分
                    .replaceAll("＆nbsp;", " ").replaceAll("＆quot;", "\"")
                    .replaceAll("＆gt;", ">").replaceAll("＆lt;", "<")
                    .replaceAll("＆amp;", "＆")
                    .replaceAll("<script", "＆lt;script");
                     // “必要”部分

        } else {
            return null;
        }
    }
}

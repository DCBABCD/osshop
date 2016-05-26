package com.osadmin.servlet.product;

import com.osadmin.bean.product;
import com.osadmin.servlet.common;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

/**
 * Created by RandolfJay on 16/5/25.
 */
@WebServlet(name = "edit")
public class edit extends common {

    //保存修改的商品
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        request.setCharacterEncoding("utf-8");
        upload.setHeaderEncoding("utf-8");
        String product_id = "";
        String product_name = "";
        String product_price = "";
        String product_color = "";
        String product_size = "";
        String product_num = "";
        String product_detail = "";
        String product_image_01 = "";
        String product_image_02 = "";
        String product_image_03 = "";
        String product_image_04 = "";

        List items = null;
        try {
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        } // 解析request请求

        Iterator iter = items.iterator();
        while (iter.hasNext()) {
            FileItem item = (FileItem) iter.next();
            if (item.isFormField()) {  // 如果是表单域 ，就是非文件上传元素
                String name = new String(item.getFieldName().getBytes("ISO8859_1"),"utf-8");//item.getFieldName(); // 获取name属性的值
                String value = item.getString("utf-8"); // 获取value属性的值
                //System.out.println(value+"yeah");
                if (name.equals("id")) {
                    product_id = value;
                }
                if (name.equals("name")) {
                    product_name = value;
                }
                if (name.equals("price")) {
                    product_price = value;
                }
                if (name.equals("color")) {
                    product_color = value;
                }
                if (name.equals("size")) {
                    product_size = value;
                }
                if (name.equals("num")) {
                    product_num = value;
                }
                if (name.equals("detail")) {
                    product_detail = value;
                }
                if (name.equals("pre_image_01")) {
                    product_image_01 = value;
                }
                if (name.equals("pre_image_02")) {
                    product_image_02 = value;
                }
                if (name.equals("pre_image_03")) {
                    product_image_03 = value;
                }
                if (name.equals("pre_image_04")) {
                    product_image_04 = value;
                }

            } else {
                SimpleDateFormat dirFormatter = new SimpleDateFormat("yyyyMM");
                SimpleDateFormat fileFormatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");

                String fieldName = item.getFieldName(); // 文件域中name属性的值
                String fileName = item.getName(); // 文件的全路径，绝对路径名加文件名
                String contentType = item.getContentType(); // 文件的类型
                String filePath = "/Upload/";
                String filePath2 = "/Users/RandolfJay/Workspaces/IDEA/osshop/out/artifacts/osshop_war_exploded/Upload";
                System.out.println(fieldName);
                if(fieldName.equals("image_01")&&fileName.length()>4){
                    product_image_01 = filePath+fileName;
                }
                if(fieldName.equals("image_02")&&fileName.length()>4){
                    product_image_02 = filePath+fileName;
                }
                if(fieldName.equals("image_03")&&fileName.length()>4){
                    product_image_03 = filePath+fileName;
                }
                if(fieldName.equals("image_04")&&fileName.length()>4){
                    product_image_04 = filePath+fileName;
                }
                String webpath=request.getContextPath();
                File saveFile = new File(filePath2+"/"+fileName); // 定义一个file指向一个具体的文件
                saveFile.createNewFile();
                try {
                    item.write(saveFile);// 把上传的内容写到一个文件中
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        //添加商品到数据库中
        product product = new product();
        product.setProductID(Integer.parseInt(product_id));
        product.setName(product_name);
        product.setColor(product_color);
        product.setPrice(product_price);
        product.setSize(product_size);
        product.setNum(product_num);
        product.setDetail(product_detail);
        product.setImage_01(product_image_01);
        product.setImage_02(product_image_02);
        product.setImage_03(product_image_03);
        product.setImage_04(product_image_04);
        int flag = 0;
        try {
            flag = product.save();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (flag>0){
            this.success(request,response,"商品修改成功!","/admin/product/list.do");
        }else{
            this.error(request,response,"商品修改失败!","/admin/product/edit.do?id="+product.getProductID());
        }
    }

    //显示商品保存的页面
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取商品的ID
        String productID = request.getParameter("id");
        product pu = null;
        try {
           pu = new product().getProductByID(productID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("product",pu);
        request.getRequestDispatcher("/admin/product/product_edit.jsp").forward(request,response);
    }
}

package com.osadmin.bean;

import com.osadmin.util.EncodeDecodeUtil;
import com.osshop.util.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RandolfJay on 16/5/25.
 */
public class product {
    private int productID = 0;
    private String name;
    private String price;
    private String color;
    private String size;
    private String num;
    private String image_01;
    private String image_02;
    private String image_03;
    private String image_04;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = EncodeDecodeUtil.htmlEncode(detail);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getImage_01() {
        return image_01;
    }

    public void setImage_01(String image_01) {
        this.image_01 = image_01;
    }

    public String getImage_02() {
        return image_02;
    }

    public void setImage_02(String image_02) {
        this.image_02 = image_02;
    }

    public String getImage_03() {
        return image_03;
    }

    public void setImage_03(String image_03) {
        this.image_03 = image_03;
    }

    public String getImage_04() {
        return image_04;
    }

    public void setImage_04(String image_04) {
        this.image_04 = image_04;
    }

    public int add() throws SQLException {
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO product (name,price,color,size,num,detail,image_01,image_02,image_03,image_04)value(" +
                "'"+this.name+"','"+this.price+"','"+this.color+"','"+this.size+"','"+this.num+"','"+this.detail+"'" +
                ",'"+this.image_01+"','"+this.image_02+"','"+this.image_03+"','"+this.image_04+"')";
        System.out.println(sql);
        con.prepareStatement(sql);
        int flag = stmt.executeUpdate(sql);
        return flag;
    }

    public int save() throws SQLException {
        int flag = 0;
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "UPDATE product SET name='"+this.name+"',price='"+this.price+"',color='"+this.color+"'" +
                ",size='"+this.size+"',num='"+this.num+"',detail='"+this.detail+"',image_01='"+this.image_01+"'," +
                "image_02='"+this.image_02+"',image_03='"+this.image_03+"',image_04='"+this.image_04+"' WHERE id='"+this.productID+"'";
        System.out.println(sql);
        con.prepareStatement(sql);
        flag = stmt.executeUpdate(sql);
        return flag;
    }

    public int delete(String productID) throws SQLException {
        int flag = 0;
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "DELETE FROM product WHERE id='"+productID+"'";
        System.out.println(sql);
        con.prepareStatement(sql);
        flag = stmt.executeUpdate(sql);
        return flag;
    }

    /**
     * 查询所有的商品
     * @return  list 商品
     * @throws SQLException
     */
    public List<product> getAll() throws SQLException {
        List<product>list = new ArrayList<product>();
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM product";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            product pu = new product();
            pu.setProductID(rs.getInt("id"));
            pu.setName(rs.getString("name"));
            pu.setPrice(rs.getString("price"));
            pu.setNum(rs.getString("num"));
            list.add(pu);
        }
        return list;
    }

    public product getProductByID(String productID) throws SQLException {
        product pu = new product();
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM product WHERE id='"+productID+"'";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println(sql);
        while (rs.next()){
            pu.productID = rs.getInt("id");
            pu.name = rs.getString("name");
            pu.price = rs.getString("price");
            pu.color = rs.getString("color");
            pu.size = rs.getString("size");
            pu.num = rs.getString("num");
            pu.detail = EncodeDecodeUtil.htmlDecode(rs.getString("detail"));
            pu.image_01 = rs.getString("image_01");
            pu.image_02 = rs.getString("image_02");
            pu.image_03 = rs.getString("image_03");
            pu.image_04 = rs.getString("image_04");
        }
        return pu;
    }


}

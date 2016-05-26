package com.osadmin.bean;

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
public class user {
    //data
    private int userID = 0;
    private String user;
    private String password;
    private String name;
    private String tel;
    private boolean checkin=false;
    //method

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }
    /**
     * 查询所有的商品
     * @return  list 商品
     * @throws SQLException
     */
    public List<user> getAll() throws SQLException {
        List<user>list = new ArrayList<user>();
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM user";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            user usr = new user();
            usr.setUserID(rs.getInt("id"));
            usr.setName(rs.getString("name"));
            usr.setPassword(rs.getString("password"));
            usr.setTel(rs.getString("tel"));
            list.add(usr);
        }
        return list;
    }

    public product getUserByID(String userID) throws SQLException {
        user usr = new user();
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM user WHERE id='"+userID+"'";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println(sql);
        while (rs.next()){
            usr.userID = rs.getInt("id");
            usr.name = rs.getString("name");
            usr.tel = rs.getString("tel");
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

package com.osshop.bean;

import com.osshop.util.DB;
import com.osshop.util.MyMD5;

import java.io.UnsupportedEncodingException;
import java.sql.*;

/**
 * Created by RandolfJay on 16/5/19.
 */
public class User {
    //data
    private int userID = 0;
    private String user;
    private String password;
    private String name;
    private String tel;
    private boolean checkin=false;
    //method
    public User(){

    }

    public int getUserID() {
        return userID;
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

    public void setPassword(String password) throws UnsupportedEncodingException {

        this.password = MyMD5.md5(password);
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

    public int add() throws SQLException {
        String sql = "insert into user(name,password,tel) values('"+this.name+"','"+this.password+"','"+this.tel+"')";
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        int rs = stmt.executeUpdate(sql);
        return rs;
    }
    public void save(){

    }
    public void delete(){

    }
    public void where(){

    }
    public boolean login(String name,String password) throws UnsupportedEncodingException, SQLException {
        String username = name;
        String pwd = MyMD5.md5(password);
        String sql = "SELECT * FROM user WHERE name='"+name+"' AND password='"+pwd+"'";
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()){
            this.name = rs.getString("name");
            this.tel = rs.getString("tel");
            this.userID = rs.getInt("id");
            return true;
        }else{
            return false;
        }
    }

}

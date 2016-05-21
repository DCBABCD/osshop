package com.osshop.bean;

import com.osshop.util.DB;
import com.osshop.util.MyMD5;

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

    public void setPassword(String password) {

        this.password = MyMD5.md5(password).toString();
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

    public boolean login(String user,String password) throws SQLException{
        boolean succ=false;
        Connection con = DB.getConnection();
        String sql = "select * from where customer where user="+user+"' AND password='"+password+"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            succ=true;
        }
        rs.close();
        stmt.close();
        con.close();
        return succ;
    }

    public boolean add() throws SQLException {
        String sql = "insert into user(name,password,tel) values('"+this.name+"','"+this.password+"','"+this.tel+"')";
        Connection con = DB.getConnection();
        Statement stmt = con.createStatement();
        boolean rs = stmt.execute(sql);
        return rs;
    }
    public void save(){

    }
    public void delete(){

    }
    public void where(){

    }

}

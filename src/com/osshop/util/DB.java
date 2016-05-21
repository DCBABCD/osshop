//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.osshop.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private String Driver_name = "jdbc:mysql://localhost:3306/myshop?useUnicode=true&characterEncoding=utf-8";
    private String USER = "root";
    private String PASSWORD = "dh977094";
    public static Connection con;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.Driver_name, this.USER, this.PASSWORD);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public static Connection getConnection() {
        if(con == null) {
            new DB();
        }

        return con;
    }
}

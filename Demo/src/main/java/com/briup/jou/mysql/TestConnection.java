package com.briup.jou.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //使用jdbc程序操作数据库步骤：
        //1.注册驱动
        String driver="com.mysql.jdbc.Driver";
        Class.forName(driver);
        String url="jdbc:mysql://192.168.163.25:5728/db2?useSSL=false&useUnicode=true&characterEncoding=utf8" ;
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);
        System.out.println(conn);
        //2.获取statement对象
        //3.执行SQL语句

    }
}

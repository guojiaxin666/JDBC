package com.briup.jou.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class BasicOperation{
    public static void main(String[] args) throws Exception{
        // 创建本类的对象
        BasicOperation bo=new BasicOperation();
        // 调用本类中的方法
        bo.createDatabase();
        bo.deleteDatabase();
    }

    // DDL语句
    // boolean success=stat.execute(sql);  // 返回值是布尔类型，主要用于执行DDL语句

    // 1.创建数据库
    public void createDatabase() throws Exception{
        // 1.注册驱动
        String driver="com.mysql.jdbc.Driver";
        Class.forName(driver);

        // 2.获取连接
        String url="jdbc:mysql://192.168.163.25:5728/?serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);
        System.out.println(conn);

        // 3.获取Statement对象
        Statement stat=conn.createStatement();
        System.out.println(stat);

        // 4.执行SQL语句
        String sql="create database db4";
        // 返回值是布尔类型，主要用于执行DDL语句，该方法的返回值代表的是
        // 所执行的SQL语句是否执行失败，即如果SQL执行成功则返回false，
        // 如果SQL语句执行失败，则返回true；
        boolean success=stat.execute(sql);
        System.out.println("执行结果："+success);
        // 5.处理结果集【无】
        // 由于是DDL，无结果集需要处理
        // 6.关闭连接，释放资源
        // 关闭顺序：先开的后关，后开的先关；
        stat.close();
        conn.close();
    }

    // 2.删除数据库
    public void deleteDatabase() throws Exception {
        String driver="com.mysql.jdbc.Driver";
        Class.forName(driver);

        // 2.获取连接
        String url="jdbc:mysql://192.168.163.25:5728/?serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection conn=DriverManager.getConnection(url,username,password);
        System.out.println(conn);
        Statement stat=conn.createStatement();
        System.out.println(stat);
        String sql = "drop database db4";//按Alt+回车
        boolean success = stat.execute(sql);
        System.out.println("执行结果：" + success);

        stat.close();
        conn.close();
    }
    // 3.创建表
    public void createtable() throws Exception{}

    // 4.删除表
    public void deletetable() throws Exception{}

    // 5.修改表
    public void updatetable() throws Exception{}



    // DML
    // stat.executeUpdate(sql);    // 返回值是int类型，主要用于执行DML语句

    // 1.增加数据，insert

    // 2.删除数据，delete

    // 3.更新数据，update




    // DQL
    // stat.executeQuery(sql);     // 返回值是ResultSet类型，主要用于执行DQL语句

    // 1.查询数据，select
}
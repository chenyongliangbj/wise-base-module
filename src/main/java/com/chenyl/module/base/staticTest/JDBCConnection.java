package com.chenyl.module.base.staticTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    /**
     * DRIVER 数据库驱动
     * URL 数据库地址
     * USER_NAME 数据库用户名
     * PASSWORD 数据库登录密码
     */

    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://127.0.0.1:3306/wise_base_test?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private static final String USER_NAME="root";
    private static final String PASSWORD="123456";
    private static Connection conn;
    private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
    //通过静态代码块加载JDBC驱动

    static
    {
        try{
            Class.forName(DRIVER).newInstance();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * 功能：建立与数据库的连接
     * @return Connection的实例
     *@throws SQLException
     */
    public static Connection getConnection()
    {
        //从线程中获得数据库连接
        conn=threadLocal.get();
        if(conn==null)
        {
            try{
                conn= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                //将数据库连接保存到线程中
                threadLocal.set(conn);
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        return conn;
    }
}

package service;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


/**
 * Created by Xia on 2016/11/7.
 */

public class JDBCService {
    public static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://23.83.249.120:3306/orcl";
        String username = "rht102";
        String password = "1234";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
//    public static void getQuery() {
//        try {
//            Connection conn = getConn();
//            String sql = " select * from tsys_user ";
//            PreparedStatement user;
//            try {
//                user = (PreparedStatement)conn.prepareStatement(sql);
//                ResultSet pson = user.executeQuery();
//                //当返回的数据还有下一条记录的时候，去得到列的数目，用来遍历
//                int col  = pson.getMetaData().getColumnCount();
//                while (pson.next()) {
//                    /**HashMap<String,String>  = new HashMap<String, String>();**/
//                    //遍历是从1开始的
//                    for (int i=1;i<=col;i++) {
//                        System.out.print(pson.getString(i) + "\t");
//                    }
//                    System.out.println();
//                }
//            } catch (Exception e) {
//                System.out.println("error1");
//            }
//
//        } catch (Exception e) {
//            System.out.println("error2");
//        }
//    }
    public static void insert() {

    }
//    public static void main(String[] args) {
//       getQuery();
//    }
}


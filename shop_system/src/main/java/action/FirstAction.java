package action;

/**
 * Created by Xia on 2016/11/11.
 */
import service.JDBCService;
import util.LoginStatus;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.ResultSet;

public class FirstAction extends ActionSupport {

    private String UserName;
    private String UserPassword;

    public void setUserName (String userName) {
        this.UserName = userName;
    }
    public String getUserName(){
        return UserName;
    }
    public void setUserPassword (String userPassword) {
        this.UserPassword = userPassword;
    }
    public String getUserPassword () {
        return UserPassword;
    }

    public  String getQuery() {

        JDBCService jService = new JDBCService();
        try {
            Connection conn = jService.getConn();
            String sql = " select * from tsys_user ";
            PreparedStatement user;
            try {
                user = (PreparedStatement)conn.prepareStatement(sql);
                ResultSet pson = user.executeQuery();
                //查找是否匹配
                while (pson.next()) {
                    if(pson.getString(2).equals(getUserName())) {
                        if(pson.getString(4).equals(getUserPassword())) {
                            return "success";
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("error1");
            }

        } catch (Exception e) {
            System.out.println("error2");
        }
        return "error";
    }

    public String execute() throws Exception {
        LoginStatus now = new LoginStatus();
        return getQuery();
    }
}

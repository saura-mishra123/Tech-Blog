
package com.tech.blog.Dao;

import com.tech.blog.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {

   
    private Connection con;
    public UserDao(Connection con) {
        this.con = con;
    }
    
    public boolean saveUser(User user){
       boolean f= false;
        try{
            String str = "insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
            PreparedStatement pstmt = this.con.prepareStatement(str);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassowrd());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getAbout());
            
            pstmt.executeUpdate();
            f =true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.controller;

import com.dumbweb.projectfutsal.controller.dao.UserDAO;
import com.dumbweb.projectfutsal.dao.impl.UserDAOImpl;
import com.dumbweb.projectfutsal.entity.UserDetail;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/login")
public class LoginController {

  @Autowired
  private UserDAO userDAO; 

    @RequestMapping(method = RequestMethod.GET)
    public String login(ModelMap map) {

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String checkUser(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap map) {

        
        
        try{
            UserDetail u  =userDAO.getByUserName(username);
            if(u==null){
                
                return "login?error";
            }else{
                
                map.addAttribute("user", u);
                return "user/try";
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return "login";
    }
}

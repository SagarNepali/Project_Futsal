/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.dao.impl;

import com.dumbweb.projectfutsal.controller.dao.UserDAO;
import com.dumbweb.projectfutsal.entity.UserDetail;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author user
 */

@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    
    
    @Override
    public List<UserDetail> getAll() throws IOException, SQLException {
        
        session= sessionFactory.openSession();
        return session.getNamedQuery("UserDetail.findAll").list();
    }

    @Override
    public UserDetail getByUserName(String userName) throws IOException, SQLException {
        
        for(UserDetail u : getAll()){
            if(u.getUsername().equals(userName)){
                return u;
            }
            
        }
        return null;
        
    }
    
}

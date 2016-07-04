/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.dao.impl;

import com.dumbweb.projectfutsal.controller.dao.DayDAO;
import com.dumbweb.projectfutsal.entity.Day;
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

@Repository
public class DayDAOImpl implements DayDAO {

    
     @Autowired
    private SessionFactory sessionFactory;
    
    private Session session;
    private Transaction transaction;
            
    @Override
    public List<Day> getAll() {
        session = sessionFactory.openSession();
        
        return session.getNamedQuery("Day.findAll").list();
    }
    
}

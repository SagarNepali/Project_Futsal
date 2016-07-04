/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.dao.impl;

import com.dumbweb.projectfutsal.controller.dao.TimingDAO;
import com.dumbweb.projectfutsal.entity.Timing;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "timingDAO")
public class TimingDAOImpl implements TimingDAO{

    private final SessionFactory sessionFactory;
    
    @Autowired
    public TimingDAOImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public List<Timing> getAllTimings() {
        
        Session session = sessionFactory.openSession();
        return session.getNamedQuery("Timing.findAll").list();
        
    }
    
}

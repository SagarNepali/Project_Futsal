/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.dao.impl;

import com.dumbweb.projectfutsal.controller.dao.BookingDAO;
import com.dumbweb.projectfutsal.entity.Booking;
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

@Repository(value = "bookingDAO")
public class BookingDAOImpl implements BookingDAO{

    
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session session;
    private Transaction transaction;
            
    
    @Override
    public void insert(Booking b) {
        
    }

    @Override
    public List<Booking> getAll() {
        
        session= sessionFactory.openSession();
        return session.getNamedQuery("Booking.findAll").list();
    }
    
}

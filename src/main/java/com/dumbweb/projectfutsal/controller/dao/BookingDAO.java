/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.controller.dao;

import com.dumbweb.projectfutsal.entity.Booking;
import java.util.List;

/**
 *
 * @author user
 */
public interface BookingDAO {
    
    void insert(Booking b);
    List<Booking> getAll();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.controller;

import com.dumbweb.projectfutsal.controller.dao.BookingDAO;
import com.dumbweb.projectfutsal.controller.dao.DayDAO;
import com.dumbweb.projectfutsal.controller.dao.TimingDAO;
import com.dumbweb.projectfutsal.entity.Booking;
import com.dumbweb.projectfutsal.entity.Day;
import com.dumbweb.projectfutsal.entity.Timing;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/fixturetoday")
public class TodaysFixtureController {
    
    @Autowired
    private BookingDAO bookingDAO;
    
    @Autowired
    private TimingDAO timingDAO;
    
    @Autowired
    private DayDAO dayDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String save(ModelMap mv){
      
      
        
           List<Booking> bookings = bookingDAO.getAll();
           List<Timing> timings = timingDAO.getAllTimings();
           
//          
           
           
           mv.addAttribute("bookings", bookings);
           
           mv.addAttribute("timings",timings);
           mv.addAttribute("days",dayDAO.getAll());
        
        return "fixturetoday";
    }
}

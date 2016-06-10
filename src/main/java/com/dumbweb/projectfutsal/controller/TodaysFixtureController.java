/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.controller;

import com.dumbweb.projectfutsal.controller.dao.BookingDAO;
import com.dumbweb.projectfutsal.entity.Booking;
import com.dumbweb.projectfutsal.entity.Day;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
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
    
    @RequestMapping(method = RequestMethod.GET)
    public String save(ModelMap mv){
      
       String [] days = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday","Friday","Saturday"};
//       
//       String [] timings ={"5-6am","6-7am","7-8am","8-9am"};
//        
//        GregorianCalendar calendar = new GregorianCalendar();
//       
//        mv.addAttribute("date",calendar.get(Calendar.MONTH) );
//        mv.addAttribute("days",days);
//        mv.addAttribute("timings",timings);
        
           List<Booking> bookings = bookingDAO.getAll();
           
           for(Booking b: bookings){
               b.getTimingId().getTime();
                       
           }
           
           
           
           mv.addAttribute("bookings", bookings);
        
        return "fixturetoday";
    }
}

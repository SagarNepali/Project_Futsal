/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.controller.dao;

import com.dumbweb.projectfutsal.entity.UserDetail;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface UserDAO {
    
    List<UserDetail> getAll() throws IOException, SQLException;
    UserDetail getByUserName(String userName) throws IOException, SQLException;
    
    
}

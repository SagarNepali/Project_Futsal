/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_days", catalog = "project_futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Day.findAll", query = "SELECT d FROM Day d"),
    @NamedQuery(name = "Day.findById", query = "SELECT d FROM Day d WHERE d.id = :id"),
    @NamedQuery(name = "Day.findByDay", query = "SELECT d FROM Day d WHERE d.day = :day"),
    @NamedQuery(name = "Day.findByStatus", query = "SELECT d FROM Day d WHERE d.status = :status")})
public class Day implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String day;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dayId")
    private List<Booking> bookingList;

    public Day() {
    }

    public Day(Integer id) {
        this.id = id;
    }

    public Day(Integer id, String day, short status) {
        this.id = id;
        this.day = day;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Day)) {
            return false;
        }
        Day other = (Day) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dumbweb.projectfutsal.entity.Day[ id=" + id + " ]";
    }
    
}

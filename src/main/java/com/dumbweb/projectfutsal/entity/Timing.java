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
@Table(name = "tbl_timings", catalog = "project_futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Timing.findAll", query = "SELECT t FROM Timing t"),
    @NamedQuery(name = "Timing.findAllTiming", query = "SELECT t.time FROM Timing t"),
    @NamedQuery(name = "Timing.findById", query = "SELECT t FROM Timing t WHERE t.id = :id"),
    @NamedQuery(name = "Timing.findByTime", query = "SELECT t FROM Timing t WHERE t.time = :time"),
    @NamedQuery(name = "Timing.findByAmPm", query = "SELECT t FROM Timing t WHERE t.amPm = :amPm"),
    @NamedQuery(name = "Timing.findByStatus", query = "SELECT t FROM Timing t WHERE t.status = :status")})
public class Timing implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String time;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "am_pm", nullable = false, length = 10)
    private String amPm;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timingId")
    private List<Booking> bookingList;

    public Timing() {
    }

    public Timing(Integer id) {
        this.id = id;
    }

    public Timing(Integer id, String time, String amPm, short status) {
        this.id = id;
        this.time = time;
        this.amPm = amPm;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAmPm() {
        return amPm;
    }

    public void setAmPm(String amPm) {
        this.amPm = amPm;
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
        if (!(object instanceof Timing)) {
            return false;
        }
        Timing other = (Timing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dumbweb.projectfutsal.entity.Timing[ id=" + id + " ]";
    }
    
}

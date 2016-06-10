/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.projectfutsal.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_bookings", catalog = "project_futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b"),
    @NamedQuery(name = "Booking.findById", query = "SELECT b FROM Booking b WHERE b.id = :id"),
    @NamedQuery(name = "Booking.findByMonth", query = "SELECT b FROM Booking b WHERE b.month = :month"),
    @NamedQuery(name = "Booking.findByYear", query = "SELECT b FROM Booking b WHERE b.year = :year"),
    @NamedQuery(name = "Booking.findByBookedBy", query = "SELECT b FROM Booking b WHERE b.bookedBy = :bookedBy"),
    @NamedQuery(name = "Booking.findByBookedThrough", query = "SELECT b FROM Booking b WHERE b.bookedThrough = :bookedThrough"),
    @NamedQuery(name = "Booking.findByBookedTime", query = "SELECT b FROM Booking b WHERE b.bookedTime = :bookedTime"),
    @NamedQuery(name = "Booking.findByIsMember", query = "SELECT b FROM Booking b WHERE b.isMember = :isMember"),
    @NamedQuery(name = "Booking.findByIsRegular", query = "SELECT b FROM Booking b WHERE b.isRegular = :isRegular"),
    @NamedQuery(name = "Booking.findByConfirmedBy", query = "SELECT b FROM Booking b WHERE b.confirmedBy = :confirmedBy"),
    @NamedQuery(name = "Booking.findByModifiedDate", query = "SELECT b FROM Booking b WHERE b.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "Booking.findByStatus", query = "SELECT b FROM Booking b WHERE b.status = :status"),
    @NamedQuery(name = "Booking.findByRemarks", query = "SELECT b FROM Booking b WHERE b.remarks = :remarks")})
public class Booking implements Serializable {
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
    private String month;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date year;
    @Size(max = 10)
    @Column(name = "booked_by", length = 10)
    private String bookedBy;
    @Size(max = 20)
    @Column(name = "booked_through", length = 20)
    private String bookedThrough;
    @Basic(optional = false)
    @NotNull
    @Column(name = "booked_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_member", nullable = false)
    private boolean isMember;
    @Column(name = "is_regular")
    private Boolean isRegular;
    @Size(max = 10)
    @Column(name = "confirmed_by", length = 10)
    private String confirmedBy;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private boolean remarks;
    @JoinColumn(name = "day_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Day dayId;
    @JoinColumn(name = "timing_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Timing timingId;

    public Booking() {
    }

    public Booking(Integer id) {
        this.id = id;
    }

    public Booking(Integer id, String month, Date year, Date bookedTime, boolean isMember, boolean status, boolean remarks) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.bookedTime = bookedTime;
        this.isMember = isMember;
        this.status = status;
        this.remarks = remarks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public String getBookedThrough() {
        return bookedThrough;
    }

    public void setBookedThrough(String bookedThrough) {
        this.bookedThrough = bookedThrough;
    }

    public Date getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(Date bookedTime) {
        this.bookedTime = bookedTime;
    }

    public boolean getIsMember() {
        return isMember;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public Boolean getIsRegular() {
        return isRegular;
    }

    public void setIsRegular(Boolean isRegular) {
        this.isRegular = isRegular;
    }

    public String getConfirmedBy() {
        return confirmedBy;
    }

    public void setConfirmedBy(String confirmedBy) {
        this.confirmedBy = confirmedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getRemarks() {
        return remarks;
    }

    public void setRemarks(boolean remarks) {
        this.remarks = remarks;
    }

    public Day getDayId() {
        return dayId;
    }

    public void setDayId(Day dayId) {
        this.dayId = dayId;
    }

    public Timing getTimingId() {
        return timingId;
    }

    public void setTimingId(Timing timingId) {
        this.timingId = timingId;
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
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dumbweb.projectfutsal.entity.Booking[ id=" + id + " ]";
    }
    
}

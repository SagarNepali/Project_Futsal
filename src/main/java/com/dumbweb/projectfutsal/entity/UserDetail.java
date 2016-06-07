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
import javax.persistence.Lob;
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
@Table(name = "tbl_user_details", catalog = "project_futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserDetail.findAll", query = "SELECT u FROM UserDetail u"),
    @NamedQuery(name = "UserDetail.findById", query = "SELECT u FROM UserDetail u WHERE u.id = :id"),
    @NamedQuery(name = "UserDetail.findByUsername", query = "SELECT u FROM UserDetail u WHERE u.username = :username"),
    @NamedQuery(name = "UserDetail.findByPassword", query = "SELECT u FROM UserDetail u WHERE u.password = :password"),
    @NamedQuery(name = "UserDetail.findByPhone1", query = "SELECT u FROM UserDetail u WHERE u.phone1 = :phone1"),
    @NamedQuery(name = "UserDetail.findByPhone2", query = "SELECT u FROM UserDetail u WHERE u.phone2 = :phone2"),
    @NamedQuery(name = "UserDetail.findByAddedDate", query = "SELECT u FROM UserDetail u WHERE u.addedDate = :addedDate"),
    @NamedQuery(name = "UserDetail.findByModifiedDate", query = "SELECT u FROM UserDetail u WHERE u.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "UserDetail.findByTeamName", query = "SELECT u FROM UserDetail u WHERE u.teamName = :teamName"),
    @NamedQuery(name = "UserDetail.findByReadyForMatch", query = "SELECT u FROM UserDetail u WHERE u.readyForMatch = :readyForMatch"),
    @NamedQuery(name = "UserDetail.findByNotifyByMail", query = "SELECT u FROM UserDetail u WHERE u.notifyByMail = :notifyByMail"),
    @NamedQuery(name = "UserDetail.findByShowNumber", query = "SELECT u FROM UserDetail u WHERE u.showNumber = :showNumber"),
    @NamedQuery(name = "UserDetail.findByCallToConfirm", query = "SELECT u FROM UserDetail u WHERE u.callToConfirm = :callToConfirm"),
    @NamedQuery(name = "UserDetail.findByStatus", query = "SELECT u FROM UserDetail u WHERE u.status = :status")})
public class UserDetail implements Serializable {
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
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(nullable = false, length = 65535)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private String phone1;
    private String phone2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "added_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Size(max = 20)
    @Column(name = "team_name", length = 20)
    private String teamName;
    @Column(name = "ready_for_match")
    private Short readyForMatch;
    @Column(name = "notify_by_mail")
    private Short notifyByMail;
    @Column(name = "show_number")
    private Short showNumber;
    @Column(name = "call_to_confirm")
    private Short callToConfirm;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short status;

    public UserDetail() {
    }

    public UserDetail(Integer id) {
        this.id = id;
    }

    public UserDetail(Integer id, String username, String password, String email, String phone1, Date addedDate, short status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone1 = phone1;
        this.addedDate = addedDate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Short getReadyForMatch() {
        return readyForMatch;
    }

    public void setReadyForMatch(Short readyForMatch) {
        this.readyForMatch = readyForMatch;
    }

    public Short getNotifyByMail() {
        return notifyByMail;
    }

    public void setNotifyByMail(Short notifyByMail) {
        this.notifyByMail = notifyByMail;
    }

    public Short getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(Short showNumber) {
        this.showNumber = showNumber;
    }

    public Short getCallToConfirm() {
        return callToConfirm;
    }

    public void setCallToConfirm(Short callToConfirm) {
        this.callToConfirm = callToConfirm;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
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
        if (!(object instanceof UserDetail)) {
            return false;
        }
        UserDetail other = (UserDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dumbweb.projectfutsal.controller.entity.UserDetail[ id=" + id + " ]";
    }
    
}

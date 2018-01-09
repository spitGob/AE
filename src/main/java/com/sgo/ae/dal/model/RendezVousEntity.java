/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.dal.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author stephane
 */
@Entity(name="RENDEZ_VOUS")
public class RendezVousEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
     private Long id;
    
    private String dateRdv;
    
    private String client;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the dateRdv
     */
    public String getDateRdv() {
        return dateRdv;
    }

    /**
     * @param dateRdv the dateRdv to set
     */
    public void setDateRdv(String dateRdv) {
        this.dateRdv = dateRdv;
    }

    /**
     * @return the client
     */
    public String getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "RendezVousEntity{" + "id=" + id + ", dateRdv=" + dateRdv + ", client=" + client + '}';
    }

 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.dtos;

import java.io.Serializable;


/**
 *
 * @author stephane
 */
public class RendezVousDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
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
}

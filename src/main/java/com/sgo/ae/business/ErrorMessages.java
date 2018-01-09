/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.business;

/**
 *
 * @author stephane
 */
public enum ErrorMessages {
    
    MISSING_REQUIRED_FIELD("Missing required field");
    
    private final String errorMessage;
    
    ErrorMessages(String message){
        this.errorMessage = message;
    }
    
    public String getErrorMessage(){
        return errorMessage;
    }
}
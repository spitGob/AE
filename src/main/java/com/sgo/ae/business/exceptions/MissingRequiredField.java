/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.business.exceptions;

/**
 *
 * @author stephane
 */
public class MissingRequiredField extends Exception{

    private static final long serialVersionUID = 2826206510823951329L;

   
        
        public MissingRequiredField(String errorMessage) {
            super(errorMessage);
        }
}

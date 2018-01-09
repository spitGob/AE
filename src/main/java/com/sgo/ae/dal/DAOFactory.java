/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.dal;

import com.sgo.ae.dal.mariadb.RendezVousDAOMariaDBImpl;

/**
 *
 * @author stephane
 */
public class DAOFactory {
    
    public static DAORendezVous getDAORDV(){
        return new RendezVousDAOMariaDBImpl();
    }
    
}

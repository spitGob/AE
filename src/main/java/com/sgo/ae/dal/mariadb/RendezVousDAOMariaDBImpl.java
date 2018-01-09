/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.dal.mariadb;


import com.sgo.ae.dal.DAORendezVous;
import com.sgo.ae.dal.HibernateUtils;
import com.sgo.ae.dal.model.RendezVousEntity;
import com.sgo.ae.dtos.RendezVousDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author stephane
 */
public class RendezVousDAOMariaDBImpl implements DAORendezVous {

    private Session session;
    
    public void openConnection() {
       SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
       session = sessionFactory.openSession();
    }

    public void closeConnection() {
        if(session!= null){
           session.close(); 
        }
        
    }

    public RendezVousDTO getRendezVousById(long id) {
        RendezVousDTO rdvDTO = null;
        
        
        
        return rdvDTO;
    }

    

    public void insert(RendezVousDTO obj) {
        RendezVousEntity rdvEntity = new RendezVousEntity();
        BeanUtils.copyProperties(obj, rdvEntity);
        System.out.println("com.sgo.ae.dal.mariadb.RendezVousDAOMariaDBImpl.insert()-");
        session.beginTransaction();
        session.save(rdvEntity);
        session.getTransaction().commit();
        System.out.println("com.sgo.ae.dal.mariadb.RendezVousDAOMariaDBImpl.insert()-"+rdvEntity.toString());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.dal;

import com.sgo.ae.dtos.RendezVousDTO;

/**
 *
 * @author stephane
 */
public interface DAORendezVous extends DAO<RendezVousDTO>{
    RendezVousDTO getRendezVousById(long id);
}

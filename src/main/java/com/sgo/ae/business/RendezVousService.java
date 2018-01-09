/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.business;

import com.sgo.ae.business.exceptions.MissingRequiredField;
import com.sgo.ae.dal.DAOFactory;
import com.sgo.ae.dal.DAORendezVous;
import com.sgo.ae.dtos.RendezVousDTO;

/**
 *
 * @author stephane
 */
public class RendezVousService {

    private static DAORendezVous daoRendezVous = DAOFactory.getDAORDV();

    public static void createRendezVous(RendezVousDTO rdvDTO) throws MissingRequiredField {

        validateRendezVous(rdvDTO);

        daoRendezVous.openConnection();

        daoRendezVous.insert(rdvDTO);

        daoRendezVous.closeConnection();

    }

    public static void validateRendezVous(RendezVousDTO rdvDTO) throws MissingRequiredField {
        if (rdvDTO.getClient() == null || rdvDTO.getClient().isEmpty()
                || rdvDTO.getDateRdv() == null || rdvDTO.getDateRdv().isEmpty()) {
            throw new MissingRequiredField(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());
        }
    }

}

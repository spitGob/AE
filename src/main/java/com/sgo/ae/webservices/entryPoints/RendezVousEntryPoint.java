/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.webservices.entryPoints;


import com.sgo.ae.business.RendezVousService;
import com.sgo.ae.business.exceptions.MissingRequiredField;
import com.sgo.ae.dtos.RendezVousDTO;
import com.sgo.ae.webservices.model.requests.CreateRendezVousRequestModel;
import com.sgo.ae.webservices.responses.CreateRendezVousResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author stephane
 */
@Path("/rendezVous")
public class RendezVousEntryPoint {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces( {MediaType.APPLICATION_JSON})
    public CreateRendezVousResponse createRendezVous(CreateRendezVousRequestModel requestObject) throws MissingRequiredField{
        
        CreateRendezVousResponse rdvResponse = new CreateRendezVousResponse();
        RendezVousDTO rdvDTO = new RendezVousDTO();
        BeanUtils.copyProperties(requestObject, rdvDTO);
        
       RendezVousService.createRendezVous(rdvDTO);
       
        BeanUtils.copyProperties(rdvDTO, rdvResponse);
       return rdvResponse;
        
    }
    
    
    
}

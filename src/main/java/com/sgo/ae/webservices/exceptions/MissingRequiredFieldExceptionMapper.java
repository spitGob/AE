/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgo.ae.webservices.exceptions;

import com.sgo.ae.business.ErrorMessages;
import com.sgo.ae.business.exceptions.MissingRequiredField;
import com.sgo.ae.webservices.responses.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author stephane
 */
@Provider
public class MissingRequiredFieldExceptionMapper implements ExceptionMapper<MissingRequiredField>{
    public Response toResponse(MissingRequiredField exception){
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(),ErrorMessages.MISSING_REQUIRED_FIELD.name(), "http://www.ae.com");
        return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
}

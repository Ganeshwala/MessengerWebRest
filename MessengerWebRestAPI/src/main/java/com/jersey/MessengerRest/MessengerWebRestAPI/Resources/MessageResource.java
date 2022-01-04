package com.jersey.MessengerRest.MessengerWebRestAPI.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Messages;
import com.jersey.MessengerRest.MessengerWebRestAPI.Services.MessageService;

@Path("/messages")
@Produces("application/xml")
public class MessageResource {

	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Messages> getMessages(){
		return service.getAllMessages();
	}
}

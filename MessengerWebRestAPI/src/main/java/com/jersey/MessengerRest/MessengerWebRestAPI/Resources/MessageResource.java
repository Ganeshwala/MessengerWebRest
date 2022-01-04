package com.jersey.MessengerRest.MessengerWebRestAPI.Resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Messages;
import com.jersey.MessengerRest.MessengerWebRestAPI.Services.MessageService;

@Path("/messages")
@Produces("application/json")
@Consumes("application/json")
public class MessageResource {

	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Messages> getMessages(){
		return service.getAllMessages();
	}
	
	@GET
	@Path("/{messageID}")
	public Messages getMessage(@PathParam(value="messageID") long mId){
		return service.getMessage(mId);
	}
	
	@POST
	public Messages addMessage(Messages msg) {
		return service.addMessage(msg);
	}
	
	@PUT
	public Messages updateMessage(Messages msg) {
		return service.updateMessage(msg);
	}
	
	@DELETE
	@Path("/{deleteMID}")
	public Messages deleteMessage(@PathParam("deleteMID") long mId) {
		return service.deleteMessage(mId);
	}
	
	
}

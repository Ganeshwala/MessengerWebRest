package com.jersey.MessengerRest.MessengerWebRestAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jersey.MessengerRest.MessengerWebRestAPI.Database.DatabaseConnection;
import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Messages;

public class MessageService {

	private Map<Long, Messages> msg = DatabaseConnection.getMessage();
	
	public MessageService() {
		msg.put(1L,new Messages(1, "Create first REST API", "Chintan"));
		msg.put(2L,new Messages(2, "Get Responce in XML Formatt", "Ganeshwala"));
	}
	
	public List<Messages> getAllMessages(){
		/*Messages m1 = new Messages(1, "Create first REST API", "Chintan");
		Messages m2 = new Messages(2, "Get Responce in XML Formatt", "Ganeshwala");
		List<Messages> result = new ArrayList<Messages>();
		result.add(m1);
		result.add(m2);
		return result;*/
		return new ArrayList<Messages>(msg.values());
	}
	
	public Messages getMessage(long id) {
		return msg.get(id);
	}
	
	public Messages addMessage(Messages message) {
		message.setMessageId(msg.size()+1);
		msg.put(message.getMessageId(), message);
		return message;
	}
	
	public Messages updateMessage(Messages message) {
		if(message.getMessageId() <=0) {
			return null;
		}
		msg.put(message.getMessageId(),message);
		return message;
	}
	
	public Messages deleteMessage(long id) {
		return msg.remove(id);
	}
}

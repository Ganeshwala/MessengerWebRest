package com.jersey.MessengerRest.MessengerWebRestAPI.Services;

import java.util.ArrayList;
import java.util.List;

import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Messages;

public class MessageService {

	public List<Messages> getAllMessages(){
		Messages m1 = new Messages(1, "Create first REST API", "Chintan");
		Messages m2 = new Messages(2, "Get Responce in XML Formatt", "Ganeshwala");
		List<Messages> result = new ArrayList<Messages>();
		result.add(m1);
		result.add(m2);
		return result;
	}
}

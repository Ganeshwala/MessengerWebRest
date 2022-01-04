package com.jersey.MessengerRest.MessengerWebRestAPI.Database;

import java.util.HashMap;
import java.util.Map;

import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Messages;
import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Profile;

public class DatabaseConnection {

	private static Map<Long, Messages> messages = new HashMap<Long, Messages>();
	
	private static Map<Long, Profile> profile = new HashMap<Long, Profile>();
	
	public static Map<Long, Messages> getMessage() {
		return messages;
	}
	
	public static Map<Long, Profile> getProfile(){
		return profile;
	}
}

package com.jersey.MessengerRest.MessengerWebRestAPI.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jersey.MessengerRest.MessengerWebRestAPI.Database.DatabaseConnection;
import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseConnection.getProfile();
	
	public ProfileService() {
		profiles.put("Ganeshwc", new Profile(1,"Ganeshwc","Chintan","Ganeshwala"));
		profiles.put("Yo_Yo_Jal", new Profile(2,"Yo_Yo_Jal","Jal","Patel"));
	}
	
	public List<Profile> getAllProfile(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile newProfile) {
		newProfile.setId((long)profiles.size()+1);
		profiles.put(newProfile.getProfileName(), newProfile);
		return newProfile;
	}
	
	public Profile updateProfile(Profile profileName) {
		System.out.println("Profile"+profileName);
		if(profileName.getProfileName().isEmpty()) {
			System.out.println("inside if statement");
			return null;
		}
		System.out.println("out side");
		profiles.put(profileName.getProfileName(), profileName);
		return profileName;
	}
	
	public Profile deleteProfile(String profileName) {
		return profiles.remove(profileName);
		
	}
}

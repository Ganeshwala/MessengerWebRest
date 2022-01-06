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

import com.jersey.MessengerRest.MessengerWebRestAPI.Model.Profile;
import com.jersey.MessengerRest.MessengerWebRestAPI.Services.ProfileService;

@Path("/profiles")
@Consumes("application/json")
@Produces("application/json")
public class ProfileResource {

	ProfileService pService = new ProfileService();
	
	@GET
	public List<Profile> getAllProfile() {
		return pService.getAllProfile();
	}
	
	@GET
	@Path("/{pName}")
	public Profile getProfile(@PathParam("pName") String userName) {
		return pService.getProfile(userName);
	}
	
	@POST
	public Profile newProfile(Profile newUser) {
		return pService.addProfile(newUser);
	}
	
	@PUT
	@Path("/{userName}")
	public Profile updateProfile(@PathParam("userName")String profileName,Profile profile) {
		System.out.println("userName"+profileName);
		profile.setProfileName(profileName);
		return pService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{userName}")
	public Profile deleteUser(@PathParam("userName")String profileName) {
		return pService.deleteProfile(profileName);
	}
}

package com.journaldev.bootifulmongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.GetMapping;

import com.journaldev.bootifulmongodb.dal.UserDAL;
import com.journaldev.bootifulmongodb.dal.UserRepository;
import com.journaldev.bootifulmongodb.model.User;

@RestController
@RequestMapping(value = "/")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final UserRepository userRepository;

	private final UserDAL userDAL;

	public UserController(UserRepository userRepository, UserDAL userDAL) {
		System.out.println("USERREPO Java 17 ++++++++++++++++++++++++++++++++++++++++++++++");
		this.userRepository = userRepository;
		this.userDAL = userDAL;
	}


	@GetMapping("/demo1")
public String do1() {
    return " --- I am do1 method of UserController --- ";
}

@GetMapping("/demo2")
public String do2() {
    return "--- I am do2 method  of UserController --- ";
}

@GetMapping("/demo3")
public String do3() {
    return "--- I am do3 method  of UserController --- ";
}



//	@PostMapping("/teams")
//	public ResponseEntity<Team> createTeam(@RequestBody CreateTeamDto createTeamDto) {
//	  Team teamCreated = teamRepository.save(createTeamDto.toTeam());
//
//	  return new ResponseEntity<>(teamCreated, HttpStatus.CREATED);
//	}


	@PostMapping("/create")
//	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User addNewUsers(@RequestBody User user) {
		LOG.info("Saving user.");
		System.out.println("NEW USER by PostMapping !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return userRepository.save(user);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		LOG.info("Getting all users.");
		return userRepository.findAll();
	}

/*
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable String userId) {
		LOG.info("Getting user with ID: {}.", userId);
		return userRepository.findById(userId);
		// return userRepository.findOne(userId);
	}
*/


	// @RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
	// public Object getAllUserSettings(@PathVariable String userId) {
	// User user = userRepository.findOne(userId);
	// if (user != null) {
	// return user.getUserSettings();
	// } else {
	// return "User not found.";
	// }
	// }

/* 	
	@RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
	public Object getAllUserSettings(@PathVariable String userId) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return userDAL.getAllUserSettings(userId);
		} else {
			return "User not found.";
		}
	}

*/

	// @RequestMapping(value = "/settings/{userId}/{key}", method =
	// RequestMethod.GET)
	// public String getUserSetting(@PathVariable String userId, @PathVariable
	// String key) {
	// //User user = userRepository.findOne(userId);
	// String setting = userDAL.getUserSetting(userId, key);
	// LOG.info("Setting = "+setting);
	// if (setting != null) {
	// return setting;
	// } else {
	// return "Setting not found.";
	// }
	// }

	@RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
	public String getUserSetting(@PathVariable String userId, @PathVariable String key) {
		return userDAL.getUserSetting(userId, key);
	}

/* 	
	@RequestMapping(value = "/settings/{userId}/{key}/{value}", method = RequestMethod.GET)
	public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			user.getUserSettings().put(key, value);
			userRepository.save(user);
			return "Key added";
		} else {
			return "User not found.";
		}
	}
*/

}
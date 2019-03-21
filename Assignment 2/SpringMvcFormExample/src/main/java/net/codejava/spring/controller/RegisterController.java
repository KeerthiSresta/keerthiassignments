package net.codejava.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.codejava.spring.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		User userForm = new User();		
		model.put("userForm", userForm);
		
		List<String> classcoachList = new ArrayList<>();
		classcoachList.add("Sleeper (SL)");
		classcoachList.add("AC First Class (1A)");
		classcoachList.add("AC 2 Tier (2A)");
		classcoachList.add("AC 3 Tier (3A)");
		model.put("classcoachList", classcoachList);
		
		return "Registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") User user, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("source: " + user.getSource());
		System.out.println("destination: " + user.getDestination());
		System.out.println("email: " + user.getEmail());
		System.out.println("birth date: " + user.getBirthDate());
		System.out.println("trainnum:" + user.getTrainnum());
		System.out.println("class: " + user.getClasscoach());
		System.out.println("passname: " + user.getPassname());
		System.out.println("age: " + user.getAge());
		System.out.println("sex: " + user.getSex());
		System.out.println("berthpref: " + user.getBerthpref());
		return "RegistrationSuccess";
	}
}

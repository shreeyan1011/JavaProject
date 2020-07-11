package com.application.swebapp.newapp.controller;

import java.util.HashMap;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.swebapp.newapp.model.Databaseentity;
import com.application.swebapp.newapp.model.User;
import com.application.swebapp.newapp.repository.DatabaseRepository;

@Controller
//@RequestMapping(path="/demo")
public class AuthenticaticateController {
	
	@Autowired 
 private DatabaseRepository userRepository;
	//HashMap <String, String> hval = new HashMap<String, String>();
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam Integer PersonID 
     , @RequestParam String Lastname, @RequestParam String Firstname, @RequestParam String Useraddress,
     @RequestParam String Email,@RequestParam String Userlocation,@RequestParam String Gender,@RequestParam String Userpassword)
    {
    	 System.out.println("Inside userRepository constructor");
    	 Databaseentity n = new Databaseentity();
         n.setPersonID(PersonID);
         n.setLastName(Lastname);
         n.setFirstName(Firstname);
         n.setUserAddress(Useraddress);
         n.setEmail(Email);
         n.setUserLocation(Userlocation);
         n.setGender(Gender);
         n.setUserPassword(Userpassword);
        // hval.put(n.getEmail(),n.getUserPassword());
    	 userRepository.save(n);
    	 return "Saved";
    	  }
 
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Databaseentity> getAllUsers() {
      // This returns a JSON or XML with the users

      return userRepository.findAll();
    }
    
    @GetMapping(path="/showMessage")
    public String sendForm(User user) {

        return "showMessage";
    }

    @PostMapping(path="/showMessage")
    public String processForm(User user) {
		
		  String email, pswd =""; 
		  int c=0;
		  email =user.getEmail();
		  pswd= user.getPswd();
		  //System.out.println("%%%%%%%%%%%%%%%%%"+userRepository.findAll());
		  String s = userRepository.findAll().toString();
		  s = s.replaceAll("[\\[\\](){}]","");
		  StringTokenizer st = new StringTokenizer(s,",");
		  while(st.hasMoreTokens())
		  {
			  String x =st.nextToken();
			
			  //System.out.println("%%%%%%%%%%%%%%%%%"+x);
			  StringTokenizer kv = new StringTokenizer(x,"=");
			  while(kv.hasMoreTokens())
			  {
				  String db_email = kv.nextToken();
		          String db_pswd =	 kv.nextToken(); 
				  //System.out.println("**************"+db_email+"="+db_pswd); 
				  if(email.equals(db_email) && pswd.equals(db_pswd))
				  {
					  System.out.println("**************"+db_email+"="+db_pswd); 
					  System.out.println("$$$$$$$$$$$$"+email+"="+pswd); 
					  c=1;
				  }
			  }
			 
		  }
		  
		 // System.out.println("Database details" +s.spliterator().toString());
		  System.out.println("Form details$$$$$$$"+ email +"="+pswd);
		  System.out.println("check counter$$$$$$$"+ c);
		  if(c==1)
		  return "success";
		  else
		  return "notuser";
		
    }
    
}

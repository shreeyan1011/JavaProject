package com.application.swebapp.newapp.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.application.swebapp.newapp.model.User;

@Controller
public class MyController {
	private final String insertquery = "INSERT INTO userhire(PersonID,LastName,FirstName,UserAddress,Email,UserLocation,Gender,UserPassword) values(:PersonID,:LastName,:FirstName,:UserAddress,:Email,:UserLocation,:Gender,:UserPassword)";
	@Autowired
	private NamedParameterJdbcTemplate jdbctemplate;

    @GetMapping("/addUser")
    public String sendForm(User user) {

        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {

    	Random r = new Random();
	   String location = user.getCounty()+", "+user.getCountry();
		KeyHolder hkey = new GeneratedKeyHolder();
			SqlParameterSource params = new MapSqlParameterSource()
					.addValue("PersonID", r.nextInt())
					.addValue("LastName", user.getLname())
					.addValue("FirstName", user.getFname())
					.addValue("UserAddress", user.getAddr())
					.addValue("Email", user.getEmail())
			        .addValue("UserLocation",location)
			        .addValue("Gender", user.getGender())
			        .addValue("UserPassword", user.getPswd());
			jdbctemplate.update(insertquery, params,hkey);
        return "upload";
    }
}
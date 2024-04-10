package com.Jbk.DeleteApi.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jbk.DeleteApi.Entity.Delete;
import com.Jbk.DeleteApi.Entity.Service.service;

@RestController
@RequestMapping("/Postapi")
public class controller {
	
	@Autowired
	service ser;
	
	@PostMapping("/Postadd")
	public String add(@RequestBody  Delete d) {	
	String msg=	ser.add(d);
	return msg;
	}
}

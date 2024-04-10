package com.Jbk.DeleteApi.Entity.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jbk.DeleteApi.Entity.Dao;
import com.Jbk.DeleteApi.Entity.Delete;

@Service
public class service {

	@Autowired
	Dao dao;
	
	public String add(Delete d) {
	String msg=	dao.add(d);
	if(Objects.isNull(msg)) {
		msg="data add succesfully";	}
		
		return  msg;
	}
}

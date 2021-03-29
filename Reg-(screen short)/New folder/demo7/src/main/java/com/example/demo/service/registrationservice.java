package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user;
import com.example.demo.respository.registrationrepo;

import java.util.*;

@Service
public class registrationservice {
@Autowired
   private registrationrepo repo;
//public user saveuser(user User) {
	//return repo.save(User);
//}
public user checkemail(String email) {
	return repo.findByEmail(email);
}
public user checkemailandusername(String tempemail, String temppass) {
	// TODO Auto-generated method stub
	return repo.findByEmailAndPassword(tempemail,temppass);
}
//public List<user> getdatabasevalue(user User) {
	//List<user> arrlist=new ArrayList<>();
	//repo.findAll().forEach(d->arrlist.add(User));
	//return arrlist;
//}	
}

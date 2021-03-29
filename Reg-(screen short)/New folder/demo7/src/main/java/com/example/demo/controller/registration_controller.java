package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.*;
import com.example.demo.model.user;
import com.example.demo.respository.registrationrepo;
import com.example.demo.service.registrationservice;

@RestController

public class registration_controller {

@Autowired
 private registrationservice rs;
@Autowired
private registrationrepo repos;

@PostMapping("/registrions")
@CrossOrigin(origins="http://localhost:4200")
	public user reguser(@RequestBody user User) throws Exception {
	 String tempemail=User.getEmail();
	 if(tempemail !=null && !"".equals(tempemail)) {
		user og=rs.checkemail(tempemail);
		 if(og!=null) {
				throw new Exception("the email id is already"+tempemail+"exit");
			}
		}
	user o=repos.save(User);
	 
		return o;
	}

@PostMapping("/login")
@CrossOrigin(origins="http://localhost:4200")
public user checklogin(@RequestBody user User ) throws Exception {
user ob=null;
	 String tempemail=User.getEmail();
	 String temppass=User.getPassword();
	 if(tempemail !=null && temppass !=null){
		  ob=rs.checkemailandusername(tempemail,temppass);
		  }
	 if(ob==null) {
		 throw new Exception("Bad ");
		//return ob;
	 }
	return ob;
}
@Autowired
registrationrepo repo;
@GetMapping("/getdatabase")

@CrossOrigin(origins="http://localhost:4200")
public List<user>getdb() {
	return repo.findAll();
	
}
}



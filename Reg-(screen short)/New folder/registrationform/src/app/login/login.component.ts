import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { RegistrationsService } from '../registrations.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
user =new User();
msg:string="";
  constructor(private route: ActivatedRoute, 
      private router: Router, 
    private services:RegistrationsService) { }

  ngOnInit(): void {
  }
  checklogin(){
this.services.loginUserFormate(this.user).subscribe(
  data=> {console.log("respose recived");
this.router.navigate(['home'])
},
error=>{
  console.log("exception occured");
this.msg="BAD CREDENTIAL, please enter valid and password";
}
  )
  }
}

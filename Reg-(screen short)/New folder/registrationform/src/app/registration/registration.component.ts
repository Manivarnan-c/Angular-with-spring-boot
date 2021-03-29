import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RegistrationsService } from '../registrations.service';
import { User } from '../user';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  user=new User();
msg:any;
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
    private services:RegistrationsService)
  {}

  ngOnInit(): void {
  }
  public saveregistrarion(){
this.services.registrationformate(this.user).subscribe(
  (data) =>this.msg='success');
  }
}

import { Component, OnInit } from '@angular/core';
import { RegistrationsService } from '../registrations.service';

@Component({
  selector: 'app-viewdatabase',
  templateUrl: './viewdatabase.component.html',
  styleUrls: ['./viewdatabase.component.css']
})
export class ViewdatabaseComponent implements OnInit {
users:any;
  constructor(private servic:RegistrationsService) { }

  ngOnInit(): void {
    let resp=this.servic.getdatabases();
    resp.subscribe((data)=>this.users=data);
  }

}

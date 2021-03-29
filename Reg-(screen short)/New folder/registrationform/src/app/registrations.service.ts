import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class RegistrationsService {

  constructor(private http:HttpClient) { }
public loginUserFormate(user:User):Observable<any>{
  return this.http.post('http://localhost:8080/login',user)
}
public registrationformate(user:User):Observable<any>{
  return this.http.post<User>('http://localhost:8080/registrions',user)
}
public getdatabases(){
  return this.http.get('http://localhost:8080/getdatabase')
}
}

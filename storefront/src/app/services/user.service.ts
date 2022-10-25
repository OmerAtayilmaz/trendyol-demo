import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { URI } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userList:string=URI+"user";

  constructor(private httpClient:HttpClient) { }  
  getAllUsers(){
   return this.httpClient.get(this.userList);
  }

  getUserById(id:number){
    return this.httpClient.get(`${this.userList}/`+id);
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  private url="http://localhost:8081/api/v1/category";
  constructor(private httpClient:HttpClient) { }
  getCategories(){
    let data= this.httpClient.get(this.url);
    console.log(data);
    return data;
  }
}

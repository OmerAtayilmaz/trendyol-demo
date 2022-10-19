import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url="http://localhost:8081/api/v1/product";
  constructor(private httpClient:HttpClient) { }
  getProducts(){return this.httpClient.get(this.url);}
}

import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { URI } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url=URI+"product";
  constructor(private httpClient:HttpClient) { }
  getProducts(){return this.httpClient.get(this.url);}

}

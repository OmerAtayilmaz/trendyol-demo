import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  private url="localhost:8081/api/v1/category";

  constructor(private httpClient:HttpClient) { }

  ngOnInit(): void {
  }
  

}

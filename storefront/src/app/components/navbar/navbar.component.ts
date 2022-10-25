import { templateSourceUrl } from "@angular/compiler";
import {Component, OnInit} from "@angular/core";
@Component({
    selector:"navbar", //<navbar></navbar>
    //selector:".products" //<div class="products"></div>
    //same of id
   
   templateUrl:"./navbar.component.html"
})
export class NavbarComponent implements OnInit{
    linkList:any[]=[
        { name:"Anasayfa", link:"/"},
        { name:"Categories",link:"/category"},
        {name:"Users",link:"/user"}
    ];
    constructor(){}
    ngOnInit():void{}
}
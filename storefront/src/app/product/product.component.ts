import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit {
  pList:any;
  constructor(private pService:ProductService) { }

  ngOnInit(): void {
    this.pService.getProducts().subscribe(res=>this.pList=res);
  }

}

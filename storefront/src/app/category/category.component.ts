import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../services/category.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})
export class CategoryComponent implements OnInit {
  categoryList:any;  
  title:string="Data Comes From TS!";
  constructor(private cService:CategoryService) { }

  /* bu component ilk acıldıgında calısacak fonksıyon */
  ngOnInit(): void {
    this.cService.getCategories().subscribe(res=>{
      this.categoryList=res;
    });
  }
  setTitle(){
    this.title="HUH AWESOMEEEE!";
  }

}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})
export class CategoryComponent implements OnInit {
  title:string="Data Comes From TS!";
  constructor() { }

  /* bu component ilk acıldıgında calısacak fonksıyon */
  ngOnInit(): void {
    this.setTitle();
  }
  setTitle(){
    this.title="HUH AWESOMEEEE!";
  }

}

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
import { UserDetailComponent } from './user-detail/user-detail.component';
import { UserComponent } from './user/user.component';
const routes: Routes = [
  {
    path:'category',
    component:CategoryComponent
  },{
    path:'product',
    component:ProductComponent
  },{
    path:'',
    component:HomeComponent
  },{
    path:"user",
    component:UserComponent
  },{
    path:"user/:id",
    component:UserDetailComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";
import { CategoryComponent } from './category/category.component';
import { ProductComponent } from './product/product.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    ProductComponent,
    HeaderComponent/* auto tanımlandı after: ng g component Category */
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]/* başlangıç component */
})
export class AppModule { }

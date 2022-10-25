import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";
import { CategoryComponent } from './category/category.component';
import { ProductComponent } from './product/product.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import {ContentModule} from "./content/content.module";
import { UserDetailComponent } from './user-detail/user-detail.component';
import {NavbarComponent} from "./components/navbar/navbar.component";
@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    ProductComponent,
    HeaderComponent,
    HomeComponent,
    UserComponent,
    UserDetailComponent/* auto tanımlandı after: ng g component Category */,
    NavbarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ContentModule
  ],
  providers: [],
  bootstrap: [AppComponent]/* başlangıç component */
})
export class AppModule { }

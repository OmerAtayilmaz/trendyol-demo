import { Component } from '@angular/core';

/* component oldugunu belirtir. */
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',/* componenting htmli */
  styleUrls: ['./app.component.scss']/* componenting scssi */
})
export class AppComponent {/* veri yonetimi */
  title = 'storefront';
}

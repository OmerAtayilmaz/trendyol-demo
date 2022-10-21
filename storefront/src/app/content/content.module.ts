import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ContentListComponent } from './content-list/content-list.component';



@NgModule({/* modül dosyası */
  declarations: [
    ContentListComponent/* aynı klasörde olduğunu bildiği için buraya auto ekledi veya --module=modulname eklenmeli componenta */
  ],
  exports:[ContentListComponent],
  imports: [
    CommonModule
  ]
})
export class ContentModule { }

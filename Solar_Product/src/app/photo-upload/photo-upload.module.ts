import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PhotoUploadRoutingModule } from './photo-upload-routing.module';
import { PhotoUploadComponent } from './photo-upload.component';


@NgModule({
  declarations: [
    PhotoUploadComponent
  ],
  imports: [
    CommonModule,
    PhotoUploadRoutingModule
  ]
})
export class PhotoUploadModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PhotoUploadComponent } from './photo-upload.component';

const routes: Routes = [{ path: '', component: PhotoUploadComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PhotoUploadRoutingModule { }

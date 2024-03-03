import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StatusUpdateRoutingModule } from './status-update-routing.module';
import { StatusUpdateComponent } from './status-update.component';


@NgModule({
  declarations: [
    StatusUpdateComponent
  ],
  imports: [
    CommonModule,
    StatusUpdateRoutingModule
  ]
})
export class StatusUpdateModule { }

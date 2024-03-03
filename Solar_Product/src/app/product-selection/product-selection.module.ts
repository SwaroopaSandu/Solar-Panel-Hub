import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductSelectionRoutingModule } from './product-selection-routing.module';
import { ProductSelectionComponent } from './product-selection.component';


@NgModule({
  declarations: [
    ProductSelectionComponent
  ],
  imports: [
    CommonModule,
    ProductSelectionRoutingModule
  ]
})
export class ProductSelectionModule { }

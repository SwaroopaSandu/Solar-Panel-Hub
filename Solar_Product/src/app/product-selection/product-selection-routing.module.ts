import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductSelectionComponent } from './product-selection.component';

const routes: Routes = [{ path: '', component: ProductSelectionComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductSelectionRoutingModule { }

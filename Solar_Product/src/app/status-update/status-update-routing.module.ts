import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StatusUpdateComponent } from './status-update.component';

const routes: Routes = [{ path: '', component: StatusUpdateComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class StatusUpdateRoutingModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
//  {path: "", redirectTo:"/dashboard", pathMatch: "full"},
 { path: 'login', loadChildren: () => import('./login/login.module').then(m => m.LoginModule) },
 { path: 'register', loadChildren: () => import('./register/register.module').then(m => m.RegisterModule) },
 { path: 'dashboard', loadChildren: () => import('./dashboard/dashboard.module').then(m => m.DashboardModule) },
 { path: 'orders', loadChildren: () => import('./orders/orders.module').then(m => m.OrdersModule) },
 { path: 'customers', loadChildren: () => import('./customers/customers.module').then(m => m.CustomersModule) },
 { path: 'product-selection', loadChildren: () => import('./product-selection/product-selection.module').then(m => m.ProductSelectionModule) },
 { path: 'reports', loadChildren: () => import('./reports/reports.module').then(m => m.ReportsModule) }, 
 { path: 'status-update', loadChildren: () => import('./status-update/status-update.module').then(m => m.StatusUpdateModule) },
 { path: 'payment-gateway', loadChildren: () => import('./payment-gateway/payment-gateway.module').then(m => m.PaymentGatewayModule) },
{ path: 'service-request', loadChildren: () => import('./service-request/service-request.module').then(m => m.ServiceRequestModule) },
{ path: 'photo-upload', loadChildren: () => import('./photo-upload/photo-upload.module').then(m => m.PhotoUploadModule) },
{ path: 'landingpage', loadChildren: () => import('./landingpage/landingpage.module').then(m => m.LandingpageModule) },
{ path: 'logout', loadChildren: () => import('./logout/logout.module').then(m => m.LogoutModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

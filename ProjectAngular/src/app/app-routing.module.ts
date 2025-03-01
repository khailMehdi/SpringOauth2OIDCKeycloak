import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductComponent} from './ui/product/product.component';
import {CustomersComponent} from './ui/customers/customers.component';

const routes: Routes = [
  {path: 'product', component: ProductComponent},
  {path: 'customer', component: CustomersComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

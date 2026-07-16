import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashComponent } from './admin-dash/admin-dash.component';
import { AppointmentComponent } from './appointment/appointment.component';

const routes: Routes = [
  {path:'admin',component:AdminDashComponent},
  {path:'appointmentlist',component:AppointmentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

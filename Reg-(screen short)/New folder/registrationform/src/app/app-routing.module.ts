import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { NotfountComponent } from './notfount/notfount.component';
import { RegistrationComponent } from './registration/registration.component';
import { ViewdatabaseComponent } from './viewdatabase/viewdatabase.component';

const routes: Routes = [
  {path:'',redirectTo:'registrations',pathMatch:'full'},
  {path:'logins',component:LoginComponent},
  {path:'registrations',component:RegistrationComponent},
  {path:'home',component:HomepageComponent},
  {path:'data',component:ViewdatabaseComponent},
  {path:'**',component:NotfountComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

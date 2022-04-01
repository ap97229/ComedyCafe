import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ComedianComponent } from './comedian/comedian.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  { path: 'comedian', component: ComedianComponent },
  { path: 'user', component: UserComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

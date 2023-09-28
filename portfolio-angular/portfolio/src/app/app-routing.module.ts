import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './componentes/header/header.component';
import { HomeComponent } from './componentes/home/home.component';
import { AboutComponent } from './componentes/about/about.component';
import { WorkComponent } from './componentes/work/work.component';
import { ContactComponent } from './componentes/contact/contact.component';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';

const routes: Routes = [
  {path:"header", component:HeaderComponent},
  {path:"home", component:HomeComponent},
  {path:"about", component:AboutComponent},
  {path:"work", component:WorkComponent},
  {path:"contact", component:ContactComponent},
  {path:"portfolio", component:PortfolioComponent},
  {path:"**" ,redirectTo:"portfolio"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

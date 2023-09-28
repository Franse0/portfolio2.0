import { Component, OnInit } from '@angular/core';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit{

  datos:any;

  constructor(private educacionService:EducacionService){}
  
  ngOnInit(): void {
    this.educacionService.obtenerDatos().subscribe(data=>{
      this.datos=data;
      console.log(this.datos)
    })
  }
;


}

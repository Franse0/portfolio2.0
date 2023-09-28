import { Component, OnInit } from '@angular/core';
import { TrabajoService } from 'src/app/servicios/trabajo.service';

@Component({
  selector: 'app-work',
  templateUrl: './work.component.html',
  styleUrls: ['./work.component.css']
})
export class WorkComponent implements OnInit{
  datos:any;

  constructor(private trabajoService:TrabajoService){};

  ngOnInit(): void {
    this.trabajoService.obtenerDatos().subscribe(data=>{
      console.log(data)
      this.datos=data;
    });
  }

}

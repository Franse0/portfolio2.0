import { Component, OnInit } from '@angular/core';
import { UsuarioService } from 'src/app/servicios/usuario.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  misDatos:any;

  constructor(private usuarioService:UsuarioService){};

  ngOnInit(): void {
    this.usuarioService.obtenerdatos().subscribe(data=>{
      console.log(data)
      this.misDatos=data;
      console.log(this.misDatos)
    });
  }
 
}

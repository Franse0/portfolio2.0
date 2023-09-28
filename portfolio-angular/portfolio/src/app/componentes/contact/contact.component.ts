import { Component, ViewChild, ElementRef, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Consulta } from '../../modelos/Consulta';
import { ConsultaService } from 'src/app/servicios/consulta.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit{
  formMensaje:FormGroup;
  
  constructor(private formBuilder:FormBuilder, private consultaService:ConsultaService){
    this.formMensaje = this.formBuilder.group({
      nombre:["",[]],
      mail:["",[]],
      consulta:["",[]]
    })
  }



  consultar(){
    // if(consulta.nombre||consulta.mail||consulta.mensaje)return;
    const consulta:Consulta={
      nombre:this.formMensaje.value.nombre,
      mail:this.formMensaje.value.mail,
      consulta:this.formMensaje.value.consulta
    }

    if(!consulta.nombre||!consulta.mail||!consulta.consulta)return alert("completar campos");
    if(consulta.nombre||consulta.mail||consulta.consulta){
      this.consultaService.realizarConsulta(consulta).subscribe(
        
      )
        alert("Mensaje Enviado ✔")
        this.formMensaje.reset()
    }
  }

ngOnInit(): void {

  this.consultaService.obtenerDatos().subscribe(data=>{
    console.log(data)
  })
}

}
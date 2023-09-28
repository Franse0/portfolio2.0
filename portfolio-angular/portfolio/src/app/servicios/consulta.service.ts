import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Consulta } from '../modelos/Consulta';

@Injectable({
  providedIn: 'root'
})
export class ConsultaService {
    // url:String="http://62.72.26.208:8080/";
    // url:String="https://62.72.26.208:8080/api/";
    url:String="https://www.franciscomarinprog.com/api/";


  // url:String="http://localhost:8080/api/"

  constructor(private http:HttpClient) { }

  obtenerDatos():Observable<any>{
    return this.http.get(this.url+"consultas")
  }

  realizarConsulta(consulta:Consulta):Observable<Consulta>{
    return this.http.post<Consulta>(this.url+"consulta", consulta);
  }
}

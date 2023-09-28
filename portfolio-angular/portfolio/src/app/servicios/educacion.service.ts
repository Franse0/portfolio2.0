import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {

  // url:String="http://62.72.26.208:8080/api/";
  url:String="https://www.franciscomarinprog.com/api/";

  // url:String="http://localhost:8080/api/"
  constructor(private http:HttpClient) { }

  obtenerDatos():Observable<any>{
    return this.http.get(this.url+"educaciones");
  }
}

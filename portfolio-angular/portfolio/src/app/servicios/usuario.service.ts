import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  // url:String="http://62.72.26.208:8080/"
  // url:String="https://62.72.26.208:8080/api/";
  url:String="https://www.franciscomarinprog.com/api/";

  // url:String="http://localhost:8080/api/"

  constructor(private http:HttpClient) { }

  obtenerdatos():Observable<any>{
    return this.http.get(this.url+"usuarios");
  }
}

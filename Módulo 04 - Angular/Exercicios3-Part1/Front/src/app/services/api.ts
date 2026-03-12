import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cep } from '../shared/models/cep.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class Api {

  private url:string = 'viacep.com.br/ws/';

  constructor(private http: HttpClient){};

  buscarPorCep(cep: string):Observable<Cep>{
    return this.http.get<Cep>(`${this.url}${cep}`+'json/') ;
  }
  
}

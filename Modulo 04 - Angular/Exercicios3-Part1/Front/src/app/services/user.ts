import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../shared/models/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private url:string= 'http://localhost:3000/Usuarios';

  constructor(private http: HttpClient){};

  listar():Observable<User[]>{
    return this.http.get<User[]>(this.url);
  }

  cadastrar(user: User):Observable<User>{
    return this.http.post<User>(this.url, JSON.stringify(user));
  }

  selecionar(id: string):Observable<User>{
    return this.http.get<User>(`${this.url}${id}`);
  }

  alterar(user:User):Observable<User>{
    return this.http.put<User>(`${this.url}${user.id}`, JSON.stringify(user));
  }

  remover(id: string):Observable<User>{
    return this.http.delete<User>(`${this.url}${id}`)
  }
  
}

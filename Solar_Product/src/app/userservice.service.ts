import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  private baseUrl = "http://localhost:8080/api/solar/login";

  constructor(private httpClient: HttpClient) { }


 loginUser(user:User):Observable<object>{
  console.log(user);
  return this.httpClient.post(`${this.baseUrl}`,user);
 }

}

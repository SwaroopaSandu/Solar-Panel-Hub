import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserserviceService } from '../userservice.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

 
  user:User = new User();


  username:String="";
  email:String="";
  password:String="";

  constructor(private router: Router,private http: HttpClient,private loginuserservice: UserserviceService){
  }

  ngOnInit():void{

  }

 
  userLogin(){

   this.loginuserservice.loginUser(this.user).subscribe(data=>{
    this.router.navigateByUrl('/dashboard')},
    error=>alert("Incorrect Username or Password"));
   }


  register() {
  
    let bodyData = {
      "username" : this.username,
      "email" : this.email,
      "password" : this.password
    };
    this.http.post("http://localhost:8080/api/solar/register",bodyData).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("User Registered Successfully");
        this.username = '';
        this.email = '';
       this.password  = ''
    });
  }
save()
  {
        this.register();
  }


}



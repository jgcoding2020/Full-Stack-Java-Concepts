import { Component } from '@angular/core';
import { Login } from './login';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  model: Login;
  constructor(){
    this.model = new Login(5, "qwerty");
  }

  onSubmit(loginForm: any){
    console.log(loginForm.value);
    alert("User id: " + this.model.id +" Password: " + this.model.pwd);
  }
}

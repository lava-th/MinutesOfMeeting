import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { delay } from 'rxjs/operators';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  
  constructor(public loginService:LoginService) { 

  }

  ngOnInit(): void {
  }
  

  async submitLoginForm(loginForm: any) {
    console.log("LoginForm Object Data : ");
    console.log(loginForm);

    const t = await this.loginService.loginAsUser(loginForm).pipe(delay(1000)).toPromise();

    console.log('the user is ' + JSON.stringify(t));
  }

}

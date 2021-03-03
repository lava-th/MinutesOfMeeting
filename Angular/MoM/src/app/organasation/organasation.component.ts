import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-organasation',
  templateUrl: './organasation.component.html',
  styleUrls: ['./organasation.component.css']
})
export class OrganasationComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  registeruser(regForm: any) {
    console.log("User Registration Details:");
    console.log(regForm);


  }
}

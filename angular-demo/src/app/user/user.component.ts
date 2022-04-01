import { Component, OnInit } from '@angular/core';
import { AppService } from '../app.service'

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  comedians = []

  constructor(private appService: AppService) { }

  async ngOnInit(): Promise<void> {
    await this.appService.getComedians().then(res=>{
      this.comedians = res
    })
  }

}

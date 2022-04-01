import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/environment'


@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private httpClient: HttpClient) { }

  async getComedians(): Promise<any> {
    const comediansUrl = `${environment.cafeUrl}/comedians`;

    return await this.httpClient
      .get(comediansUrl)
      .toPromise();
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Account } from './models';

@Injectable({ providedIn: 'root' })
export class AccountApi {
  private readonly base = environment.apiBaseUrl;
  constructor(private readonly http: HttpClient) {}

  create(body: Partial<Account>) {
    return this.http.post<Account>(`${this.base}/api/accounts/saveAccount`, body);
  }

  getById(id: number) {
    return this.http.get<Account>(`${this.base}/api/accounts/getAccount/${id}`);
  }
}

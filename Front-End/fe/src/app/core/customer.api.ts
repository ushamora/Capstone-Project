import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Customer } from './models';

@Injectable({ providedIn: 'root' })
export class CustomerApi {
  private base = environment.apiBaseUrl;
  constructor(private http: HttpClient) {}

  create(body: Partial<Customer>) {
    return this.http.post<Customer>(`${this.base}/api/customer/createCustomer`, body);
  }

  getById(id: number) {
    return this.http.get<Customer>(`${this.base}/api/customer/getCustomer/${id}`);
  }
}

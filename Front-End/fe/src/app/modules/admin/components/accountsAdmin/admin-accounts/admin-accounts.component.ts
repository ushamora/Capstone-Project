import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { AccountApi } from '../../../../../core/account.api';
import { Account } from '../../../../../core/models';

@Component({
  selector: 'app-admin-accounts',
  standalone: true,
  imports: [FormsModule, CommonModule],   // ✅ Needed for [(ngModel)]
  templateUrl: './admin-accounts.component.html',
  styleUrls: ['./admin-accounts.component.css']
})
export class AdminAccountsComponent implements OnInit {
  accounts: Account[] = [];
  selected?: Account;

  constructor(private readonly service: AccountApi) {}

  ngOnInit() {
    this.loadAll();
  }

  loadAll() {
    // ✅ fetch one account (ID=1 by default) and wrap into array for the table
    this.service.getById(this.selected?.id ?? 1)
      .subscribe((data: Account) => this.accounts = [data]);
  }

  select(account: Account) {
    this.selected = { ...account };
  }

  save() {
    if (this.selected) {
      // ✅ Only one create() method is available
      this.service.create(this.selected)
        .subscribe(() => this.loadAll());  // call loadAll(), not loadAccounts()
      this.selected = undefined;
    }
  }
}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { DepositComponent} from './deposit.component';
import { AccountComponent} from './account.component';


@NgModule({
  declarations: [
    AppComponent, AccountComponent, DepositComponent
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

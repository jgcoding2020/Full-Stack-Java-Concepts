import { Component} from '@angular/core';

@Component({
    selector: "account",
    templateUrl: "./account.component.html"
})

export class AccountComponent{

    balance = 0;
    displayBalance(deposit: any){
        this.balance += deposit;
    }
}
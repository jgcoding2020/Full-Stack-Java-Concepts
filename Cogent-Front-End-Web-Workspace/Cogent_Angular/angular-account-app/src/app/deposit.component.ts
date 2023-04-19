import { Component, Output, EventEmitter } from '@angular/core';

@Component({
    selector: "deposit",
    templateUrl: "./deposit.component.html"
})

export class DepositComponent{

    @Output()
    valueChange = new EventEmitter();
    depositAmount = 0;
    deposit(data: any){
        this.depositAmount = data.amount;
        this.valueChange.emit(this.depositAmount);
    }
}
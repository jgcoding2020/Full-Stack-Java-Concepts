import { Component } from "@angular/core";

@Component({
    selector: 'item',
    templateUrl: './item.component.html'
})

export class ItemComponent {
    itemNo: number = 1;
    itemName: string = "car";
    itemPrice: number = 32000;
    itemDescription: string = "4 door vehicle with good gas mileage";
}
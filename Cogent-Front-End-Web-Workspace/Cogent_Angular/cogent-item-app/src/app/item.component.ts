import { Component } from "@angular/core";

@Component({
    selector: 'item',
    templateUrl: './item.component.html',
    styles: ['div {margin-bottom: 15px; font-size: 25px; display: inline-block; margin: auto;}', 'img {display: inline-block}']
})

export class ItemComponent {
    itemNo: number = 2;
    itemName: string = "truck";
    itemPrice: number = 32000;
    imageUrl: string = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLF0R4RlvS2OGaVDLlwvVP0uT_sQPJkQ0SXw&usqp=CAU";

    toDisplay = true;

    delete() {
        this.toDisplay = !this.toDisplay;
    }

    toUpdate = false;

    update() {
        this.toUpdate = !this.toUpdate;
    }
}
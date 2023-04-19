import { Component } from "@angular/core";

@Component({
    selector: 'product',
    templateUrl: './product.component.html',
    styles: ['div {margin-bottom: 15px; font-size: 25px; display: inline-block; margin: auto;}', 'img {display: inline-block}']
})

export class ProductComponent {

    itemNo: number = 1001;
    itemName: string = "4k tv";
    itemPrice: number = 1199.99;
    imageUrl: string = "data:image/jpeg;base64,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";

    toDisplay = true;

    delete() {
        this.toDisplay = !this.toDisplay;
    }

    toUpdate = false;

    update() {
        this.toUpdate = !this.toUpdate;
    }
}
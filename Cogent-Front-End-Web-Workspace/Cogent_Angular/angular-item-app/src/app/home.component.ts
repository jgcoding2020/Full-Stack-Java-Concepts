import { Component } from "@angular/core";

@Component({
    selector: 'home',
    templateUrl: './home.component.html',
    styles: ['div {margin-bottom: 15px; font-size: 25px; display: inline-block; margin: auto;}', 'img {display: inline-block}']
})

export class HomeComponent {
    itemNo: number = 5;
    itemName: string = "home";
    itemPrice: number = 300000;
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

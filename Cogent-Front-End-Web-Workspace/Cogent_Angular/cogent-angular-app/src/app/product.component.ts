import { Component } from "@angular/core";

@Component({
    selector: 'product',
    templateUrl: './product.component.html' 
})

export class ProductComponent {

    productNo: number = 1;
    productName: string = "4k television";
    productPrice: number = 1199.99;
}
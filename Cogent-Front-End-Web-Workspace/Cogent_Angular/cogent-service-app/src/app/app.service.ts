import { Injectable } from "@angular/core";

@Injectable({
    providedIn:'root'
})

export class ProductService {

    constructor(){

    }

    getData(){
        return [
            {'id': 1, 'title': 'shoes', 'price': 150, 'stock': 11, 'showMessage': true},
            {'id': 2, 'title': 't-shirt', 'price': 20, 'stock': 12, 'showMessage': true},
            {'id': 3, 'title': 'pants', 'price': 50, 'stock': 7, 'showMessage': true},
            {'id': 4, 'title': 'sweater', 'price': 40, 'stock': 9, 'showMessage': true},
            {'id': 5, 'title': 'hat', 'price': 30, 'stock': 10, 'showMessage': true},
            {'id': 6, 'title': 'suite', 'price': 1000, 'stock': 10, 'showMessage': true},
            {'id': 7, 'title': 'shorts', 'price': 30, 'stock': 10, 'showMessage': true},
            {'id': 8, 'title': 'watch', 'price': 6000, 'stock': 10, 'showMessage': true},
            {'id': 9, 'title': 'necklace', 'price': 10000, 'stock': 10, 'showMessage': true},
            {'id': 10, 'title': 'bracelet', 'price': 4000, 'stock': 10, 'showMessage': true},
          ]; 
    }
}
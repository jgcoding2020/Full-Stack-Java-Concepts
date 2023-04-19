import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{

  products = [] as any;
  title = 'products';

  
  ngOnInit(): void {
        
    this.products = this.getProduct();
  }

  getProduct(){

    return [
      {'id': 1, 'title': 'shoes', 'price': 75, 'stock': 11},
      {'id': 2, 'title': 't-shirt', 'price': 20, 'stock': 12},
      {'id': 3, 'title': 'pants', 'price': 50, 'stock': 7},
      {'id': 4, 'title': 'sweater', 'price': 40, 'stock': 9},
      {'id': 5, 'title': 'hat', 'price': 30, 'stock': 10},
    ]
  }
}

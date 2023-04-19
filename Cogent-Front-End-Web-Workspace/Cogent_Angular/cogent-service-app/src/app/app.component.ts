import { Component, OnInit } from '@angular/core';
import { ProductService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  products: any;
  title = "product information";
  constructor(private service: ProductService){

  }

  ngOnInit(): void {
    
    this.products = this.service.getData();
    for (let i = 0; i < this.products.length; i++){
      if (this.products[i].price < 100){
        this.products[i].showMessage = false;
      }
    }
  }
}

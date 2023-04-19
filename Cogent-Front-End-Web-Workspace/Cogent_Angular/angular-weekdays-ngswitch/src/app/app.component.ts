import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  items: Item[] = [{name: 'One', value: 1}, {name: 'Two', value: 2}, {name: 'Three', value: 3}, {name: 'Four', value: 4}, {name: 'Five', value: 5}, {name: 'Six', value: 5}, {name: 'Seven', value: 7}];
  selectedValue1: number = 0;
}

class Item{
  name: string = "";
  value: number = 0;
}
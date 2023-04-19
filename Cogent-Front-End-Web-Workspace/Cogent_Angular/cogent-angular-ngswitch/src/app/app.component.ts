import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  title: string = 'ng switch examples';
  num: number = 0;

  items: Item[] = [{name: 'One', value: 1}, {name: 'Two', value: 2}, {name: 'One', value: 1}, {name: 'Four', value: 4}, {name: 'Two', value: 2}];
  selectedValue1: string = "one";
}

class Item{
  name: string = "";
  value: number = 0;
}
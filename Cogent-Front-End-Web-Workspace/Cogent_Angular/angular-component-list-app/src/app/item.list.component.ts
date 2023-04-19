import { Component } from "@angular/core";
import { ItemEntity } from "./item.entity"

@Component({
    selector: "item-list",
    templateUrl: "./item.list.component.html"
})

export class ItemListComponent{

    public items:Array<ItemEntity>;
    constructor(){
        var item1 = new ItemEntity(1001, "pencil", 1.00);
        var item2 = new ItemEntity(1002, "pen", 2.00);
        var item3 = new ItemEntity(1003, "paper", 3.00);
        var item4 = new ItemEntity(1004, "eraser", 4.00);
        var item5 = new ItemEntity(1005, "scissors", 5.00);
        this.items = [item1, item2, item3, item4, item5];
    }
}
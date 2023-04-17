import * as shapes from "./script";

let rectangle: shapes.Rectangle = {
    calcRect(length:number,width:number):number{
        return length*2 + width*2;
    }
} 

let triangle: shapes.Triangle = {
    calcTri(height:number, base:number):number {
        return (height*base)/2;
    }
}

console.log("Rectangle area is: " + rectangle.calcRect(4,8));
console.log("Triangle area is: " + triangle.calcTri(3,6));
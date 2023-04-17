interface Rectangle {
    calcRect:(length:number,width:number)=>number;
}

let rectangle: Rectangle = {
    calcRect(length:number,width:number):number{
        return length*2 + width*2;
    }
} 

console.log(rectangle.calcRect(2,2));

//do triangle next

interface Triangle {
    calcTri:(height:number,base:number)=>number;
}

let triangle: Triangle = {
    calcTri(height:number, base:number):number {
        return (height*base)/2;
    }
}

console.log(triangle.calcTri(2,2));
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var rectangle = {
    calcRect: function (length, width) {
        return length * 2 + width * 2;
    }
};
var triangle = {
    calcTri: function (height, base) {
        return (height * base) / 2;
    }
};
console.log("Rectangle area is: " + rectangle.calcRect(4, 8));
console.log("Triangle area is: " + triangle.calcTri(3, 6));

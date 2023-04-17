var rectangle = {
    calcRect: function (length, width) {
        return length * 2 + width * 2;
    }
};
console.log(rectangle.calcRect(2, 2));
var triangle = {
    calcTri: function (height, base) {
        return (height * base) / 2;
    }
};
console.log(triangle.calcTri(2, 2));

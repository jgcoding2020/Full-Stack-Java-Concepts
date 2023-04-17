var product = {
    id: 1,
    name: "Cogent",
    price: 1000,
    calculate: function (qty) {
        return this.price * qty;
    }
};
console.log(product.calculate(10));

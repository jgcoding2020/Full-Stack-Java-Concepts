interface IProduct {
    id: number,
    name: string,
    price: number,
    calculate:(qty:number)=>number;
}

let product: IProduct = {
    id: 1,
    name: "Cogent",
    price: 1000,
    calculate(qty: number): number{
        return this.price * qty;
    }
}

console.log(product.calculate(10));
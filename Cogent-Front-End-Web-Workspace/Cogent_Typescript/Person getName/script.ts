class Person {
    firstName: string = "";
    lastName: string = "";

    constructor (firstName: string, lastName: string){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getName(): string{
        return this.firstName + " " + this.lastName;
    }
}

let p1 = new Person("Joshua", "Gardner");
console.log(p1);
console.log(p1.getName());
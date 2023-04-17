var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = "";
        this.lastName = "";
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.getName = function () {
        return this.firstName + " " + this.lastName;
    };
    return Person;
}());
var p1 = new Person("Joshua", "Gardner");
console.log(p1);
console.log(p1.getName());

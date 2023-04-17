var Employee = /** @class */ (function () {
    function Employee(id, firstName, lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Employee.prototype.showInfo = function () {
        console.log("Employee id: " + this.id + ", first name: " + this.firstName + ", last name: " + this.lastName);
    };
    return Employee;
}());
var employee = new Employee(1, "Joshua", "Gardner");
employee.showInfo();

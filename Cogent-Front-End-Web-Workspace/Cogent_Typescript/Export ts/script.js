"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = exports.age = void 0;
exports.age = 35;
var Employee = /** @class */ (function () {
    function Employee(id, name) {
        this.empId = id;
        this.empName = name;
    }
    Employee.prototype.displayEmployee = function () {
        console.log("Employee id: " + this.empId + " Employee name: " + this.empName);
    };
    return Employee;
}());
exports.Employee = Employee;

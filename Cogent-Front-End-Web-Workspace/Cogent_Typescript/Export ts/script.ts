export let age:number = 35;
export class Employee {
    empId: number;
    empName: string;
    constructor(id: number, name: string){
        this.empId = id;
        this.empName = name;
    }

    displayEmployee(){
        console.log("Employee id: " + this.empId + " Employee name: " + this.empName);
    }
}
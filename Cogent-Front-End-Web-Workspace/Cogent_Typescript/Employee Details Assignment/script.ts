class Employee {
    id:number;
    firstName:string;
    lastName:string;

    constructor(id:number, firstName:string, lastName:string){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
    }

    showInfo(){
        console.log("Employee id: " + this.id + ", first name: " + this.firstName + ", last name: " + this.lastName);
    }
}

let employee = new Employee(1, "Joshua", "Gardner");

employee.showInfo();
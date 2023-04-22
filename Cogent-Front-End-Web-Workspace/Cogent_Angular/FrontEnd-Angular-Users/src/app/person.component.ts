import {Component, OnInit} from '@angular/core';
import { PersonService } from './person-service';
import { Person } from './person';

@Component({
    selector: 'person-app',
    templateUrl: 'person.component.html'
})

export class PersonComponent implements OnInit {

    people: Person[];
    personForm: Person;
    currPerson: Person;
    currPersonID: number;
    toggle: boolean=false;

    constructor(private personService: PersonService) 
    {
        this.people = [];
        this.personForm = new Person();
        this.currPerson = new Person();
        this.currPersonID = 0;
    }

    ngOnInit(): void {
        this.personService.getPeople().subscribe((data: Person[])=>{
            console.log(data);
            this.people = data;
        })
    }

    onSubmitAdd(addPersonForm: any)
    {
        this.currPerson.personId = this.currPersonID;
        this.currPerson.personName = addPersonForm.value.name;
        this.currPerson.personAge = addPersonForm.value.age;
        this.currPerson.personSalary = addPersonForm.value.salary;

        console.log(addPersonForm.value);

        this.personService.addPerson(this.currPerson).subscribe();
    }

    edit(id:number)
    {
        this.currPersonID = id;
        this.toggle = !this.toggle; 
    }

    onSubmitEdit(editPersonForm: any)
    {
        this.currPerson.personId = this.currPersonID;
        this.currPerson.personName = editPersonForm.value.name;
        this.currPerson.personAge = editPersonForm.value.age;
        this.currPerson.personSalary = editPersonForm.value.salary;

        console.log(editPersonForm.value);

        this.toggle=false;
        this.personService.updatePerson(this.currPerson).subscribe();
    }

    delete(id:number)
    {
        console.log(id);
        this.personService.deletePerson(id).subscribe();
    }

    refresh()
    {
        window.location.reload();
    }

    resetForm()
    {
        this.personForm = new Person();
    } 
}
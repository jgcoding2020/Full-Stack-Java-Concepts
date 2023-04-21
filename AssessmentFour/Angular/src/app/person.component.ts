import {Component, OnInit} from '@angular/core';
import { PersonService } from './person-service';
import { Person } from './person';

@Component({
    selector: 'person-app',
    templateUrl: 'person.component.html'
})

export class PersonComponent implements OnInit {
    title = 'user-management-app';

    people: Person[];
    personForm: Person;
    currPerson: Person;
    currPersonID: number;
    toggleEditForm: boolean=false;

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

    add(person: Person)
    {
        this.personService.addPerson(person).subscribe();
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
        this.toggleEditForm = true;   
    }

    onSubmitEdit(addPersonForm: any)
    {
        this.currPerson.personId = this.currPersonID;
        this.currPerson.personName = addPersonForm.value.name;
        this.currPerson.personAge = addPersonForm.value.age;
        this.currPerson.personSalary = addPersonForm.value.salary;

        console.log(addPersonForm.value);

        this.toggleEditForm=false;
        this.personService.updatePerson(this.currPerson).subscribe();
    }

    delete(id:number)
    {
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
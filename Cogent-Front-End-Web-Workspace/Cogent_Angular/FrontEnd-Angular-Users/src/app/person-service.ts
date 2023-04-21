import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { Person } from './person';

@Injectable({
    providedIn: 'root'
})

export class PersonService {

    private baseUrl = "http://localhost:3306/api";

    constructor(private http: HttpClient){

    }

    addPerson(person: Person): Observable<Person> {
        return this.http.post<Person>(this.baseUrl, person);
    }

    updatePerson(person: Person): Observable<Person> {
        return this.http.put<Person>(this.baseUrl, person);
    }

    getPeople():Observable<Person[]> {
        return this.http.get<Person[]>((`${this.baseUrl}`));
    }
   
    deletePerson(id: number): Observable<Person> {
        return this.http.delete<Person>((`${this.baseUrl}/id=${id}`));
      }
}
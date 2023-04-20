import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book } from './book';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})

export class BookService {

    private baseUrl = "http://localhost:8080/api/books";

    constructor(private http: HttpClient ){

    }

    getBooks(): Observable<Book[]>{
        return this.http.get<Book[]>(`${this.baseUrl}`);
    }
}
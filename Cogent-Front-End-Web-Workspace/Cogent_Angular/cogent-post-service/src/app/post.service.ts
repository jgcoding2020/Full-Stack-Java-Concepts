import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})

export class PostService {

    private url = 'https://jsonplaceholder.typicode.com/posts';

    constructor(private httpClient: HttpClient){

    }

    getPost(){

        return this.httpClient.get(this.url);
    }
}
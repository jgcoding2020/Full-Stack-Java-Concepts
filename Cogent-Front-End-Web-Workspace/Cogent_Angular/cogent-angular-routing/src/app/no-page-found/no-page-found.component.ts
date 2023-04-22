import { Component } from '@angular/core';

@Component ({
    selector: 'no-page-found',
    templateUrl: './no-page-found.component.html'
})

export class NoPageFoundComponent {

    message: string = "No page was found";
}
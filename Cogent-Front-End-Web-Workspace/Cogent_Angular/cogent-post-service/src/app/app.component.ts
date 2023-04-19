import { Component, OnInit } from '@angular/core';
import { PostService } from './post.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{

  posts: any;

  constructor(private service: PostService){

  }

  ngOnInit(): void {
    
    this.service.getPost().subscribe(response => {
      this.posts = response;
    });
  }
}

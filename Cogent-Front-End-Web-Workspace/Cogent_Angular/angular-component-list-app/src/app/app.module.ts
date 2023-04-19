import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ItemComponent } from './item.component';
import { ItemListComponent } from './item.list.component';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent, ItemComponent, ItemListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

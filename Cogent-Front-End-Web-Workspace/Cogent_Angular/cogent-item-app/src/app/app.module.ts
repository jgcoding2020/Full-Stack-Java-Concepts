import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { ProductComponent} from './product.component';
import { ItemComponent} from './item.component';
import { CarComponent} from './car.component';
import { JetComponent} from './jet.component';
import { HomeComponent } from './home.component';

@NgModule({
  declarations: [
    AppComponent, ProductComponent, ItemComponent, CarComponent, JetComponent, HomeComponent
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

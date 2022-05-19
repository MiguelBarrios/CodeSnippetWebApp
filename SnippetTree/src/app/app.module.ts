import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SnippetDisplayComponent } from './components/snippet-display/snippet-display.component';
import { TreeService } from './services/tree.service';
import { HttpClientModule } from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    SnippetDisplayComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    TreeService,
    HttpClientModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

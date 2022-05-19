import { Directory } from './../../models/directory';
import { Component, OnInit } from '@angular/core';
import { TreeService } from 'src/app/services/tree.service';

@Component({
  selector: 'app-snippet-display',
  templateUrl: './snippet-display.component.html',
  styleUrls: ['./snippet-display.component.css']
})
export class SnippetDisplayComponent implements OnInit {


  root: Directory | null = null;
  constructor(private treeService: TreeService) { }

  ngOnInit(): void {
  }

  getTreeByTreeName(){
    this.treeService.getTreeByName("Java").subscribe(
      (success)=> {
        this.root = success;
        console.log("Succes getting request");
        console.log(this.root);
      },
      (error)=>{
        console.error("error on tree request");
      }
    )
  }
}

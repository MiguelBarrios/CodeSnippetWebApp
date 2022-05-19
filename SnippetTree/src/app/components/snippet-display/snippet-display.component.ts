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
    this.loadTree("Java");
  }

  loadSelected(pathstr:string){

    var path = pathstr.split('-');

    //Brute force
    var directories = document.getElementsByClassName('directory');
    for(let i = 0; i < directories.length; ++i){
      let cur = directories[i];
      console.log(cur);
      cur.classList.add('hidden');
    }

    //show correct directories
    let fullPath = path[0];
    document.getElementById(fullPath)?.classList.remove('hidden');

    for(let i = 1; i < path.length; ++i){
      fullPath = fullPath + '-' + path[i].replace(' ', '_');
      console.log(fullPath);
      document.getElementById(fullPath)?.classList.remove('hidden');
    }


  }

  loadTree(treeName:string){
    this.treeService.getTreeByName(treeName).subscribe(
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

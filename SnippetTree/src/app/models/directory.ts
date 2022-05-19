import { Item } from "./item";

export class Directory {
  name: string;
  directories: Directory[];
  files: Item[];
  constructor(name:string="",directories:Directory[] = [], files:Item[] = []){
    this.name = name;
    this.directories = directories;
    this.files = files;
  }
}

import { HttpClient  } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, throwError } from 'rxjs';
import { Directory } from '../models/directory';

@Injectable({
  providedIn: 'root'
})
export class TreeService {

  //http://127.0.0.1:8095/api/trees/Java
  private baseUrl = 'http://127.0.0.1:8095/';
  private url = this.baseUrl + 'api/trees';

  constructor(private http:HttpClient) { }

  getTreeByName(treeName: string){
    var path = this.url + "/" + treeName;
    return this.http.get<Directory>(path)
    .pipe(
      catchError((err: any) => {
        return throwError('Error in http get tree by name request' + err);
      })
    );
  }
}

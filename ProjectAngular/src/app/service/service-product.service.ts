import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Product} from '../Module/Product';


@Injectable({
  providedIn: 'root' // Permet d'injecter ce service globalement
})
export class ServiceProductService {
  private url = 'http://localhost:8888/api/products';

  constructor(private http_: HttpClient) { }

  getProducts(): Observable<Product[]> {
    return this.http_.get<Product[]>(this.url);
  }
}

import {Component, OnInit} from '@angular/core';
import {ServiceProductService} from '../../service/service-product.service';
import {Product} from '../../Module/Product';

@Component({
  selector: 'app-product',
  standalone: false,
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent implements OnInit {
  products : Product[] = [];

  constructor(private serviceProduct_: ServiceProductService) {
  }

  ngOnInit(): void {
    this.serviceProduct_.getProducts().subscribe(
      data => {
        this.products = data;
        console.log('Produits récupérés:', this.products);
      },
      error => console.error('Erreur lors de la récupération des produits:', error)
    );
  }
}

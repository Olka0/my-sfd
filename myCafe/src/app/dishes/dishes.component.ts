import { Component, OnInit } from '@angular/core';
//import { MatSnackBar } from '@angular/material/snack-bar';
import { ELEMENT_DATA } from './dishesData';
/*export interface PeriodicElement {
  id: string;
  name: string;
  description: string;
  price: number;
}*/
@Component({
  selector: 'app-dishes',
  templateUrl: './dishes.component.html',
  styleUrls: ['./dishes.component.css']
})

export class DishesComponent implements OnInit {
  data = ELEMENT_DATA;
 // data.style = 'display:none';
  displayedColumns: string[] = ['id', 'name', 'description', 'price'];


  constructor() {}

  ngOnInit(): void {}
  /*addToCart (product: any) {
    this._snackBar.open(`${product.name} has been added to cart!`);
    console.log(product);
}*/}

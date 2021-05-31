import { Component, OnInit } from '@angular/core';
//import { MatSnackBar } from '@angular/material/snack-bar';
import { data1 } from './data1';
@Component({
  selector: 'app-menulist',
  templateUrl: './menulist.component.html',
  styleUrls: ['./menulist.component.css']
})
export class MenulistComponent implements OnInit {
data = data1;
  constructor( ) {
       }
  ngOnInit(): void {
      }

}


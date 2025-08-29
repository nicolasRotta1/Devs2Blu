import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { NgbNavModule } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-roteamento',
  imports: [RouterOutlet, RouterLink, NgbNavModule, CommonModule],
  templateUrl: './roteamento.html',
  styleUrl: './roteamento.css'
})
export class Roteamento {

}

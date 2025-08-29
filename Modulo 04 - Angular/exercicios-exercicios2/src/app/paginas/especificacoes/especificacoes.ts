import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { NgbNavModule } from '@ng-bootstrap/ng-bootstrap';
@Component({
  selector: 'app-especificacoes',
  standalone: true,
  imports: [CommonModule, NgbNavModule],
  templateUrl: './especificacoes.html',
  styleUrl: './especificacoes.css'
})
export class Especificacoes {
computadores = [
  {
    identificador: 'PC12345',
    marca: 'Dell',
    modelo: 'Inspiron 15',
    cpu: 'Intel Core i7',
    ram: '16GB',
    armazenamento: '512GB SSD',
    gpu: 'NVIDIA GeForce GTX 1660',
    tela: '15.6" Full HD',
    bateria: '4 horas',
    peso: '2.5 kg',
    dimensoes: '35.4 x 24.1 x 2.0 cm'
  }
];

smartphones = [
  {
    identificador: 'SM98765',
    marca: 'Samsung',
    modelo: 'Galaxy S21',
    processador: 'Snapdragon 888',
    ram: '8GB',
    armazenamento: '128GB',
    tela: '6.5" AMOLED',
    camera: 'Traseira tripla de 64MP + 12MP + 5MP',
    bateria: '4500mAh',
    peso: '190g',
    dimensoes: '160.2 x 75.1 x 8.9 mm'
  }
];

tablets = [
  {
    identificador: 'TB54321',
    marca: 'Apple',
    modelo: 'iPad Air',
    processador: 'Apple A14 Bionic',
    ram: '4GB',
    armazenamento: '64GB',
    tela: '10.9" Liquid Retina',
    camera: 'Traseira de 12MP',
    bateria: 'Até 10 horas de navegação na web',
    peso: '458g',
    dimensoes: '247.6 x 178.5 x 6.1 mm'
  }
];


}

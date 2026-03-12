import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex01',
  imports: [FormsModule, CommonModule],
  templateUrl: './ex01.html',
  styleUrl: './ex01.css'
})
export class Ex01 {
 n1?: number;
  n2?: number;
  n3?: number;
  media?: number;
  aprovado:string = 'aprovado';
  reprovado:string = 'reprovado';
  aprovados: number = 0;
  reprovados: number = 0;

  calcularMedia(): void {
    if (this.n1 !== undefined && this.n2 !== undefined && this.n3 !== undefined) {
      this.media = (this.n1 + this.n2 + this.n3) / 3;
      if (this.media >= 6) {
        this.aprovados = (this.aprovados || 0) + 1;
      } else {
        this.reprovados = (this.reprovados || 0) + 1;
      }
      this.n1 = undefined;
      this.n2 = undefined;
      this.n3 = undefined;
    }
  }
}

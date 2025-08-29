import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { SaudacaoPipe } from '../pipes/saudacao-pipe';

@Component({
  selector: 'app-implementar-pipes',
  imports: [CommonModule, SaudacaoPipe],
  templateUrl: './implementar-pipes.html',
  styleUrl: './implementar-pipes.css'
})
export class ImplementarPipes {
  nomes: string[] = ['Nícolas', 'João', 'Maria', 'Ana', 'Pedro'];
  

}

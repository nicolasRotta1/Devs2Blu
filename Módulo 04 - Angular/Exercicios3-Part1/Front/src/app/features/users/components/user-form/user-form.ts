import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatTableModule } from '@angular/material/table';
import {FormGroup, FormControl, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButton } from '@angular/material/button';

@Component({
  selector: 'app-user-form',
  imports: [CommonModule, ReactiveFormsModule, MatTableModule, MatFormFieldModule, MatInputModule],
  styleUrl: './user-form.css',
  templateUrl: './user-form.html'
})
export class UserForm {

  formUsuario = new FormGroup({
    id:             new FormControl<number | null>(null),
    nome:           new FormControl<string>('', { nonNullable: true, validators: [Validators.required] }),
    email:          new FormControl<string>('', { nonNullable: true, validators: [Validators.required, Validators.email] }),
    dataNascimento: new FormControl<Date | null>(null, { validators: [Validators.required] }),
    renda:          new FormControl<number | null>(null, { validators: [Validators.required, Validators.min(0)] }),
    escolaridade:   new FormControl<string>('', { nonNullable: true, validators: [Validators.required] })
  });  

}

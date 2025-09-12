import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserCrud } from "./features/user-crud/user-crud";
import { UserForm } from "./features/users/components/user-form/user-form";

@Component({
  selector: 'app-root',
  imports: [UserForm],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Crud-Usuarios');
}

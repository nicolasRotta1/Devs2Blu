import { Component } from '@angular/core';
import { UserForm } from "../users/components/user-form/user-form";
import { UserList } from "../users/components/user-list/user-list";

@Component({
  selector: 'app-user-crud',
  imports: [UserForm, UserList],
  templateUrl: './user-crud.html',
  styleUrl: './user-crud.css'
})
export class UserCrud {

}

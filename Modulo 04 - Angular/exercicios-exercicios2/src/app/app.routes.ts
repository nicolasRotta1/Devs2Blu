import { Routes } from '@angular/router';
import { Especificacoes } from './paginas/especificacoes/especificacoes';
import { RecursosEspeciais } from './paginas/recursos-especiais/recursos-especiais';
import { PrecoContato } from './paginas/preco-contato/preco-contato';
import { Component } from '@angular/core';
import { PaginaNaoEncontrado } from './paginas/pagina-nao-encontrado/pagina-nao-encontrado';
import { Roteamento } from './roteamento/roteamento';

export const routes: Routes = [
    {path: 'Roteamento', component: Roteamento},
    {path:'especificacoes' ,component: Especificacoes},
    {path:'recursos', component: RecursosEspeciais},
    {path: 'preco-contato', component: PrecoContato},
    {path: '', redirectTo: 'Roteamento', pathMatch: 'full' },
    {path:'**', component: PaginaNaoEncontrado}
];

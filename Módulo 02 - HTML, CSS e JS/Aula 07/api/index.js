// Importar dependências/ pacotes do express
const express = require('express')

//Importar dependências/pacote do CORS
const cors = require('cors');

//Objeto express (Manupular rotas e o servidor)
const app = express();

//Adicionar CORS
app.use(cors());

//Habilitar receber objeto JSON nas requisições
app.use(express.json());


// Referenciar arquivo de rotas
const pessoa = require('./rotas/pessoa')

// Adicionar rotas na aplicação
app.use('/', pessoa);

//Servidor
app.listen(3000);

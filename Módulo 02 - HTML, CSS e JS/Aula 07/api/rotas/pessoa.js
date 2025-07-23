// Importando o pacote/dependência do Express
const express = require('express');

// Criando um objeto Router (gerenciar rotas)
const router = express.Router();

//Vetor para armazenar dados pessoas
let vetor = [
    {id:1, nome:'Alice', idade:23},
    {id:2, nome:'Nicolas', idade:17},
    {id:3, nome:'ETA', idade:223}
];

//Id da pessoa
let id = 4;

//Rota para efetuar uma requisição GET
router.get('/', (req, res) => {
  res.status(200).json(vetor);
  //res.status(201).json({'nome':'Ralf", 'idade':35})
});

//Rota para efetuar uma requisição POST
router.post('/', (req, res) => {
    res.send(req.body);
    // Obter nome e idade
    //const nome = req.body.nome;
    //const idade = req.body.idade
    const {nome, idade} = req.body;
  
    // Validar se o nome e a idade foram disponibilizados
    if(!nome || !idade ){
      res.status(400).json({mensagem:' O nome e a idade são obrigatórias!'});
    }

    // Criar objeto do tipo pessoa/usuario
    //const obj = {'id':id, 'nome':nome, 'idade':idade};
    const obj = {id, nome, idade}

    //Cadastrar no vetor
    vetor.push(obj);

    //Incrementar o id
    id++;

    // Retorno
    res.status(201).json(obj)
});

// Rota para efetuar a requisição PUT
router.put('/:idPessoa', (req, res) => {
  //Extrair o idPessoa
  const idPessoa = parseInt(req.params.idPessoa);

  //Verificar se o idPessoa idPessoa existe no vetor
  const indiceVetor = vetor.findIndex(p => p.id == idPessoa);
  if(indiceVetor === -1){
    res.status(404).json({mensagem:'Pessoa não encontrada'});
  }

  //Extrair nome e idade
  const{nome, idade} = req.body;
  // Validar se o nome e a idade foram disponibilizados
  if(!nome || !idade ){
    res.status(400).json({mensagem:' O nome e a idade são obrigatórias!'});
  }

  // Criar obj com os dados atualizados
  const obj = {'id': idPessoa, nome, idade};

  //Alterar dados do vetor
  vetor[indiceVetor] = obj;

  // Retorna objeto
  res.status(200).json(obj);
})

// Rota para efetuar a requisição Delete
router.delete('/:idPessoa', (req, res) => {
  //Extrair o idPessoa
  const idPessoa = parseInt(req.params.idPessoa);

  //Verificar se o idPessoa idPessoa existe no vetor
  const indiceVetor = vetor.findIndex(p => p.id == idPessoa);
  if(indiceVetor === -1){
    res.status(404).json({mensagem:'Pessoa não encontrada'});
  }

  // Remover dados do vetor
  vetor.splice(indiceVetor, 1)

  // Retorna objeto
  res.status(200).json({mensagem: 'Pessoa removida com sucesso'});
})

//Exportar o objeto router
module.exports = router;


// Id dos campos do formulário
const nomeInput = document.getElementById('nome');
const cepInput = document.getElementById('cep');
const logradouroInput = document.getElementById('logradouro');
const bairroInput = document.getElementById('bairro');
const cidadeInput = document.getElementById('cidade');
const estadoInput = document.getElementById('estado');


// Evento de perder o foco no campo CEP
cepInput.addEventListener('blur', () => { // ocorre quando o usuário clica fora do campo
  const cep = cepInput.value.replace(/\D/g, ''); // tira tudo que não for número

  if (cep.length !== 8) {
    alert("CEP inválido!");
    return;
  }

  fetch(`https://viacep.com.br/ws/${cep}/json/`)
    .then(res => res.json())
    .then(data => {
      if (data.erro) {
        alert("CEP não encontrado!");
        return;
      }

      // retorno da api viacep
      logradouroInput.value = data.logradouro;
      bairroInput.value = data.bairro;
      cidadeInput.value = data.localidade; 
      estadoInput.value = data.uf;
    });
});

//salva os dados
const create = () => {
  const nome = nomeInput.value;
  const cep = cepInput.value;
  const logradouro = logradouroInput.value;
  const bairro = bairroInput.value;
  const cidade = cidadeInput.value;
  const estado = estadoInput.value;

  // retorno doque foi cadastrado
  console.log("Dados cadastrados:", { nome, cep, logradouro, bairro, cidade, estado });

  // limpa os campos do formulário após o cadastro
  nomeInput.value = '';
  cepInput.value = '';
  logradouroInput.value = '';
  bairroInput.value = '';
  cidadeInput.value = '';
  estadoInput.value = '';

  // Envia os dados para a api falsa
  fetch("http://localhost:3000/cep", {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify({ nome, cep, logradouro, bairro, cidade, estado })
})
.then(res => res.json())
.then(data => {
  alert("Cadastro salvo com sucesso!");
  console.log("Salvo:", data);
});
}

const update = () => {
    
}

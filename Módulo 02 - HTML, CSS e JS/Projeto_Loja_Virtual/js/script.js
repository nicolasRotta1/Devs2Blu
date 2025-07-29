
//Possiveis produtos
const nomesProdutos = [
  "Smartphone Galaxy", "Camiseta Preta", "Notebook Gamer", "Livro JavaScript",
  "Fone Bluetooth", "Jaqueta Jeans", "Monitor LED", "Livro de Receitas",
  "Tablet Android", "Calça Jeans", "Smartwatch", "Romance Clássico",
  "Carregador Rápido", "Vestido Floral", "Teclado Mecânico", "Livro de Mistério",
  "Mouse Gamer", "Tênis Esportivo", "Webcam HD", "Livro de Aventura"
];
// Possiveis categorias
const categorias = ['Eletrônicos', 'Roupas', 'Livros'];

// Gera produtos aleatorios automaticamente
function gerarProdutos(qtd) {
  const produtos = [];
  for (let i = 0; i < qtd; i++) {
    //Puxa o array para editar
    produtos.push({
      id: i + 1,
      nome: nomesProdutos[i % nomesProdutos.length],
      categoria: categorias[i % categorias.length],
      estoque: Math.floor(Math.random() * 10) + 1,
      valor: (Math.random() * 100).toFixed(2)
    });
  }
  return produtos;
}
// Informar a quantidade de produtos a serem gerados via parametro
const produtos = gerarProdutos(30);

// Variavel para armazenar os produtos no carrinho
let carrinho = [];

function renderizarProdutos(lista = produtos) {
    // Cria uma div (container) para os produtos
    const container = document.getElementById("produtos-container");
    container.innerHTML = "";
    
    //Para cada produto cria-se uma div(card) com as informações do produto
    lista.forEach(prod => {
        const card = document.createElement("div");
        card.className = "card";

        // Conteúdo fixo (sem o botão)
        card.innerHTML = `
            <h3>${prod.nome}</h3>
            <p>Categoria: ${prod.categoria}</p>
            <p>Preço: R$ ${prod.valor}</p>
            <p>Estoque: ${prod.estoque}</p>
        `;

        // Cria um botão para cada card
        const botao = document.createElement("button");
        // Caso o estoque for maior que 0 o botão e habilitado
        // Caso o estoque for 0 o botão e desabilitado
        if (prod.estoque > 0) {
            botao.textContent = "Adicionar";
            botao.onclick = () => adicionarCarrinho(prod.id);
        } else {
            botao.textContent = "Indisponível";
            botao.disabled = true;
            botao.style.backgroundColor = "#aaa";
            botao.style.cursor = "not-allowed";
        }

        // Adiciona o botão dentro do card
        card.appendChild(botao);

        // Adiciona o card dentro do container
        container.appendChild(card);
    });
}


// Adiciona o produto ao carrinho quando clicado
function adicionarCarrinho(id) {
    const produto = produtos.find(p => p.id === id);
    if (produto && produto.estoque > 0) {
        carrinho.push({ ...produto });
        produto.estoque--; 
        atualizarCarrinho();
        pesquisarProduto(); 
    }
}


function atualizarCarrinho() {
    const lista = document.getElementById("lista-carrinho");
    const totalElem = document.getElementById("total");
    lista.innerHTML = "";

    // Objeto para agrupar produtos por ID
    const agrupado = {};
    let total = 0;

    //Percorre todo o carrinho
    carrinho.forEach(item => {
        if (!agrupado[item.id]) {
            //Ocorre se este id de produto nunca foi adicionado ao carrinho

            //pega tudo do produto e adiciona quantidade
            agrupado[item.id] = { ...item, quantidade: 1 };
        } else {
            //Ocorre se algum produto com esse id ja estiver no carrinho, assim incrementando a quantidade
            agrupado[item.id].quantidade++;
        }
        // incrementa o valor do produto adicionado ao total do carrinho
        total += parseFloat(item.valor);
    });

    //Percorre o objeto agrupado via expressão lambda
    Object.values(agrupado).forEach(item => {
        //Cria um elemento li para cada produto agrupado
        const li = document.createElement("li");
    
        //Vai listar o objeto agrupado e tambem vai adicionar um botão para remover um produto do agrupado
        li.innerHTML = `
            ${item.nome} - ${item.quantidade}x R$ ${item.valor}
            <button onclick="removerDoCarrinho(${item.id})">Remover</button>
        `;
        // Adiciona o li na lista do carrinho
        lista.appendChild(li);
    });
    // Imprime o novo total 
    totalElem.textContent = `Total: R$ ${total.toFixed(2)}`;
}

function limparCarrinho() {
    
    carrinho.forEach(produto => {
        const original = produtos.find(p => p.id === produto.id);
        if (original) original.estoque++;
    });
    carrinho = [];
    atualizarCarrinho();
    renderizarProdutos();
}


function removerDoCarrinho(id) {
    const indice = carrinho.findIndex(p => p.id === id);
    if (indice !== -1) {
        const produtoRemovido = carrinho[indice];
        const original = produtos.find(p => p.id === produtoRemovido.id); 
        if (original) original.estoque++; 
        carrinho.splice(indice, 1);
        atualizarCarrinho();
        renderizarProdutos();
    }
}


function finalizarCompra() {
    //limpa o carrinho
    carrinho = [];
    atualizarCarrinho();
    alert("Compra finalizada!");
}

// Lista todos os produtos com esta categoria
function filtrarCategoria(cat) {
    if (cat === 'todos') renderizarProdutos();
    else renderizarProdutos(produtos.filter(p => p.categoria === cat));
}

function pesquisarProduto() {
    // Pega o termo do elemento pesquisa
    const termo = document.getElementById("pesquisa").value.toLowerCase();

    //Filtra os produtos que tem este termo no nome
    const filtrados = produtos.filter(p => p.nome.toLowerCase().includes(termo));
    renderizarProdutos(filtrados);
}

// Se a pagina por recarregada renderiza todos os produtos novamente
window.onload = () => renderizarProdutos();

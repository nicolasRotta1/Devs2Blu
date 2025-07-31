//Possiveis produtos
/*const nomesProdutos = [
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
    //Puxa o array para adicionar um produto
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
  */


const produtos = [
  // Eletrônicos
  { id: 1, nome: "Smartphone Samsung Galaxy A14", categoria: "Eletrônicos", valor: 1299.90, estoque: 5 },
  { id: 2, nome: "Fone de Ouvido Bluetooth JBL", categoria: "Eletrônicos", valor: 299.90, estoque: 8 },
  { id: 3, nome: "Smart TV LG 50\"", categoria: "Eletrônicos", valor: 2799.99, estoque: 3 },
  { id: 4, nome: "Notebook Acer Aspire 5", categoria: "Eletrônicos", valor: 3499.00, estoque: 4 },
  { id: 5, nome: "Carregador Turbo USB-C", categoria: "Eletrônicos", valor: 89.90, estoque: 15 },
  { id: 6, nome: "Mouse Gamer Redragon", categoria: "Eletrônicos", valor: 159.90, estoque: 10 },
  { id: 7, nome: "Teclado Mecânico Corsair", categoria: "Eletrônicos", valor: 499.90, estoque: 6 },
  { id: 8, nome: "Monitor LED 24\" AOC", categoria: "Eletrônicos", valor: 899.90, estoque: 5 },
  { id: 9, nome: "Webcam Logitech C920", categoria: "Eletrônicos", valor: 359.90, estoque: 7 },
  { id: 10, nome: "Smartwatch Xiaomi Mi Band 7", categoria: "Eletrônicos", valor: 269.90, estoque: 9 },

  // Roupas
  { id: 11, nome: "Camisa Polo Masculina", categoria: "Roupas", valor: 79.90, estoque: 12 },
  { id: 12, nome: "Vestido Longo Feminino", categoria: "Roupas", valor: 149.90, estoque: 6 },
  { id: 13, nome: "Jaqueta Jeans Unissex", categoria: "Roupas", valor: 199.90, estoque: 5 },
  { id: 14, nome: "Tênis Esportivo Nike", categoria: "Roupas", valor: 349.90, estoque: 7 },
  { id: 15, nome: "Boné Estampado", categoria: "Roupas", valor: 49.90, estoque: 9 },
  { id: 16, nome: "Meias Cano Alto (3 pares)", categoria: "Roupas", valor: 39.90, estoque: 20 },
  { id: 17, nome: "Camiseta Básica Branca", categoria: "Roupas", valor: 29.90, estoque: 25 },
  { id: 18, nome: "Calça Jeans Slim", categoria: "Roupas", valor: 139.90, estoque: 11 },
  { id: 19, nome: "Saia Midi Floral", categoria: "Roupas", valor: 99.90, estoque: 8 },
  { id: 20, nome: "Blusa de Tricô Feminina", categoria: "Roupas", valor: 89.90, estoque: 10 },

  // Livros
  { id: 21, nome: "O Pequeno Príncipe", categoria: "Livros", valor: 29.90, estoque: 10 },
  { id: 22, nome: "Dom Casmurro - Machado de Assis", categoria: "Livros", valor: 35.00, estoque: 7 },
  { id: 23, nome: "Aprendendo JavaScript", categoria: "Livros", valor: 69.90, estoque: 4 },
  { id: 24, nome: "Harry Potter e a Pedra Filosofal", categoria: "Livros", valor: 59.90, estoque: 8 },
  { id: 25, nome: "A Arte da Guerra", categoria: "Livros", valor: 24.90, estoque: 11 },
  { id: 26, nome: "O Hobbit", categoria: "Livros", valor: 44.90, estoque: 5 },
  { id: 27, nome: "Código Limpo - Robert C. Martin", categoria: "Livros", valor: 89.90, estoque: 6 },
  { id: 28, nome: "1984 - George Orwell", categoria: "Livros", valor: 39.90, estoque: 9 },
  { id: 29, nome: "O Senhor dos Anéis - A Sociedade do Anel", categoria: "Livros", valor: 69.90, estoque: 6 },
  { id: 30, nome: "O Nome do Vento - Patrick Rothfuss", categoria: "Livros", valor: 59.90, estoque: 4 }
];



// Variavel para armazenar os produtos no carrinho
let carrinho = [];

function renderizarProdutos(lista = produtos) {
    // Cria uma div (container) para os produtos
    const container = document.getElementById("produtos-container");
    container.innerHTML = "";
    
    //Para cada produto cria-se uma div(card) com suas informações
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
        // Se o estoque for maior que 0 o botão e habilitado
        // Senão o botão é desabilitado
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

// Variavel para lembrar em que categoria o usuário está
// Se for null, significa que não há categoria filtrada
let categoriaAtiva = null;


// Adiciona o produto ao carrinho quando clicado
function adicionarCarrinho(id) {
    const produto = produtos.find(p => p.id === id);
    if (produto && produto.estoque > 0) {
        carrinho.push({ ...produto });
        produto.estoque--;
        atualizarCarrinho();

        // Verifica se há um filtro de categoria ativo
        if (categoriaAtiva) {
            const filtrados = produtos.filter(p => p.categoria === categoriaAtiva);
            renderizarProdutos(filtrados);
        } else {
            // Se não, verifica filtro de pesquisa
            const termo = document.getElementById("pesquisa").value.toLowerCase();
            const listaFiltrada = termo
                ? produtos.filter(p => p.nome.toLowerCase().includes(termo))
                : produtos;

            renderizarProdutos(listaFiltrada);
        }
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
            // Se ainda não houver esse produto no agrupamento, adiciona com quantidade 1

            // Cria uma cópia do produto e adiciona o atributo quantidade
            agrupado[item.id] = { ...item, quantidade: 1 };
        } else {
            // Se o produto já estiver no agrupamento, apenas incrementa a quantidade
            agrupado[item.id].quantidade++;
        }
        // incrementa o valor do produto adicionado ao total do carrinho
        total += parseFloat(item.valor);
    });

    // Percorre os produtos agrupados usando Object.values()
    Object.values(agrupado).forEach(item => {
        //Cria um elemento li para cada produto agrupado
        const li = document.createElement("li");
    
        // Lista o produto agrupado com um botão para remover uma unidade
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

// Tira todos os produtos do carrinho e devolve ao estoque
function limparCarrinho() {
    // Para cada produto do carrinho, acha o original no array de produtos
    // e adiciona um ao estoque
    carrinho.forEach(produto => {
        const original = produtos.find(p => p.id === produto.id);
        if (original) original.estoque++;
    });
    // Esvazia o carrinho
    carrinho = [];
    atualizarCarrinho();
    renderizarProdutos();
}

// Remove apenas um produto do carrinho e devolve ao estoque
function removerDoCarrinho(id) {
    // Procurar o índice do produto no carrinho
    const indice = carrinho.findIndex(p => p.id === id);
    //se encontrar o produto no carrinho
    if (indice !== -1) {
        const produtoRemovido = carrinho[indice];
        // Localiza o produto original no array de produtos
        const original = produtos.find(p => p.id === produtoRemovido.id);
        // Se o produto original existir, adiciona um ao estoque
        if (original) original.estoque++; 
        // Remove um produto do carrinho
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

// Lista todos os produtos com esta categoria(chama via parametro no html)
function filtrarCategoria(categoria) {
    categoriaAtiva = categoria; 
    const filtrados = produtos.filter(p => p.categoria === categoria);
    renderizarProdutos(filtrados);
}

function mostrarTodos() {
    categoriaAtiva = null; // Zera a categoria ativa

    const termo = document.getElementById("pesquisa").value.toLowerCase();
    //Operador ternario
    const listaFiltrada = termo
        ? produtos.filter(p => p.nome.toLowerCase().includes(termo))
        : produtos;

    renderizarProdutos(listaFiltrada);
}



function pesquisarProduto() {
   // Obtem o termo digitado no campo de pesquisa
    const termo = document.getElementById("pesquisa").value.toLowerCase();

    //Filtra os produtos que tem este termo no nome
    const filtrados = produtos.filter(p => p.nome.toLowerCase().includes(termo));
    renderizarProdutos(filtrados);
}

// Quando a pagina carregar ou recarregar, inicia a renderização dos produtos
window.onload = () => renderizarProdutos();

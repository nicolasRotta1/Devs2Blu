const geradorNumero = Math.floor(Math.random() * 100) + 1;
let contadorTentativas = parseInt(localStorage.getItem('contadorTentativas')) || 0;
const verificar = () => {

const numeroInput = document.getElementById('Numero');
const  numero = parseInt(meuNumeroInput.value);

const feedbackElement = document.getElementById('feedback');

document.getElementById('tentativas').textContent = `Tentativas: ${contadorTentativas}`; 
document.getElementById('feedback').textContent = '';

let diferenca = Math.abs(geradorNumero - numero);


if (isNaN(numero) || numero < 1 || numero > 100) {
    feedbackElement.textContent = 'Por favor, digite um número válido entre 1 e 100.';
    return;
}

if (diferenca === 0) {
        feedbackElement.textContent = `Parabéns, você acertou! O número era ${geradorNumero} em ${contadorTentativas} tentativas!`;
        alert('Você acertou! O jogo será reiniciado.'); 
    } else if (diferenca <= 5) {
        feedbackElement.textContent = 'Quase!!';
    } else if (diferenca <= 10) {
        feedbackElement.textContent = 'Perto!';
    } else if (diferenca <= 20) {
        feedbackElement.textContent = 'Longe!';
    } else {
        feedbackElement.textContent = 'Muito longe!';
    }
}
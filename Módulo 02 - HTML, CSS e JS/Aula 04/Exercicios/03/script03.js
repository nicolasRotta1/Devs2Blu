const geradorNumero = Math.floor(Math.random() * 100) + 1;
const verificar = () => {
const numeroInput = document.getElementById('Numero');
const  numero = parseInt(numeroInput.value);

const  elementoFeedback = document.getElementById('feedback');

document.getElementById('tentativas').textContent = `Tentativas: ${contadorTentativas}`; 
document.getElementById('feedback').textContent = '';

let diferenca = Math.abs(geradorNumero - numero);


if (isNaN(numero) || numero < 1 || numero > 100) {
    elementoFeedback.textContent = 'Por favor, digite um número válido entre 1 e 100.';

}

if (diferenca === 0) {
        elementoFeedback.textContent = `Parabéns, você acertou! O número era ${geradorNumero} em ${contadorTentativas} tentativas!`;
        alert('Você acertou! O jogo será reiniciado.'); 
        return false
    } else if (diferenca <= 5) {
        elementoFeedback.textContent = 'Quase!!';
    } else if (diferenca <= 10) {
        elementoFeedback.textContent = 'Perto!';
    } else if (diferenca <= 20) {
        elementoFeedback.textContent = 'Longe!';
    } else {
        elementoFeedback.textContent = 'Muito longe!';
    }
   return false; 
}
const geradorNumero = Math.floor(Math.random() * 100) + 1;
const numeroInput = document.getElementById('Numero');
const  numero = parseInt(numeroInput.value);
let tentativas = 0;


function enter(event, valor) {
tentativas++;
if (diferenca === 0) {
        elementoFeedback.textContent = `Parabéns, você acertou! O número era ${geradorNumero} em ${tentativas}!`;
        alert('Você acertou!'); 
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
const reiniciarelemento = documen
t.getElementById('reiniciar');

function reiniciar() {
    tentativas = 0;
    geradorNumero = Math.floor(Math.random() * 100) + 1;
    elementoFeedback.textContent = '';
    numeroInput.value = '';
}
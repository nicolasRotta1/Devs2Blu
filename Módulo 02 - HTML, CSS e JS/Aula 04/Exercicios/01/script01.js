const formulario = document.getElementById('formulario');
const retornoElement = document.getElementById('retorno');

formulario.addEventListener('submit', function(event) {
    event.preventDefault(); // impede o envio e recarregamento da página
    
    const n1 = parseFloat(document.getElementById('num1').value);
    const n2 = parseFloat(document.getElementById('num2').value);
    const n3 = parseFloat(document.getElementById('num3').value);

    if (isNaN(n1) || isNaN(n2) || isNaN(n3)) {
        retornoElement.innerHTML = "Por favor, insira números válidos em todas as notas.";
        return;
    }

    calcularMedia(n1, n2, n3);
});

function calcularMedia(n1, n2, n3) {
    const media = (n1 + n2 + n3) / 3;
    let situacao = '';

    if (media >= 7) {
        situacao = 'Aprovado';
    } else if (media >= 5) {
        situacao = 'Recuperação';
    } else {
        situacao = 'Reprovado';
    }

    retornoElement.innerHTML = `Média: ${media.toFixed(2)} - Situação: ${situacao}`;
}

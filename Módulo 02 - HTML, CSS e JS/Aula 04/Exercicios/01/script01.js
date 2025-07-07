 const calcular = () =>{

            let formulario = document.getElementById('formulario');
            let campos = document.getElementsByTagName('input');

            let nota1 = parseFloat(formulario.nota1.value);
            let nota2 = parseFloat(formulario.nota2.value);
            let nota3 = parseFloat(formulario.nota3.value);

            let media = (nota1 + nota2 + nota3) / 3;

            let status = media >= 7 ? 'Aprovado' : (media >= 5 ? 'recuperacao' : 'Reprovado');
            let cor = media >= 7 ? 'green' : (media >= 5 ? 'orange' : 'red');

             let retornaMedia = document.getElementById('retornaMedia');
             let retornaStatus = document.getElementById('retornaStatus');

            retornaMedia.innerText = `Média: ${media.toFixed(2)}`;
            retornaStatus.innerText = `Situação: ${status}`;

            
            retornaStatus.style.color = cor;
            return false;
        }
  

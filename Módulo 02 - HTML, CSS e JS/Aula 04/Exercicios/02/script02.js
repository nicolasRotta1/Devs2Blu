const euro = 6.36;
const dolar = 5.41;
const bitcoin = 593552.67;
const libra = 7.39;

const converterReal = (moedaTipo) =>{
    const valor = parseFloat(document.getElementById('valor').value);

    let moedaConvertida = document.getElementById('moedaConvertida');

    switch (parseInt(moedaTipo)) {
        case 1:
        moedaConvertida.innerText = `$ ${(valor / dolar).toFixed(2)}`;
        break;
    
        case 2:
        moedaConvertida.innerText = `€ ${(valor / euro).toFixed(2)}`;
        break;
    
        case 3:
        moedaConvertida.innerText = `£ ${(valor / libra).toFixed(2)}`;
        break;
    
        case 4:
        moedaConvertida.innerText = `₿ ${(valor / bitcoin).toFixed(8)}`;
        break;

        default:
        moedaConvertida.innerText = '';
        break;

    }
}
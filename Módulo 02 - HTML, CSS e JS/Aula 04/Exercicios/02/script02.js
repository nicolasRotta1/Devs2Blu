function converterMoeda(valor, tipo) {
    const cotacoes = {
        dolar: 5.00,
        euro: 5.40,
        libra: 6.30,
        bitcoin: 340000.00
    };

    const resultado = valor / cotacoes[tipo.toLowerCase()];
    return resultado.toFixed(2);
}
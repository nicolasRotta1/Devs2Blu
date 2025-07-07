function jogoAdivinhacao(chutes) {
    const numeroSecreto = Math.floor(Math.random() * 100) + 1;
    let tentativas = 0;

    for (let chute of chutes) {
        tentativas++;
        const diferenca = Math.abs(numeroSecreto - chute);

        if (chute === numeroSecreto) {
            return `Acertou em ${tentativas} tentativas!`;
        } else if (diferenca <= 5) {
            console.log("Quase!");
        } else if (diferenca <= 10) {
            console.log("Perto!");
        } else if (diferenca <= 20) {
            console.log("Longe!");
        } else {
            console.log("Muito longe!");
        }
    }

    return `Não acertou. O número era ${numeroSecreto}.`;
}
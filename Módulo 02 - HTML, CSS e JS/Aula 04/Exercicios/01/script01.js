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

    return { media: media.toFixed(2), situacao };
}
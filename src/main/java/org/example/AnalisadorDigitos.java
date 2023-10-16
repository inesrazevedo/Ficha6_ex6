package org.example;

public class AnalisadorDigitos {

    public double mediaDosDigitos(int numero) {
        if (numero == 0) {
            return 0.0;
        }

        int soma = 0;
        int contagem = 0;

        // Certifica-se de lidar com números negativos convertendo-os em positivos
        numero = Math.abs(numero);

        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            contagem++;
            numero /= 10;
        }

        return (double) soma / contagem;
    }
}


package calculadora;
public class Calculadora {
    public static void main(String[] args) {
        // Autor: Lucas da Silva Cardoso - 11211102438@alunos.umc.br
        Operadores resultado = new Operadores();

        System.out.println("O resultado da adição é: " + resultado.adicao(10, 5));

        System.out.println("O resultado da subtração é: " + resultado.subtracao(10, 5));

        System.out.println("O resultado da multiplicação é: " + resultado.multiplicacao(10, 5));

        System.out.println("O resultado da divisão é: " + resultado.divisao(10, 5));

        System.out.println("O resultado do resto é: " + resultado.resto(10, 5));

        System.out.println("O valor mais dez é: " + resultado.somardez(6));

        System.out.println("O valor menos dez é: " + resultado.subtrairdez(7));

        System.out.println("O dobro do valor é: " + resultado.dobro(8));

        System.out.println("O resto da divisão por dois é: " + resultado.resto2(9));

        System.out.println("Os valores são iguais? " + resultado.valoresIguais(10, 5));

        System.out.println("Os valores são direntes? "+ resultado.valoresDiferentes(10, 5));

        System.out.println("O menor valor é: " + resultado.menorValor(50, 20));

        System.out.println("O maior valor é: " + resultado.maiorValor(30, 20));

        System.out.println("O valor menor ou igual a cem? " + resultado.menorIgualCem(100));

        System.out.println("O valor maior ou igual a cem? " + resultado.maiorIgualCem(20));

        System.out.println("O valor está entre dez e vinte?" + resultado.entreDezVinte(60));

        System.out.println("O valor está entre onze e vinte? " + resultado.entreOnzeVinte(13));

        System.out.println("O valor é negativo ou par? " + resultado.negativoOuPar(-1));

        System.out.println("O valor é negativo ou impar? " + resultado.negativoOuImpar(5));
    }
}

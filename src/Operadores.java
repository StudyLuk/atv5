package calculadora;

public class Operadores{
    public float adicao(float valor1,float valor2) {
        return valor1 + valor2;
    }
    public float subtracao(float valor1,float valor2) {
        return valor1 - valor2;
    }
    public float multiplicacao(float valor1,float valor2) {
        return valor1 * valor2;
    }
    public float divisao(float valor1,float valor2) {
        return valor1 / valor2;
    }
    public float resto(float valor1,float valor2) {
        return valor1 % valor2;
    }

    public float somardez(float valor) {
        return valor += 10;
    }
    public float subtrairdez(float valor) {
        return valor -= 10;
    }
    public float dobro(float valor) {
        return valor *= 2;
    }
    public float resto2 (float valor) {
        return valor %= 2;
    }
    
    public boolean valoresIguais(float valor1,float valor2) {
        if (valor1 == valor2) {
            return true;
        }
        return false;
    }
    public boolean valoresDiferentes(float valor1,float valor2) {
        if (valor1 != valor2) {
            return true;
        }
        return false;
    }
    public float menorValor(float valor1,float valor2) {
        if (valor1 < valor2) {
            return valor1;
        }
        return valor2;
    }
    public float maiorValor(float valor1,float valor2) {
        if (valor1 > valor2) {
            return valor1;
        }
        return valor2;
    }
    public boolean menorIgualCem(float valor) {
        if(valor <= 100){
            return true;
        }
        return false;
    }
        public boolean maiorIgualCem(float valor) {
            if(valor >= 100){
                return true;
            }
            return false;
        }

    public boolean entreDezVinte (float valor) {
        if (10 <= valor && valor <= 20) {
            return true;
        }
        return false;
    }
    public boolean entreOnzeVinte (float valor) {
        if (11 <= valor & valor <= 20) {
            return true;
        }
        return false;
    }
    public boolean negativoOuPar (float valor) {
        if (valor < 0 || (valor%2) == 0){
            return true;
        }
        return false;
    }
    public boolean negativoOuImpar(float valor) {
        if (valor < 0 || (valor%2) != 0){
            return true;
        }
        return false;
    }
}



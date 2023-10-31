package Tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Calcula {
    private double[] valores;

    public Calcula(double[] valores) {
        this.valores = valores;
    }

    public double calculaMedia() {
        if (valores.length == 0) {
            return 0;
        }
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    public double[] calculaModa() {
        if (valores.length == 0) {
            throw new ArithmeticException("sem valores para calcular.");
        }
        Map<Double, Integer> contagem = new HashMap<>();
        for (double valor : valores) {
            contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
        }
        int maxContagem = 0;
        for (int cont : contagem.values()) {
            maxContagem = Math.max(maxContagem, cont);
        }
        if (maxContagem == 1) {
            return new double[0];
        }
        double[] moda = new double[contagem.size()];
        int index = 0;
        for (Map.Entry<Double, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() == maxContagem) {
                moda[index++] = entry.getKey();
            }
        }
        return Arrays.copyOf(moda, index);
    }

    public double calculaMediana() {
        if (valores.length == 0) {
        	 return 0;
        }
        Arrays.sort(valores);
        int meio = valores.length / 2;
        if (valores.length % 2 == 0) {
            return (valores[meio - 1] + valores[meio]) / 2.0;
        } else {
            return valores[meio];
        }
    }

    public double calculaVariancia() {
        if (valores.length < 2) {
            throw new ArithmeticException("necessario pelo menos 2 valores.");
        }
        double media = calculaMedia();
        double somaDiferencasQuadradas = 0;
        for (double valor : valores) {
            somaDiferencasQuadradas += Math.pow(valor - media, 2);
        }
        return somaDiferencasQuadradas / (valores.length - 1);
    }

    public double calculaDesvioPadrao() {
        return Math.sqrt(calculaVariancia());
    }
}
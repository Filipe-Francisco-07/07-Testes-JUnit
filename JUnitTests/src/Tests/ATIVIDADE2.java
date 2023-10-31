package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATIVIDADE2 {

    @Test
    public void testeMedia() {
        double[] valores = { 10.0, 20.0, 30.0, 40.0, 50.0 };
        double esperado = 30.0;
        double tolerancia = 0.0001; 
        Calcula calcula = new Calcula(valores);
        double resultado = calcula.calculaMedia();
        assertEquals(esperado, resultado, tolerancia);
    }

    @Test
    public void calculaModa() {
        double[] valores = { 5.0, 10.0, 20.0, 20.0, 30.0, 30.0, 40.0, 50.0, 50.0 };
        double[] esperado = { 20.0, 30.0, 50.0 };
        Calcula calcula = new Calcula(valores);
        double[] resultado = calcula.calculaModa();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void calculaMediana() {
        double[] valores = { 10.0, 20.0, 30.0, 40.0, 50.0 };
        double esperado = 30.0;
        double tolerancia = 0.0001;
        Calcula calcula = new Calcula(valores);
        double resultado = calcula.calculaMediana();
        assertEquals(esperado, resultado, tolerancia);
    }

    @Test
    public void calculaVariancia() {
        double[] valores = { 10.0, 20.0, 30.0, 40.0, 50.0 };
        double esperado = 250.0;
        double tolerancia = 0.0001;
        Calcula calcula = new Calcula(valores);
        double resultado = calcula.calculaVariancia();
        assertEquals(esperado, resultado, tolerancia);
    }

    @Test
    public void calculaDesvioo() {
        double[] valores = { 10.0, 20.0, 30.0, 40.0, 50.0 };
        double esperado = 15.8114;
        double tolerancia = 0.0001;
        Calcula calcula = new Calcula(valores);
        double resultado = calcula.calculaDesvioPadrao();
        assertEquals(esperado, resultado, tolerancia);
    }
}
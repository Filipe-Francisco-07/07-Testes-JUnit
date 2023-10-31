package Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATIVIDADE1 {

    @Test
    public void test1() {
    	GeraScript gerador = new GeraScript("codigo", "INT", true, true);
        String esperado = "'codigo' INT NOT NULL AUTO_INCREMENT";
        assertEquals(esperado, gerador.geraScriptColuna());
    }

    @Test
    public void test2() {
    	GeraScript gerador = new GeraScript("codigo", "INT", false, true);
        String esperado = "'codigo' INT AUTO_INCREMENT";
        assertEquals(esperado, gerador.geraScriptColuna());
    }

    @Test
    public void test3() {
    	GeraScript gerador = new GeraScript("codigo", "INT", true, false);
        String esperado = "'codigo' INT NOT NULL";
        assertEquals(esperado, gerador.geraScriptColuna());
    }

    @Test
    public void test4() {
    	GeraScript gerador = new GeraScript("codigo", "INT", false, false);
        String esperado = "'codigo' INT";
        assertEquals(esperado, gerador.geraScriptColuna());
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdadeTest{

    
    public IdadeTest() {
    }
    
    Idade objIdade = new Idade();

    @Test
    public void testIdadePrimeiro() {
        System.out.println("Teste renovação 10 anos");
        assertEquals("Renovar a cada 10 anos", objIdade.validaIdade(1));
        assertEquals("Renovar a cada 10 anos", objIdade.validaIdade(49));
    }
    @Test
    public void testIdadePrimeiroInvalido() {
        System.out.println("Teste idade inválida");
        assertEquals("Idade Inválida", objIdade.validaIdade(-1));
        assertEquals("Renovar a cada 5 anos", objIdade.validaIdade(50));
    }
    
    
    @Test
    public void testIdadeSegundo() {
        System.out.println("Teste idade válida");
        assertEquals("Renovar a cada 5 anos", objIdade.validaIdade(50));
        assertEquals("Renovar a cada 5 anos", objIdade.validaIdade(70));
    }
    @Test
    public void testIdadeSegundoInvalido() {
        System.out.println("Teste idade inválida");
        assertEquals("Idade Inválida", objIdade.validaIdade(49));
        assertEquals("Idade Inválida", objIdade.validaIdade(71));
    }
    
    @Test
    public void testIdadeTerceiro() {
        System.out.println("Teste idade válida");
        assertEquals("Renovar a cada 3 anos", objIdade.validaIdade(72));
    }
    @Test
    public void testIdadeTerceiroInvalido() {
        System.out.println("Teste idade inválida");
        assertEquals("Idade Inválida", objIdade.validaIdade(70));
    }
    
    
    
}

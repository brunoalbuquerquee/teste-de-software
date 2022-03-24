//Precisa de 2 Asserts
//O Primeiro pode ser verificar se tem 17 numeros o chassi("9BP17164GA0000001")

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChassiTest{

    
    public ChassiTest() {
    }
    
    Chassi objChassi = new Chassi();

    @Test
    public void testChassiInvalido() {
        System.out.println("Tamanho chassi invalido");
        assertEquals("Nota Inválida", objChassi.validaChassi());
    }
    
    @Test
    public void testChassiValido() {
        System.out.println("Tamanho do chassi válido");
        assertEquals("Chassi válido", objNota.validaChassi());
    }
    
    
    
}


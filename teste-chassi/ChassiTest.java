//Precisa de 2 Asserts
//O Primeiro pode ser verificar se tem 17 numeros o chassi("9BP17164GA0000001")

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChassiTest{

    
    public ChassiTest() {
    }
    
    Chassi objChassi = new Chassi("9BP17164GA0000001"); // 17 caracteres 
    Chassi objChassi2 = new Chassi ("8CU4364GA00000"); // Menos de 17 caracteres 
    Chassi objChassi3 = new Chassi ("8CU4364GA000000024"); // Mais de 17 caracteres 

    @Test
    public void testChassivalido() {
        System.out.println("Tamanho chassi valido");
        assertEquals("Completo", objChassi.incompleto());
    }
    
    @Test
    public void testChassInivalido() {
        System.out.println("Tamanho chassi valido");
        assertNotEquals("Completo", objChassi2.incompleto());
        assertEquals("Inválido tamanho maior", objChassi3.incompleto());
    }
   
}
    
    
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnoTest{

    
    public AnoTest() {
    }
    
    Ano objAno = new Ano();

    @Test
    public void testDataInvalida() {
        System.out.println("Teste data inválida");
        assertEquals("Data Inválida", objAno.validaData(1899));
        assertEquals("Data Inválida", objAno.validaData(2023));
    }
    
    @Test
    public void testDataValida() {
        System.out.println("Teste data válida");
        assertEquals("Data válida", objAno.validaData(1900));
        assertEquals("Data válida", objAno.validaData(1901));
        assertEquals("Data válida", objAno.validaData(2021));
        assertEquals("Data válida", objAno.validaData(2022));
    }
    
    
    
}

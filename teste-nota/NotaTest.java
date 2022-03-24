/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotaTest{

    
    public NotaTest() {
    }
    
    Nota objNota = new Nota();

    @Test
    public void testNotaInvalida() {
        System.out.println("Teste nota inválida");
        assertEquals("Nota Inválida", objNota.validaNota(-1));
        assertEquals("Nota Inválida", objNota.validaNota(11));
    }
    
    @Test
    public void testNotaValida() {
        System.out.println("Teste nota válida");
        assertEquals("Nota válida", objNota.validaNota(0));
        assertEquals("Nota válida", objNota.validaNota(1));
        assertEquals("Nota válida", objNota.validaNota(9));
        assertEquals("Nota válida", objNota.validaNota(10));
    }
    
    
    
}

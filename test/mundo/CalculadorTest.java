/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deividosorio
 */
public class CalculadorTest {
    
    public CalculadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerDesvStdr method, of class Calculador.
     */
    @org.junit.Test
    public void testObtenerDesvStdr() {
        System.out.println("obtenerDesvStdr");
        LinkedList list = null;
        Calculador instance = new Calculador();
        
        list.add((double)(160));
        list.add((double)(591));
        list.add((double)(114));
        list.add((double)(229));
        list.add((double)(230));
        list.add((double)(270));
        list.add((double)(128));
        list.add((double)(1657));
        list.add((double)(624));
        list.add((double)(1503));
        
        double expResult = 0.0;
        double result = instance.obtenerDesvStdr(list);
        assertEquals(expResult, result, 572.03);
        fail("Programa funcionando adecuadamente.");
    }

    /**
     * Test of obtenerMedia method, of class Calculador.
     */
    @org.junit.Test
    public void testObtenerMedia() {
        System.out.println("obtenerMedia");
        LinkedList list = null;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        
        list.add((double)(160));
        list.add((double)(591));
        list.add((double)(114));
        list.add((double)(229));
        list.add((double)(230));
        list.add((double)(270));
        list.add((double)(128));
        list.add((double)(1657));
        list.add((double)(624));
        list.add((double)(1503));
        
        double result = instance.obtenerMedia(list);
        assertEquals(expResult, result, 550.6);
        fail("Programa funcionando adecuadamente");
    }
    
}

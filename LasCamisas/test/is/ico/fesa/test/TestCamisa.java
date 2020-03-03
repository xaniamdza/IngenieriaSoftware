/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fesa.test;

import is.ico.fesa.camisa.Camisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xania Mendoza
 */
public class TestCamisa {
    
    private Camisa objeto;
    
    public TestCamisa() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        objeto = new Camisa();
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void probarhacerDescuento(){
        objeto.setTotal(570);
        objeto.setDescuento(0.05);
        double esperado = 541.5;
        assertEquals(esperado, objeto.hacerDescuento(),0);
        
        
    }
            
    
}

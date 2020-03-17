/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fesa.test;

import is.ico.fesa.tennis.Tennis;
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
public class TestTennis {
    
    private Tennis objeto;
    public TestTennis() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        objeto = new Tennis();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void ganadorFinal(){
        objeto.setVictoria1(1);
        objeto.setVictoria2(0);
        int esperado = 1;
        assertEquals(esperado, objeto.ganadorFinal());
    }
    
    @Test
    public void jugarTennis(){
        objeto.setR1(1);
        objeto.setPuntaje1(0);
        int esperado = 15;
        assertEquals(esperado, objeto.jugarTennis());
    }
    
}

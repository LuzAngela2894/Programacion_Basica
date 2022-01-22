/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luz Angela Melo
 */
public class ViewTest {
    
    public ViewTest() {
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
     * Test of limpiar method, of class View.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        View instance = new View();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class View.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        View.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

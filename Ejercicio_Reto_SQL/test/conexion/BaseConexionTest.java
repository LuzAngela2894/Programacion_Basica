/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

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
public class BaseConexionTest {

    public BaseConexionTest() {
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
     * Test of getConexion method, of class BaseConexion.
     */
    @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        BaseConexion instance = new BaseConexion();
        instance.getConexion();
    }

    /**
     * Test of closeConexion method, of class BaseConexion.
     */
    @Test
    public void testCloseConexion() {
        System.out.println("closeConexion");
        BaseConexion instance = new BaseConexion();
        instance.closeConexion();
    }
}

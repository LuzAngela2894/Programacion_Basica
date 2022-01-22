/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class EstudianteVOTest {
    
    public EstudianteVOTest() {
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
     * Test of getNombres method, of class EstudianteVO.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        EstudianteVO instance = new EstudianteVO();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombres method, of class EstudianteVO.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        EstudianteVO instance = new EstudianteVO();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getApellidos method, of class EstudianteVO.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        EstudianteVO instance = new EstudianteVO();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setApellidos method, of class EstudianteVO.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        EstudianteVO instance = new EstudianteVO();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNacimiento method, of class EstudianteVO.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        EstudianteVO instance = new EstudianteVO();
        String expResult = "";
        String result = instance.getNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNacimiento method, of class EstudianteVO.
     */
    @Test
    public void testSetNacimiento() {
        System.out.println("setNacimiento");
        String nacimiento = "";
        EstudianteVO instance = new EstudianteVO();
        instance.setNacimiento(nacimiento);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrograma method, of class EstudianteVO.
     */
    @Test
    public void testGetPrograma() {
        System.out.println("getPrograma");
        EstudianteVO instance = new EstudianteVO();
        String expResult = "";
        String result = instance.getPrograma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrograma method, of class EstudianteVO.
     */
    @Test
    public void testSetPrograma() {
        System.out.println("setPrograma");
        String programa = "";
        EstudianteVO instance = new EstudianteVO();
        instance.setPrograma(programa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelular method, of class EstudianteVO.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        EstudianteVO instance = new EstudianteVO();
        long expResult = 0L;
        long result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCelular method, of class EstudianteVO.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        long celular = 0L;
        EstudianteVO instance = new EstudianteVO();
        instance.setCelular(celular);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCinstitucional method, of class EstudianteVO.
     */
    @Test
    public void testGetCinstitucional() {
        System.out.println("getCinstitucional");
        EstudianteVO instance = new EstudianteVO();
        String expResult = "";
        String result = instance.getCinstitucional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCinstitucional method, of class EstudianteVO.
     */
    @Test
    public void testSetCinstitucional() {
        System.out.println("setCinstitucional");
        String cinstitucional = "";
        EstudianteVO instance = new EstudianteVO();
        instance.setCinstitucional(cinstitucional);
        // TODO review the generated test code and remove the default call to fail.
    }
}

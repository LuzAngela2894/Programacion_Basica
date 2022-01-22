/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import modelo.EVO;
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
public class EBOTest {

    public EBOTest() {
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
     * Test of ingresarEstudiante method, of class EBO.
     */
    @Test
    public void testIngresarEstudiante() {
        System.out.println("ingresarEstudiante");
        EVO serhumano = null;
        EBO instance = new EBO();
        boolean expResult = false;
        boolean result = instance.ingresarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarEstudiante method, of class EBO.
     */
    @Test
    public void testBuscarEstudiante() {
        System.out.println("buscarEstudiante");
        String cinstitucional = "";
        EBO instance = new EBO();
        EVO expResult = null;
        EVO result = instance.buscarEstudiante(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of modificarEstudiante method, of class EBO.
     */
    @Test
    public void testModificarEstudiante() {
        System.out.println("modificarEstudiante");
        EVO serhumano = null;
        EBO instance = new EBO();
        boolean expResult = false;
        boolean result = instance.modificarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of borrarEstudiante method, of class EBO.
     */
    @Test
    public void testBorrarEstudiante() {
        System.out.println("borrarEstudiante");
        EVO serhumano = null;
        EBO instance = new EBO();
        boolean expResult = false;
        boolean result = instance.borrarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of mostrarDirectorio method, of class EBO.
     */
    @Test
    public void testMostrarDirectorio() {
        System.out.println("mostrarDirectorio");
        EBO instance = new EBO();
        List<EVO> expResult = null;
        List<EVO> result = instance.mostrarDirectorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarCorreo method, of class EBO.
     */
    @Test
    public void testBuscarCorreo() {
        System.out.println("buscarCorreo");
        String cinstitucional = "";
        EBO instance = new EBO();
        EVO expResult = null;
        EVO result = instance.buscarCorreo(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarApellidos method, of class EBO.
     */
    @Test
    public void testBuscarApellidos() {
        System.out.println("buscarApellidos");
        String apellidos = "";
        EBO instance = new EBO();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarApellidos(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarPrograma method, of class EBO.
     */
    @Test
    public void testBuscarPrograma() {
        System.out.println("buscarPrograma");
        String programa = "";
        EBO instance = new EBO();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarPrograma(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarCantidad method, of class EBO.
     */
    @Test
    public void testBuscarCantidad() {
        System.out.println("buscarCantidad");
        String programa = "";
        EBO instance = new EBO();
        int expResult = 0;
        int result = instance.buscarCantidad(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarFnacimiento method, of class EBO.
     */
    @Test
    public void testBuscarFnacimiento() {
        System.out.println("buscarFnacimiento");
        String fnacimiento = "";
        EBO instance = new EBO();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarFnacimiento(fnacimiento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarCelular method, of class EBO.
     */
    @Test
    public void testBuscarCelular() {
        System.out.println("buscarCelular");
        Long ncelular = null;
        EBO instance = new EBO();
        EVO expResult = null;
        EVO result = instance.buscarCelular(ncelular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}

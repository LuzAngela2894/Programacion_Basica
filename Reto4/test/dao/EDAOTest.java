/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class EDAOTest {
    
    public EDAOTest() {
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
     * Test of ingresarEstudiante method, of class EDAO.
     */
    @Test
    public void testIngresarEstudiante() {
        System.out.println("ingresarEstudiante");
        EVO serhumano = null;
        EDAO instance = new EDAO();
        boolean expResult = false;
        boolean result = instance.ingresarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of modificarEstudiante method, of class EDAO.
     */
    @Test
    public void testModificarEstudiante() {
        System.out.println("modificarEstudiante");
        EVO serhumano = null;
        EDAO instance = new EDAO();
        boolean expResult = false;
        boolean result = instance.modificarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of borrarEstudiante method, of class EDAO.
     */
    @Test
    public void testBorrarEstudiante() {
        System.out.println("borrarEstudiante");
        String cinstitucional = "";
        EDAO instance = new EDAO();
        boolean expResult = false;
        boolean result = instance.borrarEstudiante(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mostrarDirectorio method, of class EDAO.
     */
    @Test
    public void testMostrarDirectorio() {
        System.out.println("mostrarDirectorio");
        EDAO instance = new EDAO();
        List<EVO> expResult = null;
        List<EVO> result = instance.mostrarDirectorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarCorreo method, of class EDAO.
     */
    @Test
    public void testBuscarCorreo() {
        System.out.println("buscarCorreo");
        String cinstitucional = "";
        EDAO instance = new EDAO();
        EVO expResult = null;
        EVO result = instance.buscarCorreo(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarApellidos method, of class EDAO.
     */
    @Test
    public void testBuscarApellidos() {
        System.out.println("buscarApellidos");
        String apellidos = "";
        EDAO instance = new EDAO();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarApellidos(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarPrograma method, of class EDAO.
     */
    @Test
    public void testBuscarPrograma() {
        System.out.println("buscarPrograma");
        String programa = "";
        EDAO instance = new EDAO();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarPrograma(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarCantidad method, of class EDAO.
     */
    @Test
    public void testBuscarCantidad() {
        System.out.println("buscarCantidad");
        String programa = "";
        EDAO instance = new EDAO();
        int expResult = 0;
        int result = instance.buscarCantidad(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarFnacimiento method, of class EDAO.
     */
    @Test
    public void testBuscarFnacimiento() {
        System.out.println("buscarFnacimiento");
        String fnacimiento = "";
        EDAO instance = new EDAO();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarFnacimiento(fnacimiento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarCelular method, of class EDAO.
     */
    @Test
    public void testBuscarCelular() {
        System.out.println("buscarCelular");
        Long ncelular = null;
        EDAO instance = new EDAO();
        EVO expResult = null;
        EVO result = instance.buscarCelular(ncelular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

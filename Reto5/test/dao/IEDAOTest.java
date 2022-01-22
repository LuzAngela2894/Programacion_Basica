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
public class IEDAOTest {
    
    public IEDAOTest() {
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
     * Test of ingresarEstudiante method, of class IEDAO.
     */
    @Test
    public void testIngresarEstudiante() {
        System.out.println("ingresarEstudiante");
        EVO serhumano = null;
        IEDAO instance = new IEDAOImpl();
        boolean expResult = false;
        boolean result = instance.ingresarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of modificarEstudiante method, of class IEDAO.
     */
    @Test
    public void testModificarEstudiante() {
        System.out.println("modificarEstudiante");
        EVO serhumano = null;
        IEDAO instance = new IEDAOImpl();
        boolean expResult = false;
        boolean result = instance.modificarEstudiante(serhumano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of borrarEstudiante method, of class IEDAO.
     */
    @Test
    public void testBorrarEstudiante() {
        System.out.println("borrarEstudiante");
        String cinstitucional = "";
        IEDAO instance = new IEDAOImpl();
        boolean expResult = false;
        boolean result = instance.borrarEstudiante(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mostrarDirectorio method, of class IEDAO.
     */
    @Test
    public void testMostrarDirectorio() {
        System.out.println("mostrarDirectorio");
        IEDAO instance = new IEDAOImpl();
        List<EVO> expResult = null;
        List<EVO> result = instance.mostrarDirectorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarCorreo method, of class IEDAO.
     */
    @Test
    public void testBuscarCorreo() {
        System.out.println("buscarCorreo");
        String cinstitucional = "";
        IEDAO instance = new IEDAOImpl();
        EVO expResult = null;
        EVO result = instance.buscarCorreo(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarApellidos method, of class IEDAO.
     */
    @Test
    public void testBuscarApellidos() {
        System.out.println("buscarApellidos");
        String apellidos = "";
        IEDAO instance = new IEDAOImpl();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarApellidos(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarPrograma method, of class IEDAO.
     */
    @Test
    public void testBuscarPrograma() {
        System.out.println("buscarPrograma");
        String programa = "";
        IEDAO instance = new IEDAOImpl();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarPrograma(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarCantidad method, of class IEDAO.
     */
    @Test
    public void testBuscarCantidad() {
        System.out.println("buscarCantidad");
        String programa = "";
        IEDAO instance = new IEDAOImpl();
        int expResult = 0;
        int result = instance.buscarCantidad(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarFnacimiento method, of class IEDAO.
     */
    @Test
    public void testBuscarFnacimiento() {
        System.out.println("buscarFnacimiento");
        String fnacimiento = "";
        IEDAO instance = new IEDAOImpl();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarFnacimiento(fnacimiento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarCelular method, of class IEDAO.
     */
    @Test
    public void testBuscarCelular() {
        System.out.println("buscarCelular");
        Long ncelular = null;
        IEDAO instance = new IEDAOImpl();
        List<EVO> expResult = null;
        List<EVO> result = instance.buscarCelular(ncelular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class IEDAOImpl implements IEDAO {

        public boolean ingresarEstudiante(EVO serhumano) {
            return false;
        }

        public boolean modificarEstudiante(EVO serhumano) {
            return false;
        }

        public boolean borrarEstudiante(String cinstitucional) {
            return false;
        }

        public List<EVO> mostrarDirectorio() {
            return null;
        }

        public EVO buscarCorreo(String cinstitucional) {
            return null;
        }

        public List<EVO> buscarApellidos(String apellidos) {
            return null;
        }

        public List<EVO> buscarPrograma(String programa) {
            return null;
        }

        public int buscarCantidad(String programa) {
            return 0;
        }

        public List<EVO> buscarFnacimiento(String fnacimiento) {
            return null;
        }

        public List<EVO> buscarCelular(Long ncelular) {
            return null;
        }
    }
    
}

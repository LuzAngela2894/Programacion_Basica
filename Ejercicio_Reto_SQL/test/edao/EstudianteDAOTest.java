/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edao;

import java.util.List;
import modelo.EstudianteVO;
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
public class EstudianteDAOTest {
    
    public EstudianteDAOTest() {
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
     * Test of insertar_estudiante method, of class EstudianteDAO.
     */
    @Test
    public void testInsertar_estudiante() {
        System.out.println("insertar_estudiante");
        EstudianteVO estudiante = null;
        EstudianteDAO instance = new EstudianteDAO();
        boolean expResult = false;
        boolean result = instance.insertar_estudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of actualizar_estudiante method, of class EstudianteDAO.
     */
    @Test
    public void testActualizar_estudiante() {
        System.out.println("actualizar_estudiante");
        EstudianteVO estudiante = null;
        EstudianteDAO instance = new EstudianteDAO();
        boolean expResult = false;
        boolean result = instance.actualizar_estudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar_estudiante method, of class EstudianteDAO.
     */
    @Test
    public void testEliminar_estudiante() {
        System.out.println("eliminar_estudiante");
        String cinstitucional = "";
        EstudianteDAO instance = new EstudianteDAO();
        boolean expResult = false;
        boolean result = instance.eliminar_estudiante(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_todos method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_todos() {
        System.out.println("consultar_todos");
        EstudianteDAO instance = new EstudianteDAO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_todos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_correo method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_por_correo() {
        System.out.println("consultar_por_correo");
        String cinstitucional = "";
        EstudianteDAO instance = new EstudianteDAO();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.consultar_por_correo(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_apellido method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_por_apellido() {
        System.out.println("consultar_por_apellido");
        String apellidos = "";
        EstudianteDAO instance = new EstudianteDAO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_apellido(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_programa method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_por_programa() {
        System.out.println("consultar_por_programa");
        String programa = "";
        EstudianteDAO instance = new EstudianteDAO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_programa(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_cantidad_estudiantes method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_cantidad_estudiantes() {
        System.out.println("consultar_cantidad_estudiantes");
        String programa = "";
        EstudianteDAO instance = new EstudianteDAO();
        int expResult = 0;
        int result = instance.consultar_cantidad_estudiantes(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_fecha_nacimiento method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_por_fecha_nacimiento() {
        System.out.println("consultar_por_fecha_nacimiento");
        String nacimiento = "";
        EstudianteDAO instance = new EstudianteDAO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_fecha_nacimiento(nacimiento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_celular method, of class EstudianteDAO.
     */
    @Test
    public void testConsultar_por_celular() {
        System.out.println("consultar_por_celular");
        Long celular = null;
        EstudianteDAO instance = new EstudianteDAO();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.consultar_por_celular(celular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
public class EstudianteBOTest {

    public EstudianteBOTest() {
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
     * Test of insertarEstudiante method, of class EstudianteBO.
     */
    @Test
    public void testInsertarEstudiante() {
        System.out.println("insertarEstudiante");
        EstudianteVO estudiante = null;
        EstudianteBO instance = new EstudianteBO();
        instance.insertarEstudiante(estudiante);
    }

    /**
     * Test of obtenerEstudiante method, of class EstudianteBO.
     */
    @Test
    public void testObtenerEstudiante() {
        System.out.println("obtenerEstudiante");
        String cinstitucional = "";
        EstudianteBO instance = new EstudianteBO();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.obtenerEstudiante(cinstitucional);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarEstudiante method, of class EstudianteBO.
     */
    @Test
    public void testActualizarEstudiante() {
        System.out.println("actualizarEstudiante");
        EstudianteVO estudiante = null;
        EstudianteBO instance = new EstudianteBO();
        instance.actualizarEstudiante(estudiante);
    }

    /**
     * Test of eliminarEstudiante method, of class EstudianteBO.
     */
    @Test
    public void testEliminarEstudiante() {
        System.out.println("eliminarEstudiante");
        EstudianteVO estudiante = null;
        EstudianteBO instance = new EstudianteBO();
        instance.eliminarEstudiante(estudiante);
    }

    /**
     * Test of obtenerEstudiantes method, of class EstudianteBO.
     */
    @Test
    public void testObtenerEstudiantes() {
        System.out.println("obtenerEstudiantes");
        EstudianteBO instance = new EstudianteBO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.obtenerEstudiantes();
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar_por_correo method, of class EstudianteBO.
     */
    @Test
    public void testConsultar_por_correo() {
        System.out.println("consultar_por_correo");
        String cinstitucional = "";
        EstudianteBO instance = new EstudianteBO();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.consultar_por_correo(cinstitucional);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar_por_apellido method, of class EstudianteBO.
     */
    @Test
    public void testConsultar_por_apellido() {
        System.out.println("consultar_por_apellido");
        String apellidos = "";
        EstudianteBO instance = new EstudianteBO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_apellido(apellidos);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar_por_programa method, of class EstudianteBO.
     */
    @Test
    public void testConsultar_por_programa() {
        System.out.println("consultar_por_programa");
        String programa = "";
        EstudianteBO instance = new EstudianteBO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_programa(programa);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar_cantidad_estudiantes method, of class EstudianteBO.
     */
    @Test
    public void testConsultar_cantidad_estudiantes() {
        System.out.println("consultar_cantidad_estudiantes");
        String programa = "";
        EstudianteBO instance = new EstudianteBO();
        int expResult = 0;
        int result = instance.consultar_cantidad_estudiantes(programa);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar_por_fecha_nacimiento method, of class EstudianteBO.
     */
    @Test
    public void testConsultar_por_fecha_nacimiento() {
        System.out.println("consultar_por_fecha_nacimiento");
        String nacimiento = "";
        EstudianteBO instance = new EstudianteBO();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_fecha_nacimiento(nacimiento);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultar_por_celular method, of class EstudianteBO.
     */
    @Test
    public void testConsultar_por_celular() {
        System.out.println("consultar_por_celular");
        Long celular = null;
        EstudianteBO instance = new EstudianteBO();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.consultar_por_celular(celular);
        assertEquals(expResult, result);
    }
}

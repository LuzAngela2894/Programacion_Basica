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
public class IEstudianteDAOTest {
    
    public IEstudianteDAOTest() {
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
     * Test of insertar_estudiante method, of class IEstudianteDAO.
     */
    @Test
    public void testInsertar_estudiante() {
        System.out.println("insertar_estudiante");
        EstudianteVO estudiante = null;
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar_estudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of actualizar_estudiante method, of class IEstudianteDAO.
     */
    @Test
    public void testActualizar_estudiante() {
        System.out.println("actualizar_estudiante");
        EstudianteVO estudiante = null;
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        boolean expResult = false;
        boolean result = instance.actualizar_estudiante(estudiante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar_estudiante method, of class IEstudianteDAO.
     */
    @Test
    public void testEliminar_estudiante() {
        System.out.println("eliminar_estudiante");
        String cinstitucinal = "";
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        boolean expResult = false;
        boolean result = instance.eliminar_estudiante(cinstitucinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_todos method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_todos() {
        System.out.println("consultar_todos");
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_todos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_correo method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_por_correo() {
        System.out.println("consultar_por_correo");
        String cinstitucional = "";
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.consultar_por_correo(cinstitucional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_apellido method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_por_apellido() {
        System.out.println("consultar_por_apellido");
        String apellidos = "";
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_apellido(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_programa method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_por_programa() {
        System.out.println("consultar_por_programa");
        String programa = "";
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_programa(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_cantidad_estudiantes method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_cantidad_estudiantes() {
        System.out.println("consultar_cantidad_estudiantes");
        String programa = "";
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        int expResult = 0;
        int result = instance.consultar_cantidad_estudiantes(programa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_fecha_nacimiento method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_por_fecha_nacimiento() {
        System.out.println("consultar_por_fecha_nacimiento");
        String nacimiento = "";
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        List<EstudianteVO> expResult = null;
        List<EstudianteVO> result = instance.consultar_por_fecha_nacimiento(nacimiento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar_por_celular method, of class IEstudianteDAO.
     */
    @Test
    public void testConsultar_por_celular() {
        System.out.println("consultar_por_celular");
        Long celular = null;
        IEstudianteDAO instance = new IEstudianteDAOImpl();
        EstudianteVO expResult = null;
        EstudianteVO result = instance.consultar_por_celular(celular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class IEstudianteDAOImpl implements IEstudianteDAO {

        public boolean insertar_estudiante(EstudianteVO estudiante) {
            return false;
        }

        public boolean actualizar_estudiante(EstudianteVO estudiante) {
            return false;
        }

        public boolean eliminar_estudiante(String cinstitucinal) {
            return false;
        }

        public List<EstudianteVO> consultar_todos() {
            return null;
        }

        public EstudianteVO consultar_por_correo(String cinstitucional) {
            return null;
        }

        public List<EstudianteVO> consultar_por_apellido(String apellidos) {
            return null;
        }

        public List<EstudianteVO> consultar_por_programa(String programa) {
            return null;
        }

        public int consultar_cantidad_estudiantes(String programa) {
            return 0;
        }

        public List<EstudianteVO> consultar_por_fecha_nacimiento(String nacimiento) {
            return null;
        }

        public EstudianteVO consultar_por_celular(Long celular) {
            return null;
        }
    }
}

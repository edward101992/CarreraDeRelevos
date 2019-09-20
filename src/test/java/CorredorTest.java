/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.carreraderelevos.Corredor;
import com.mycompany.carreraderelevos.Principal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class CorredorTest {
    
    public CorredorTest() {
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

    @Test
    public void testGeneraNumero() {
        System.out.println("Metodo generaNumero");
        int expResult = 1;
        int expResult1 = 2;
        int expResult2 = 3;
        int result = Principal.generaNumero();
        
        if(expResult == result || expResult1 == result || expResult2 == result){
            System.out.println("Test OK");
        }else{
            fail("Test FALLO");
        }
                    
    }
        
}

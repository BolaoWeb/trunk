/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bolaoweb.bean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alison
 */
public class TesteLoginBEAN {
    
    public TesteLoginBEAN() {
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
    public void testValidarLogin() {
        System.out.println("ValidarLogin");
        LoginBEAN instance = new LoginBEAN();
        instance.usuario = "Admin";
        instance.senha = "Admin";
        String result = instance.ValidarLogin();
        String expResult = "index";        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

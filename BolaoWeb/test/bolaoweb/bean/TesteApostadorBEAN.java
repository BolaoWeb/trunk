/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bolaoweb.bean;

import bolaoweb.model.Apostador;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Massao
 */
public class TesteApostadorBEAN {
  
  public TesteApostadorBEAN() {
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
   * Test of setApostador method, of class ApostadorBEAN.
   */
  @Test
  public void testSetApostador() {
    System.out.println("setApostador");
    Apostador apostador = new Apostador();
    apostador.setId(1);
    apostador.setNome("Juan");
    apostador.setSobrenome("Biazoto");
    apostador.setSenha("12345");
    ApostadorBEAN instance = new ApostadorBEAN();
    instance.setApostador(apostador);    
  }

  /**
   * Test of inserirApostador method, of class ApostadorBEAN.
   */
  @Test
  public void testInserirApostador() {
    System.out.println("inserirApostador");
    Apostador apostador = new Apostador();
    apostador.setId(1);
    apostador.setNome("Juan");
    apostador.setSobrenome("Biazoto");
    apostador.setSenha("12345"); 
    ApostadorBEAN instance = new ApostadorBEAN();
    instance.setApostador(apostador);
    String expResult = instance.inserirApostador();
    assertEquals(expResult, "consulta_apostador");
  }

  /**
   * Test of editarApostador method, of class ApostadorBEAN.
   */
  @Test
  public void testEditarApostador() {
    System.out.println("editarApostador");
    Apostador apostador = new Apostador();
    apostador.setId(1);
    apostador.setNome("Don");
    apostador.setSobrenome("Juan");
    apostador.setSenha("12345");
    ApostadorBEAN instance = new ApostadorBEAN();
    instance.setApostador(apostador);
    String expResult = instance.editarApostador();
    assertEquals(expResult, "consulta_apostador");
  }

  /**
   * Test of excluirApostador method, of class ApostadorBEAN.
   */
  @Test
  public void testExcluirApostador() {
    System.out.println("excluirApostador");
    Apostador apostador = new Apostador();
    apostador.setId(1);
    apostador.setNome("Don");
    apostador.setSobrenome("Juan");
    apostador.setSenha("12345");
    ApostadorBEAN instance = new ApostadorBEAN();
    String expResult = instance.excluirApostador(apostador);
    assertEquals(expResult, "consulta_apostador");
  }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bolaoweb.bean;

import bolaoweb.model.Palpite;
import java.util.Date;
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
public class TestePalpiteBEAN {
  
  public TestePalpiteBEAN() {
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
   * Test of setPalpite method, of class PalpiteBEAN.
   */
  @Test
  public void testSetPalpite1() {
    System.out.println("SetPalpite 1");
    Palpite palpite = new Palpite();
    palpite.setId(Long.parseLong("1"));
    palpite.setDataCadastro(new Date("01/10/2014"));
    palpite.setGolsCasa(1);
    palpite.setGolsVisitante(2);
    palpite.setIdApostador(Long.parseLong("1"));
    palpite.setIdPartida(Long.parseLong("1"));
    PalpiteBEAN instance = new PalpiteBEAN();
    instance.setPalpite(palpite);    
    String expResult = instance.incluirPalpite();
    assertEquals(expResult, "consulta_palpite");
  }
  
  @Test
  public void testSetPalpite2() {
    System.out.println("SetPalpite 2");
    Palpite palpite = new Palpite();
    palpite.setId(Long.parseLong("2"));
    palpite.setDataCadastro(new Date("123"));
    palpite.setGolsCasa(1);
    palpite.setGolsVisitante(2);
    palpite.setIdApostador(Long.parseLong("1"));
    palpite.setIdPartida(Long.parseLong("1"));
    PalpiteBEAN instance = new PalpiteBEAN();
    instance.setPalpite(palpite);
    String expResult = instance.incluirPalpite();
    assertEquals(expResult, "consulta_palpite");
  }
  
  @Test
  public void testSetPalpite3() {
    System.out.println("SetPalpite 3");
    Palpite palpite = new Palpite();
    palpite.setId(Long.parseLong(""));
    palpite.setDataCadastro(new Date("01/10/2014"));
    palpite.setGolsCasa(1);
    palpite.setGolsVisitante(2);
    palpite.setIdApostador(Long.parseLong("1"));
    palpite.setIdPartida(Long.parseLong("1"));
    PalpiteBEAN instance = new PalpiteBEAN();
    instance.setPalpite(palpite);
    String expResult = instance.incluirPalpite();
    assertEquals(expResult, "consulta_palpite");
  }
  
  @Test
  public void testSetPalpite4() {
    System.out.println("SetPalpite 4");
    Palpite palpite = new Palpite();
    palpite.setId(Long.parseLong(null));
    palpite.setDataCadastro(new Date("01/10/2014"));
    palpite.setGolsCasa(1);
    palpite.setGolsVisitante(2);
    palpite.setIdApostador(Long.parseLong("1"));
    palpite.setIdPartida(Long.parseLong("1"));
    PalpiteBEAN instance = new PalpiteBEAN();
    instance.setPalpite(palpite);
    String expResult = instance.incluirPalpite();
    assertEquals(expResult, "consulta_palpite");
  }
}

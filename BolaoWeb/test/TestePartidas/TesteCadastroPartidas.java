package TestePartidas;

import bolaoweb.bean.PartidasBEAN;
import bolaoweb.model.Partidas;
import bolaoweb.model.Times;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Danilo Passafaro
 */
public class TesteCadastroPartidas{
    SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
    Partidas partida;
    PartidasBEAN partidasBEAN;
    Times timeVisitante, timeCasa;
    
    public TesteCadastroPartidas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCadastrarPartida1() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("123"));
        
        timeCasa.setNome("MARINGA FC");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(0);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(0);
        
        partidasBEAN.setPartidas(partida);
        assertEquals("Data inválida", partidasBEAN.salvarPartida(), "consulta_partida");
    }
    
    @Test
    public void testCadastrarPartida2() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("30/11/2014"));
        
        timeCasa.setNome("LUSA");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(0);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(0);
        
        partidasBEAN.setPartidas(partida);
        //assertEquals("Time da casa informado não existe", partidasBEAN.salvarPartida(), "consulta_partida");
        assertEquals(partidasBEAN.salvarPartida(), "consulta_partida");
    }
    
    @Test
    public void testCadastrarPartida3() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("30/11/2014"));
        
        timeCasa.setNome("MARINGA FC");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(-5);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(0);
        
        partidasBEAN.setPartidas(partida);
        assertEquals("Placar não pode conter valor negativo", partidasBEAN.salvarPartida(), "consulta_partida");
    }
    
    @Test
    public void testCadastrarPartida4() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("30/11/2014"));
        
        timeCasa.setNome("MARINGA FC");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(2);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(1);
        
        partidasBEAN.setPartidas(partida);
        assertEquals("Partida ainda não realizada não pode possuir placar atribuído.", partidasBEAN.salvarPartida(), "consulta_partida");
    }
    
    @Test
    public void testCadastrarPartida5() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("30/11/2014"));
        
        timeCasa.setNome("MARINGA FC");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(0);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(0);
        
        partidasBEAN.setPartidas(partida);
        assertEquals(partidasBEAN.salvarPartida(), "consulta_partida");
    }
    
    @Test
    public void testCadastrarPartida6() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("01/01/2014"));
        
        timeCasa.setNome("MARINGA FC");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(0);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(0);
        
        partidasBEAN.setPartidas(partida);
        assertEquals("Placar é obrigatório para partidas já realizadas.", partidasBEAN.salvarPartida(), "consulta_partida");
    }
    
    @Test
    public void testCadastrarPartida7() throws ParseException{
        partida = new Partidas();
        partidasBEAN = new PartidasBEAN();
        timeCasa = new Times();
        timeVisitante = new Times();
        
        partida.setData(formater.parse("30/11/2014"));
        
        timeCasa.setNome("MARINGA FC");
        partida.setTimeCasa(timeCasa);
        partida.setGolsTimeCasa(2);
        
        timeCasa.setNome("AMAFUSA");
        partida.setTimeVisitante(timeVisitante);
        partida.setGolsTimeVisitante(0);
        
        partidasBEAN.setPartidas(partida);
        assertEquals(partidasBEAN.salvarPartida(), "consulta_partida");
    }
}

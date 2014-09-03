package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Partidas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Danilo Passafaro
 */
public class PartidasDAO {
    private Session sessao;
    private Transaction transacao;
    private List<Partidas> lista;
    
    public List<Partidas> getLista() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
            
        Criteria criteria = sessao.createCriteria(Partidas.class);
        this.lista = criteria.list();
        sessao.close();
        
        return lista;
    }
    
    public void insertPartida(Partidas p){
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            Partidas partida = new Partidas();
            partida.setIdTimeCasa(p.getIdTimeCasa());
            partida.setIdTimeVisitante(p.getIdTimeVisitante());
            partida.setData(p.getData());
            partida.setGolsTimeCasa(p.getGolsTimeCasa());
            partida.setGolsTimeVisitante(p.getGolsTimeVisitante());

            sessao.save(partida);
            transacao.commit();
        
        } catch (Exception e) {
            e.printStackTrace();
        
        } finally {
            sessao.close();
        }
    }
    
    public void deletePartida(Partidas p){
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(p);
            transacao.commit();
        
        } catch (Exception e) {
            e.printStackTrace();
        
        } finally {
            sessao.close();
        }
    }
    
    public void updatePartida(Partidas p){
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(p);
            transacao.commit();
        
        } catch (Exception e) {
            e.printStackTrace();
        
        } finally {
            sessao.close();
        }
    }
}

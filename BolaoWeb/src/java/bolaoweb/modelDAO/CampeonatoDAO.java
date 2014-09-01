package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Campeonato;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CampeonatoDAO {

    private Session session;
    private Transaction trans;
    private List<Campeonato> listaCampeonato;

    public List<Campeonato> getLista(){
        session = HibernateUtil.getSessionFactory().openSession();

        Criteria crit = session.createCriteria(Campeonato.class);
        this.listaCampeonato = crit.list();

        return listaCampeonato;
    }
    
    public void inserirCampeonato( Campeonato campeonato ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.save(campeonato);
            trans.commit();
            session.close();            
        } catch ( HibernateException e ){
            e.printStackTrace();
        } 
    }

    public void editarCampeonato( Campeonato campeonato ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.merge(campeonato);
            trans.commit();
            session.close();
        } catch( HibernateException e ){
            e.printStackTrace();
        }
    }

    public void excluirCampeonato( Campeonato campeonato ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.delete(campeonato);
            trans.commit();
            session.close();
        } catch( HibernateException e ){
            e.printStackTrace();
        }
    }
}

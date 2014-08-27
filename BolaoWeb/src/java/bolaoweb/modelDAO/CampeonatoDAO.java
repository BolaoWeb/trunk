package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Campeonato;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CampeonatoDAO {
    
    public CampeonatoDAO(){
        
    }
    
    public void inserirCampeonato( Campeonato campeonato ){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();

            session.save(campeonato);
            trans.commit();
            session.close();            
        } catch ( HibernateException e ){
            e.printStackTrace();
        } 
    }

    public void editarCampeonato( Campeonato campeonato ){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();

            session.merge(campeonato);
            trans.commit();
            session.close();
        } catch( HibernateException e ){
            e.printStackTrace();
        }
    }

    public void excluirCampeonato( Campeonato campeonato ){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();

            session.delete(campeonato);
            trans.commit();
            session.close();
        } catch( HibernateException e ){
            e.printStackTrace();
        }
    }
}

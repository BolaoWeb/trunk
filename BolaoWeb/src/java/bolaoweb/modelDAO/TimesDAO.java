package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Times;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Massao
 */
public class TimesDAO {
    
    public TimesDAO(){
        
    }
    
    public void incluirTime(Times equipe){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            
            session.save(equipe);
            trans.commit();
            session.close();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }
    
    public void alterarTime(Times equipe){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            
            session.merge(equipe);
            trans.commit();
            session.close();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }
    
    public void excluirTime(Times equipe){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            
            session.delete(equipe);
            trans.commit();
            session.close();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }
}

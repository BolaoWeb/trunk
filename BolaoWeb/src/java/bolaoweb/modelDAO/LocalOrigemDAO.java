package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.LocalOrigem;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Massao
 */
public class LocalOrigemDAO {
    
    public LocalOrigemDAO(){
        
    }
    
    public void incluirLocalOrigem(LocalOrigem origem){        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            
            session.save(origem);
            trans.commit();
            session.close();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }
    
    public void alterarLocalOrigem(LocalOrigem origem){        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            
            session.merge(origem);
            trans.commit();
            session.close();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }    
    
    public void excluirLocalOrigem(LocalOrigem origem){        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            
            session.delete(origem);
            trans.commit();
            session.close();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Palpite;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Massao
 */
public class PalpiteDAO {
    
    public PalpiteDAO(){
        
    }
    
    public void incluirPalpite(Palpite equipe){
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
    
    public void alterarPalpite(Palpite equipe){
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
    
    public void excluirPalpite(Palpite equipe){
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

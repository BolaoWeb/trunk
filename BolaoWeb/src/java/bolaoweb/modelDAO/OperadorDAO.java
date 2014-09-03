package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Operador;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OperadorDAO {

    private Session session;
    private Transaction trans;
    private List<Operador> listaOperador;

    public List<Operador> getLista(){
        session = HibernateUtil.getSessionFactory().openSession();

        Criteria crit = session.createCriteria(Operador.class);
        this.listaOperador = crit.list();
        return listaOperador;
    }
    
    public void inserirOperador( Operador operador ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.save(operador);
            trans.commit();
        } catch ( Exception e ){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void editarOperador( Operador operador ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.update(operador);
            trans.commit();
        } catch( Exception e ){
            e.printStackTrace();
        } finally{
            session.close();
        }
    }

    public void excluirOperador( Operador operador ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.delete(operador);
            trans.commit();
        } catch( Exception e ){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

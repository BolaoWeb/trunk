package bolaoweb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import bolaoweb.model.Times;
import bolaoweb.modelDAO.TimesDAO;
import java.util.Objects;

/**
 *
 * @author Massao
 */

@ManagedBean
@SessionScoped
public class TimesBEAN {
    
    private Times equipe = new Times();
    private TimesDAO timeDAO =new TimesDAO();
    
    public TimesBEAN(){
        
    }

    public Times getEquipe() {
        return equipe;
    }

    public void setEquipe(Times equipe) {
        this.equipe = equipe;
    }

    public String incluirTime(){
        timeDAO.incluirTime(equipe);
        return "incluído";
    }
    
    public String alterarTime(){
        timeDAO.alterarTime(equipe);
        return "alterado";
    }
        
    public String excluirTime(){
        timeDAO.excluirTime(equipe);
        return "excluido";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.equipe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TimesBEAN other = (TimesBEAN) obj;
        if (!Objects.equals(this.equipe, other.equipe)) {
            return false;
        }
        return true;
    }

}

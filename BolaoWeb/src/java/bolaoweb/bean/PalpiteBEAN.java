package bolaoweb.bean;

import bolaoweb.model.Palpite;
import bolaoweb.modelDAO.PalpiteDAO;
import java.util.Objects;

/**
 *
 * @author Massao
 */
public class PalpiteBEAN {
    
    private Palpite palpite = new Palpite();
    private PalpiteDAO palpiteDAO = new PalpiteDAO();

    public Palpite getPalpite() {
        return palpite;
    }

    public void setPalpite(Palpite palpite) {
        this.palpite = palpite;
    }

    public PalpiteDAO getPalpiteDAO() {
        return palpiteDAO;
    }

    public void setPalpiteDAO(PalpiteDAO palpiteDAO) {
        this.palpiteDAO = palpiteDAO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.palpite);
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
        final PalpiteBEAN other = (PalpiteBEAN) obj;
        if (!Objects.equals(this.palpite, other.palpite)) {
            return false;
        }
        return true;
    }
    
    public String incluirPalpite(Palpite palpite){
        palpiteDAO.incluirPalpite(palpite);
        return "incluído";
    }
    
    
    public String alterarPalpite(Palpite palpite){
        palpiteDAO.alterarPalpite(palpite);
        return "alterado";
    }
    
    
    public String excluirPalpite(Palpite palpite){
        palpiteDAO.excluirPalpite(palpite);
        return "excluído";
    }
    
}

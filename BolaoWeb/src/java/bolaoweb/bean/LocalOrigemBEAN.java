package bolaoweb.bean;

import bolaoweb.model.LocalOrigem;
import bolaoweb.modelDAO.LocalOrigemDAO;
import java.util.Objects;

/**
 *
 * @author Massao
 */
public class LocalOrigemBEAN {
    
    private LocalOrigem origem = new LocalOrigem();
    private LocalOrigemDAO origemDAO = new LocalOrigemDAO();
    
    public LocalOrigemBEAN(){
        
    }

    public LocalOrigem getOrigem() {
        return origem;
    }

    public void setOrigem(LocalOrigem origem) {
        this.origem = origem;
    }

    public LocalOrigemDAO getOrigemDAO() {
        return origemDAO;
    }

    public void setOrigemDAO(LocalOrigemDAO origemDAO) {
        this.origemDAO = origemDAO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.origem);
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
        final LocalOrigemBEAN other = (LocalOrigemBEAN) obj;
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        return true;
    }
}

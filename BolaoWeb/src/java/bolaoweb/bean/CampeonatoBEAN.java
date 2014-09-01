package bolaoweb.bean;

import bolaoweb.model.Campeonato;
import bolaoweb.modelDAO.CampeonatoDAO;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CampeonatoBEAN {

    private Campeonato campeonato = new Campeonato();
    private CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
    private List<Campeonato> listaCampeonato;

    public CampeonatoBEAN() {
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.campeonato);
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
        final CampeonatoBEAN other = (CampeonatoBEAN) obj;
        if (!Objects.equals(this.campeonato, other.campeonato)) {
            return false;
        }
        return true;
    }

    public String inserirCampeonato(){
        campeonatoDAO.inserirCampeonato(campeonato);
        campeonato.setNome(null);
        campeonato.setEscopo(null);
        campeonato.setDatainicio(null);
        campeonato.setDatafim(null);
        campeonato.setTipo(null);
        campeonato.setObservacao(null);
        return "index";
    }
    
    public String editarCampeonato(){
        campeonatoDAO.editarCampeonato(campeonato);
        return "index";
    }
        
    public String excluirCampeonato(){
        campeonatoDAO.excluirCampeonato(campeonato);
        return "index";
    }

    public List listarCampeonato(){
        listaCampeonato = campeonatoDAO.getLista();
        return this.listaCampeonato;
    }
}

package bolaoweb.bean;

import bolaoweb.model.Partidas;
import bolaoweb.modelDAO.PartidasDAO;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Danilo Passafaro
 */

@ManagedBean
@SessionScoped
public class PartidasBEAN {
    
    private Partidas partidas = new Partidas();
    private PartidasDAO partidasDAO = new PartidasDAO();
    private List<Partidas> listaPartidas;
    private boolean flagEditar = false;

    public PartidasBEAN() {
    }
    
    public List<Partidas> consultarPartidas(){
        listaPartidas = partidasDAO.getLista();
        return this.listaPartidas;
    }
    
    public String salvarPartida(){
        if(flagEditar){
            partidasDAO.updatePartida(partidas);
            flagEditar = false;
        } else {
            partidasDAO.insertPartida(partidas);
        }
        resetObject();
        return "consulta_partida";
    }
    
    public String deletePartida(Partidas partida){
        this.partidas = partida;
        partidasDAO.deletePartida(partidas);
        resetObject();
        return "consulta_partida";
    }
    
    public void carregarPartida(Partidas partida){
        this.partidas = partida;
        flagEditar = true;
    }
        
    private void resetObject(){
        this.partidas.setData(null);
        this.partidas.setGolsTimeCasa(0);
        this.partidas.setGolsTimeVisitante(0);
        this.partidas.setIdTimeCasa(0);
        this.partidas.setIdTimeVisitante(0);
    }

    public Partidas getPartidas() {
        return partidas;
    }

    public void setPartidas(Partidas partidas) {
        this.partidas = partidas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.partidas);
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
        final PartidasBEAN other = (PartidasBEAN) obj;
        if (!Objects.equals(this.partidas, other.partidas)) {
            return false;
        }
        return true;
    }
    
    
}

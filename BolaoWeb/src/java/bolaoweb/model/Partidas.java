package bolaoweb.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Danilo Passafaro
 */

@Entity
@Table(name="partidas")
public class Partidas implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private int idTimeCasa;
    private int idTimeVisitante;
    private String data;
    private int golsTimeCasa;
    private int golsTimeVisitante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTimeCasa() {
        return idTimeCasa;
    }

    public void setIdTimeCasa(int idTimeCasa) {
        this.idTimeCasa = idTimeCasa;
    }

    public int getIdTimeVisitante() {
        return idTimeVisitante;
    }

    public void setIdTimeVisitante(int idTimeVisitante) {
        this.idTimeVisitante = idTimeVisitante;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getGolsTimeCasa() {
        return golsTimeCasa;
    }

    public void setGolsTimeCasa(int golsTimeCasa) {
        this.golsTimeCasa = golsTimeCasa;
    }

    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(int golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final Partidas other = (Partidas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}

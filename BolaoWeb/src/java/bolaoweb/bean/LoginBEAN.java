package bolaoweb.bean;

import bolaoweb.model.Apostador;
import bolaoweb.model.Operador;
import bolaoweb.modelDAO.ApostadorDAO;
import bolaoweb.modelDAO.OperadorDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginBEAN {

    private Apostador apostador = new Apostador();
    private ApostadorDAO apostadorDAO = new ApostadorDAO();
    private List<Apostador> listaApostador;

    private Operador operador = new Operador();
    private OperadorDAO operadorDAO = new OperadorDAO();
    private List<Operador> listaOperador;

    public String usuario;
    public String senha;

    public LoginBEAN() {
        setUsuario("");
        setSenha("");

        listaApostador = apostadorDAO.getLista("");
        listaOperador = operadorDAO.getLista("");

        Apostador apostadorTemp = new Apostador();
        Operador operadorTemp = new Operador();
        

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date datanasc = formatter.parse("11/11/1992");
            apostadorTemp.setDatanascimento(datanasc);
        } catch (ParseException ex) {
            Logger.getLogger(LoginBEAN.class.getName()).log(Level.SEVERE, null, ex);
        }

        apostadorTemp.setId(1);
        apostadorTemp.setNome("Alison");
        apostadorTemp.setSobrenome("Orita");
        apostadorTemp.setApelido("Teste");
        apostadorTemp.setEmail("alison@teste.com.br");
        apostadorTemp.setSenha("Orita");
        
        if (listaApostador.isEmpty()){
            apostadorDAO.inserirApostador(apostadorTemp);
        }

        operadorTemp.setId(1);
        operadorTemp.setNome("Admin");
        operadorTemp.setSobrenome("adm");
        operadorTemp.setEmail("admin@teste.com.br");
        operadorTemp.setBoadmin(Boolean.TRUE);
        operadorTemp.setSenha("Admin");

        if (listaOperador.isEmpty()){
            operadorDAO.inserirOperador(operadorTemp);
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String ValidarLogin() {
        for (Apostador apos : listaApostador) {
            if (apos.getNome().equals(usuario) && apos.getSenha().equals(senha)) {
                apostador = apos;
                return "index";
            }
        }

        for (Operador oper : listaOperador) {
            if (oper.getNome().equals(usuario) && oper.getSenha().equals(senha)) {
                operador = oper;
                return "index";
            }
        }

        return null;
    }
    
}

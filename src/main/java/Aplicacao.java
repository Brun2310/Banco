import dominio.Conta;
import dominio.Usuario;
import view.ContaView;
import view.UsuarioView;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private List<Usuario> usuarios;
    @Inject
    private UsuarioView usuarioView;

    @Inject
    private ContaView contaView;

    @PostConstruct
    public void iniciar() {
        System.out.println("Iniciando a aplicacao");
        usuarios = new ArrayList<>();
    }

    public void createUsuario(Scanner sc) {
        getUsuarios().add(usuarioView.create(sc));
    }

    public Conta createConta(Scanner sc) {

        return contaView.createConta(sc);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}

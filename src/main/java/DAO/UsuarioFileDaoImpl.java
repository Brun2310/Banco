package DAO;

import dominio.Usuario;

public class UsuarioFileDaoImpl implements UsuarioDAO{
    @Override
    public Usuario create(Usuario usuario) {
        usuario.setCaminhoArquivo("caminho do usuário");
        System.out.println("passou na persistencia");
        return usuario;
    }
}

package services;

import DAO.UsuarioDAO;
import dominio.Usuario;
import excecoes.PrecondicaoException;

import javax.inject.Inject;

public class UsuarioServiceImpl implements UsuarioService{
    @Inject
    private UsuarioDAO usuarioDAO;

    @Override
    public Usuario create(Usuario usuario) throws PrecondicaoException {
        if (usuario.getIdade() > 18) {
            return usuarioDAO.create(usuario);
        }
        throw new PrecondicaoException("Usuario com precondições não satisfeitas");
    }
}

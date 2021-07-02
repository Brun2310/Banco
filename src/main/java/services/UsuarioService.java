package services;

import dominio.Usuario;
import excecoes.PrecondicaoException;

public interface UsuarioService {
    Usuario create(Usuario usuario) throws PrecondicaoException;

}

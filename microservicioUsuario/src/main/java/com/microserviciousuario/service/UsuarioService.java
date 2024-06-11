package com.microserviciousuario.service;

import com.microserviciousuario.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<Usuario> getAllUsuario();
    Usuario createUsuario(Usuario usuario);
}

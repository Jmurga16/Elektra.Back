package com.microserviciousuario.service.impl;

import com.microserviciousuario.entity.Usuario;
import com.microserviciousuario.repository.UsuarioRepository;
import com.microserviciousuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}

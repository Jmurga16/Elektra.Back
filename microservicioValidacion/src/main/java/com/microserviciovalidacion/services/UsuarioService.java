package com.microserviciovalidacion.services;

import com.microserviciovalidacion.dto.UsuarioDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<UsuarioDto> getAllUsuario();
    UsuarioDto createUser(UsuarioDto usuarioDto);
}

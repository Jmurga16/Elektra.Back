package com.microserviciovalidacion.services.impl;

import com.microserviciovalidacion.dto.UsuarioDto;
import com.microserviciovalidacion.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    @Value("${url.microservicio.usuario}")
    String url;

    private final RestTemplate restTemplate;

    @Override
    public List<UsuarioDto> getAllUsuario() {
        UsuarioDto[] usuarios= restTemplate.getForObject(url.concat("/lista"),UsuarioDto[].class);
        if (usuarios==null){
            return null;
        }
        return  Arrays.stream(usuarios).toList();
    }

    @Override
    public UsuarioDto createUser(UsuarioDto usuarioDto) {
        return restTemplate.postForObject(url.concat("/create"),usuarioDto,UsuarioDto.class);
    }
}

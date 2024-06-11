package com.microserviciovalidacion.controller;

import com.microserviciovalidacion.dto.UsuarioDto;
import com.microserviciovalidacion.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    ResponseEntity<List<UsuarioDto>> getAllUser(){
        if (usuarioService.getAllUsuario()==null){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return  ResponseEntity.ok(usuarioService.getAllUsuario());
    }

    @PostMapping("/create")
    ResponseEntity<UsuarioDto> createUsuario(@RequestBody @Validated UsuarioDto usuarioDto){
        return new ResponseEntity<>(usuarioService.createUser(usuarioDto),HttpStatus.CREATED);
    }
}

package com.microserviciousuario.controller;

import com.microserviciousuario.entity.Usuario;
import com.microserviciousuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/lista")
    ResponseEntity<List<Usuario>> getAllUsuario(){
        return ResponseEntity.ok(usuarioService.getAllUsuario());
    }

    @PostMapping("/create")
    ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.createUsuario(usuario), HttpStatus.CREATED);
    }
}

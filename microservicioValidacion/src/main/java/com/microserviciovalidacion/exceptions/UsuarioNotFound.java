package com.microserviciovalidacion.exceptions;


public class UsuarioNotFound extends RuntimeException{
    public UsuarioNotFound(String message) {
        super(message);
    }
}

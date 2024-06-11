package com.microserviciovalidacion.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UsuarioDto {


    private Long usuarioId;
    @NotBlank(message = "El campo nombre no debe estar vacío")
    @Pattern(regexp = "[a-zA-Z]+", message = "El nombre solo debe contener letras")
    private String nombre;
}

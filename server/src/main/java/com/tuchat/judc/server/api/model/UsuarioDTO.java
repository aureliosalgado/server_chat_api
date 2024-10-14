package com.tuchat.judc.server.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String nombre;
    private String apellido;
    private String nombreCompleto;
    private String correo;
    private String contrasenia;
    private boolean usarNombreCompleto;
    private boolean usarContrasenia;
    private boolean correoConfirmado;
    private String iconPath;
}

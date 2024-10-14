package com.tuchat.judc.server.mapper;

import com.tuchat.judc.server.model.Usuario;
import com.tuchat.judc.server.api.model.UsuarioDTO;

public class UsuarioMapper {

    // Convertir de Usuario a UsuarioDTO
    public static UsuarioDTO toDTO(Usuario usuario) {
        return UsuarioDTO.builder()
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .nombreCompleto(usuario.getNombreCompleto())
                .correo(usuario.getCorreo())
                .contrasenia(usuario.getContrasenia())
                .usarNombreCompleto(usuario.isUsaNombreCompleto())
                .usarContrasenia(usuario.isUsarContrasenia())
                .correoConfirmado(usuario.isCorreoConfirmado())
                .iconPath(usuario.getIconPath())
                .build();
    }

    // Convertir de UsuarioDTO a Usuario
    public static Usuario toEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setNombreCompleto(usuarioDTO.getNombreCompleto());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setContrasenia(usuarioDTO.getContrasenia());
        usuario.setUsaNombreCompleto(usuarioDTO.isUsarNombreCompleto());
        usuario.setUsarContrasenia(usuarioDTO.isUsarContrasenia());
        usuario.setCorreoConfirmado(usuarioDTO.isCorreoConfirmado());
        usuario.setIconPath(usuarioDTO.getIconPath());
        return usuario;
    }
}

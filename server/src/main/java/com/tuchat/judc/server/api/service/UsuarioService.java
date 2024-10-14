package com.tuchat.judc.server.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuchat.judc.server.api.model.UsuarioDTO;
import com.tuchat.judc.server.mapper.UsuarioMapper;
import com.tuchat.judc.server.model.Usuario;
import com.tuchat.judc.server.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	// Método para crear un usuario
	public Usuario crearUsuario(UsuarioDTO usuarioDTO) {
	    // Verifica si el correo ya está registrado
	    if (usuarioRepository.existsByCorreo(usuarioDTO.getCorreo())) {
	        throw new IllegalArgumentException("El correo ya está registrado");
	    }

	    // Convertir de UsuarioDTO a Usuario usando el mapeador
	    Usuario usuario = UsuarioMapper.toEntity(usuarioDTO);

	    // Guardar el usuario en la base de datos
	    return usuarioRepository.save(usuario);
	}


	// Método para obtener un usuario por ID
	public Usuario obtenerUsuarioPorId(Integer id) {
		return usuarioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
	}

	// Método para eliminar un usuario
	public void eliminarUsuario(Integer id) {
		usuarioRepository.deleteById(id);
	}
}

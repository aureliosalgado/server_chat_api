package com.tuchat.judc.server.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario  implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido", length = 50)
    private String apellido;

    @Column(name = "nombre_completo", length = 100)
    private String nombreCompleto;

    @Column(name = "correo", nullable = false, length = 100, unique = true)
    private String correo;

    @Column(name = "usa_nombre_completo", nullable = false)
    private boolean usaNombreCompleto;

    @Column(name = "contrasenia", length = 50)
    private String contrasenia;

    @Column(name = "usar_contrasenia", nullable = false)
    private boolean usarContrasenia;

    @Column(name = "correo_confirmado", nullable = false)
    private boolean correoConfirmado;

    @Column(name = "icon_path", length = 255)
    private String iconPath;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isUsaNombreCompleto() {
		return usaNombreCompleto;
	}

	public void setUsaNombreCompleto(boolean usaNombreCompleto) {
		this.usaNombreCompleto = usaNombreCompleto;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean isUsarContrasenia() {
		return usarContrasenia;
	}

	public void setUsarContrasenia(boolean usarContrasenia) {
		this.usarContrasenia = usarContrasenia;
	}

	public boolean isCorreoConfirmado() {
		return correoConfirmado;
	}

	public void setCorreoConfirmado(boolean correoConfirmado) {
		this.correoConfirmado = correoConfirmado;
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
    
}

package com.tuchat.judc.server.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UsuarioValidacion")
public class UsuarioValidacion  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 654540341069907248L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "codigo_validacion", nullable = false, length = 16)
    private String codigoValidacion;

    @Column(name = "fecha_vencimiento", nullable = false)
    private LocalDateTime fechaVencimiento;

    @Column(name = "intentos_realizados", nullable = false)
    private int intentosRealizados;

    @Column(name = "validado", nullable = false)
    private boolean validado;

    @Column(name = "create_time", nullable = false)
    private Timestamp createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_validacion", nullable = false)
    private TipoValidacion tipoValidacion;

    public enum TipoValidacion {
        CORREO,
        LOGIN
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getCodigoValidacion() {
		return codigoValidacion;
	}

	public void setCodigoValidacion(String codigoValidacion) {
		this.codigoValidacion = codigoValidacion;
	}

	public LocalDateTime getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getIntentosRealizados() {
		return intentosRealizados;
	}

	public void setIntentosRealizados(int intentosRealizados) {
		this.intentosRealizados = intentosRealizados;
	}

	public boolean isValidado() {
		return validado;
	}

	public void setValidado(boolean validado) {
		this.validado = validado;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public TipoValidacion getTipoValidacion() {
		return tipoValidacion;
	}

	public void setTipoValidacion(TipoValidacion tipoValidacion) {
		this.tipoValidacion = tipoValidacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}

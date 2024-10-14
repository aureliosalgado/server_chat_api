package com.tuchat.judc.server.model;

import java.io.Serializable;
import java.sql.Timestamp;

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
@Table(name = "Mensaje")
public class Mensaje  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5840675075203613106L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_emisor_id", nullable = false)
    private Usuario userEmisor;

    @Column(name = "mensaje")
    private String mensaje;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoMensaje tipo;

    @Column(name = "fecha_envio", nullable = false)
    private Timestamp fechaEnvio;

    public enum TipoMensaje {
        TEXTO,
        ARCHIVO
    }
}

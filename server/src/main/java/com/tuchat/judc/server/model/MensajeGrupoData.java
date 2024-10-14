package com.tuchat.judc.server.model;

import java.io.Serializable;

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
@Table(name = "MensajeGrupoData")
public class MensajeGrupoData  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7226692054024792588L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "grupo_id", nullable = false)
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name = "user_receptor_id", nullable = false)
    private Usuario userReceptor;

    @ManyToOne
    @JoinColumn(name = "mensaje_id", nullable = false)
    private Mensaje mensaje;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusMensajeGrupo status;

    public enum StatusMensajeGrupo {
        NO_ENVIADO,
        ENVIADO,
        VISTO
    }
}

package com.tuchat.judc.server.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MensajeArchivo")
public class MensajeArchivo  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4080859857892372462L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "mensaje_id", nullable = false)
    private Mensaje mensaje;

    @Column(name = "archivo_path", nullable = false, length = 255)
    private String archivoPath;

    @Column(name = "extension_archivo", nullable = false, length = 10)
    private String extensionArchivo;
}

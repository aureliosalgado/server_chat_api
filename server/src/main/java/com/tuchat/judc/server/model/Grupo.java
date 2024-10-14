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
@Table(name = "Grupo")
public class Grupo  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6486146051554429912L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "icon_path", length = 255)
    private String iconPath;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Usuario owner;
}

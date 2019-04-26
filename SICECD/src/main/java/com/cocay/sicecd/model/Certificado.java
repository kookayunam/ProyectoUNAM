package com.cocay.sicecd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="Certificado")
public class Certificado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_id_certificado")
	private int pk_id_certificado;
	
	@Column(name = "ruta")
	private String ruta;
	
	@ManyToOne(targetEntity=Profesor.class)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "fk_id_profesor",referencedColumnName="pk_id_profesor")
	private Profesor fk_id_profesor;
	
	@ManyToOne(targetEntity=Curso.class)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "fk_id_curso", referencedColumnName="pk_id_curso")
	private Curso fk_id_curso;

	public int getPk_id_certificado() {
		return pk_id_certificado;
	}

	public void setPk_id_certificado(int pk_id_certificado) {
		this.pk_id_certificado = pk_id_certificado;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Profesor getFk_id_profesor() {
		return fk_id_profesor;
	}

	public void setFk_id_profesor(Profesor fk_id_profesor) {
		this.fk_id_profesor = fk_id_profesor;
	}

	public Curso getFk_id_curso() {
		return fk_id_curso;
	}

	public void setFk_id_curso(Curso fk_id_curso) {
		this.fk_id_curso = fk_id_curso;
	}

}
package com.reto.demo.Reto.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Cliente")
@Entity
@Table(name = "tbl_clientes")
public class Cliente {

	@ApiModelProperty(value = "El identificador del cliente", required = false, hidden = true)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ApiModelProperty(value = "El nombre del cliente", required = true)
	@Column(name = "nombre")
	private String nombre;
	
	@ApiModelProperty(value = "El apellido del cliente", required = true)
	@Column(name = "apellido")
	private String apellido;
	
	
	@ApiModelProperty(value = "La fecha de nacimiento del cliente", required = true,dataType = "java.util.Date")
	@Column(name = "fecha_nacimiento")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
		
	
}

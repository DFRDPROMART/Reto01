package com.reto.demo.Reto.model;

import java.util.Date;

public class ClienteModelo {
	
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	private Date fechaNacimiento;
	
	
	public ClienteModelo(Long id, String nombre, String apellido, int edad, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Long getId() {
		return id;
	}
	
	

}

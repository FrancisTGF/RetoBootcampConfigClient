package com.nttdata.bootcamp.RetoBootcampConfigClient.repository;

public class Usuario {
	private String email;
	private String nombre;
	private String telefono;
	private String direccion;
	
	public Usuario() {
		super();
	}

	public Usuario(String email, String nombre, String telefono, String direccion) {
		this.email = email;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Usuario clone() {
		
		return new Usuario(this.email, this.nombre,this.telefono, this.direccion);
		
	}
}

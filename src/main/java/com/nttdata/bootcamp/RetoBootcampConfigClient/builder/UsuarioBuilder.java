package com.nttdata.bootcamp.RetoBootcampConfigClient.builder;

import com.nttdata.bootcamp.RetoBootcampConfigClient.repository.Usuario;

public class UsuarioBuilder {

	public Usuario build(String nombre, String email, String telefono, String direccion) {
		Usuario usuario = new Usuario();
		if(nombre==null) {
			usuario.setNombre("Antonio");
		}else {
			usuario.setNombre(nombre);
		
		}
		if(email==null) {
			usuario.setEmail("anonio@antonnio.com");
		}else {
			usuario.setEmail(email);
		}
		if(telefono==null) {
			usuario.setTelefono("55555545");
		}else {
			usuario.setTelefono(telefono);
		}
		
		if(direccion==null) {
			usuario.setDireccion("calle alameda");
		}else {
			usuario.setDireccion(direccion);
		}
		return usuario;
		
	}
	
}

package com.nttdata.bootcamp.RetoBootcampConfigClient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.RetoBootcampConfigClient.builder.UsuarioBuilder;
import com.nttdata.bootcamp.RetoBootcampConfigClient.repository.Usuario;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
@RefreshScope
@RestController
public class UsuarioController {
	
	private Counter  counter;

	public UsuarioController(MeterRegistry registry) {
		
		this.counter =  Counter.builder("invocaciones.usuario").description("Invocaciones Totales de UsuarioController").register(registry);
	}
	private List<Usuario> listado =new ArrayList<>();
	
	@Value("${usuario.nombre}")
	private String nombre;
	
	@Value("${usuario.email}")
	private String email;
	
	@Value("${usuario.telefono}")
	private String telefono;
	
	@Value("${usuario.direccion}")
	private String direccion;
	
	@GetMapping("/usuario")
	public ResponseEntity<Usuario> getUsuarioRefresh() {
		Usuario usuario= new UsuarioBuilder().build(nombre, email, telefono, direccion);
		counter.increment();
		return new ResponseEntity<Usuario>(usuario , HttpStatus.OK);
	}
	
}

package com.prueba.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.records.Response;

import reactor.core.publisher.Mono;

import com.prueba.records.Estudiante;
import com.prueba.records.EstudianteDto;

@Controller
public class EstudiantesRestController {
	
	@QueryMapping
	public Mono<Response<EstudianteDto>> consultarEstudiantes(){
		  EstudianteDto estudiante0=new EstudianteDto("Sara", "Morita", 15, 1);
		  EstudianteDto estudiante1=new EstudianteDto("Sara", "Morita", 15, 1);
		  return Mono.just(new Response<EstudianteDto>(200, "OK", List.of(estudiante0, estudiante1)));
	}

	
	@QueryMapping
	public Mono<Response<EstudianteDto>> consultarEstudiante(@Argument String input){
		  EstudianteDto estudiante=new EstudianteDto("Sara", "Morita", 15, 1);
		  return Mono.just(new Response<EstudianteDto>(200, "OK", List.of(estudiante)));
	}
	
	@MutationMapping
	public Mono<Response<EstudianteDto>>  registrarEstudiante(@Argument Estudiante input){
		 EstudianteDto estudiante=new EstudianteDto("Sara", "Morita", 15, 1);
		 return Mono.just(new Response<EstudianteDto>(200, "OK", List.of(estudiante)));
	}
	
	
	@QueryMapping
	public Mono<String> saludo(){
		  return Mono.just("Hola");
	}
	
}

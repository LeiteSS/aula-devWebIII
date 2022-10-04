package com.fatec.grupo3.servico;

import java.util.List;
import java.util.Optional;

import com.fatec.grupo3.model.entities.Curso;

public interface CursoService {
	
	 List<Curso> consultaTodos();
	 Optional<Curso> consultaPorTitulo(String titulo);
	 Optional<Curso> save(Curso curso);
	 void delete (Long id);
	 Optional<Curso> atualiza (Curso curso);
}

package app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.Entity.Biblioteca;
import app.Repository.BibliotecaRepository;

@Service
public class BibliotecaService {
	
	@Autowired
	private BibliotecaRepository bibliotecaRepository;
	
	public String save(Biblioteca biblioteca) {
		this.bibliotecaRepository.save(biblioteca);
		return "salvo com sucesso";
	}
	
	public String update(long id, Biblioteca biblioteca) {
		
		biblioteca.setId(id);
		this.bibliotecaRepository.save(biblioteca);
		return "alterado com sucesso";
	}
	
	
	public List<Biblioteca> listAll(){
		
		return this.bibliotecaRepository.findAll();
		
	}
	
	public Biblioteca findById(long id) {
		
		Optional<Biblioteca> biblioteca = this.bibliotecaRepository.findById(id);
		return biblioteca.get();		
	}
	
	public String delete(long id) {
		
		this.bibliotecaRepository.deleteById(id);
		return "deletado com sucesso";
		
	}
	
}

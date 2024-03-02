package app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.Entity.Livro;
import app.Repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public String save(Livro livro) {
		this.livroRepository.save(livro);
		return "livro cadastrado";
	}
	
	public String update(long id, Livro livro) {
		
		livro.setId(id);
		this.livroRepository.save(livro);
		return "altermos o livro cabrão";
	}
	
	public List<Livro> listAll(){
		
		return this.livroRepository.findAll();
		
	}
	
	public Livro findById(long id) {
	
	Optional<Livro> livro = this.livroRepository.findById(id);
	return livro.get();
	}
	
	public String delete (long id) {
		
		this.livroRepository.deleteById(id);
		return "deletamos la chefia";
	}
	
}

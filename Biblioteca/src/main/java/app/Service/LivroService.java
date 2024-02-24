package app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.Entity.Livro;

@Service
public class LivroService {
	List<Livro> lista = new ArrayList<>();
	
	public String save(Livro livro) {
		lista.add(livro);
		return livro.getTitulo() +" Salvo com sucesso";
	}
	
	public String update(long id, Livro livro) {
		
		lista = this.listAll();
		
		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, livro);
					return livro.getTitulo()+ "alterado com sucesso";
				}
			}
		return "Livro não encontrado";
	}
	
	public List<Livro> listAll(){
		
		Livro livro = new Livro(1, "nulo", "Percy", "perdeu o raio", 2005, 240);
		lista.add(livro);
		return lista;
		
	}
	
	public Livro findById(long idLivro) {
	
	lista = this.listAll();
	if(lista != null)
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId() == idLivro) {
				return lista.get(i);
			}
		}
	
	return null;
	
	}
	
	public String delete (long idLivro) {
		
		lista = this.listAll();
		if (lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idLivro) {
					lista.remove(lista.get(i));
					return "deletado com sucesso";
				}
			}
		return "Não encontramos seu livro";
	}
	
}

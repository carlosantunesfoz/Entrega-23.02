package app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.Entity.Biblioteca;

@Service
public class BibliotecaService {
	List<Biblioteca> lista = new ArrayList<>();
	
	public String save(Biblioteca biblioteca) {
		lista.add(biblioteca);
		return biblioteca.getNome()+ "salvo com sucesso";
	}
	
	public List<Biblioteca> listAll(){
		
		Biblioteca biblioteca1 = new Biblioteca(1, "Porto meira", 4599933);
		lista.add(biblioteca1);
	}
	
}

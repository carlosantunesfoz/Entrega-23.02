package app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.Entity.Editora;
import app.Repository.EditoraRepository;

@Service
public class EditoraService {
	
	@Autowired
	private EditoraRepository editoraRepository;

	public String save(Editora editora) {
		this.editoraRepository.save(editora);
		return "salvou ai chefia";
	}

	public String update(long id, Editora editora) {
		editora.setId(id);
		this.editoraRepository.save(editora);
		return "alterado la meu nobre";
	}

	public List<Editora> listAll(){

		return this.editoraRepository.findAll();

	}

	public Editora findById(long id) {

		Optional<Editora> editora = this.editoraRepository.findById(id);
		return editora.get();

	}

	public String delete(long id) {

		this.editoraRepository.deleteById(id);
		return "deletemos o trme lá";

	}
}

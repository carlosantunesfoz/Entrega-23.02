package app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.Entity.Autor;
import app.Repository.AutorRepository;

@Service
public class AutorService {
		
	@Autowired
		private AutorRepository autorRepository;
		
		public String save(Autor autor) {
			this.autorRepository.save(autor);
			return "salvo com sucesso";
		}

		public String update(long id, Autor autor) {
			
			autor.setId(id);
			this.autorRepository.save(autor);
			return "alterado com sucesso";
		}

		public List<Autor> listAll(){

			return this.autorRepository.findAll();

		}

		public Autor findById(long id) {

			Optional<Autor> autor = this.autorRepository.findById(id);
			return autor.get();
		}

		public String delete(long id) {

			this.autorRepository.deleteById(id);
			return "excluido, tmj";

}
}

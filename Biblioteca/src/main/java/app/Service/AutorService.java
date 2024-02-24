package app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.Entity.Autor;

@Service
public class AutorService {
		List<Autor> lista = new ArrayList<>();

		public String save(Autor autor) {
			lista.add(autor);
			return autor.getNome()+ " salvo com sucesso";
		}

		public String update(long id, Autor autor) {
			
			lista = this.listAll();

			if(lista != null)
				for(int i=0; i<lista.size(); i++) {
					if(lista.get(i).getId() == id) {
						lista.set(i, autor);
						return autor.getNome()+ " alterado com sucesso";
					}
				}

			return "autor ainda não nasceu";
		}

		public List<Autor> listAll(){

			Autor autor = new Autor(1, "Rick Riordian", "0821", 52);
			Autor autor2 = new Autor(2, "Cristina grey", "1981", 41);

			lista.add(autor);
			lista.add(autor2);

			return lista;

		}

		public Autor findById(long idAutor) {

			// banco de dados
			lista = this.listAll();

			if(lista != null)
				for(int i=0; i<lista.size(); i++) {
					if(lista.get(i).getId() == idAutor) {
						return lista.get(i);
					}
				}

			return null;

		}

		public String delete(long idAutor) {

			// banco de dados
			lista = this.listAll();

			if(lista != null)
				for(int i=0; i<lista.size(); i++) {
					if(lista.get(i).getId() == idAutor) {
						lista.remove(lista.get(i));
						return "Deletado com sucesso";
					}
				}

			return "Escreve direito ai";

		}

}

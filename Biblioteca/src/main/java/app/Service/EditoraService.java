package app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.Entity.Editora;

@Service
public class EditoraService {
	List<Editora> lista = new ArrayList<>();

	public String save(Editora editora) {
		lista.add(editora);
		return editora.getNome()+ " salvo com sucesso";
	}

	public String update(long id, Editora editora) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, editora);
					return editora.getNome()+ " alterado com sucesso";
				}
			}

		return "Editora não existe";
	}

	public List<Editora> listAll(){

		Editora editora = new Editora(1, "santaCcasa", "alamedaAmetista", "deuErro");
		Editora editora2 = new Editora(2, "casaSanta", "alamedaCristais", "45857");

		lista.add(editora);
		lista.add(editora2);

		return lista;

	}

	public Editora findById(long idEditora) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idEditora) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idEditora) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idEditora) {
					lista.remove(lista.get(i));
					return "no hay mas";
				}
			}

		return "Não encontrado para deletar";

	}
}

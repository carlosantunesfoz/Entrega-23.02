package app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.Entity.Biblioteca;
									/* herda */				/*entidade,  tipo de dado*/
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long>{
	
}

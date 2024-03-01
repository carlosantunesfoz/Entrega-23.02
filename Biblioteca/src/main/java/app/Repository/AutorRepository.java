package app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.Entity.Autor;
						
public interface AutorRepository extends JpaRepository<Autor, Long>{
	
}
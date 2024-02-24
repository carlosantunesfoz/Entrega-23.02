package app.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Livro {

	private long id;
	private String ISSN;
	private String titulo;
	private String sinopse;
	private Integer ano;
	private Integer Npagina;
}
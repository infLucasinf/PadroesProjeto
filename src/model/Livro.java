/*
 * O pacote model possui as classes que já fazem parte do trabalho, e servem como base para as duas questões.
 * Essa é a classe Livro que herda da classe abstrato Obra.
 */

package model;

public class Livro extends Obra {

	private String editora;
	private String idioma;
	private String autor;
	private Integer numeroPaginas;

	public Livro(String titulo, Integer ano, Double avaliacao, String editora, String idioma, String autor,
			Integer numeroPaginas) {
		super(titulo, ano, avaliacao);
		this.editora = editora;
		this.idioma = idioma;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

}

    

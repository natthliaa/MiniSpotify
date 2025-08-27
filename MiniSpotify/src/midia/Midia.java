package midia;

public class Midia {
    private String titulo;
    private String artista;
    private double duracao;
    Genero genero;

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getArtista() {
        return artista;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Genero getGenero() {
        return genero;
    }

    public Midia(String titulo, String artista, double duracao, Genero genero, Categoria categoria) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
        this.categoria = categoria;

    }
}
package br.com.etecia.myapp;

public class Livros {

    private String titulo;
    private String categoria;
    private int imgLivro;
    private double preco;

    public Livros(String titulo, String categoria, int imgLivro, double preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.imgLivro = imgLivro;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImgLivro() {
        return imgLivro;
    }

    public void setImgLivro(int imgLivro) {
        this.imgLivro = imgLivro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

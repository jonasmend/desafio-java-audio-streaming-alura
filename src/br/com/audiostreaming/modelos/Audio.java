package br.com.audiostreaming.modelos;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
//        System.out.println("Audio adicionada às suas músicas curtidas!");
        this.curtidas++;
    }

    public void reproduzir() {
//        System.out.println("Reproduzindo " + titulo);
        this.totalReproducoes++;
    }
}

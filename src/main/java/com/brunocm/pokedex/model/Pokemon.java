package com.brunocm.pokedex.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Pokemon {
    @Id
    private String id;

    private String nome;
    private String categoria;
    private String habilidades;
    private Double peso;

    public Pokemon(String nome, String categoria, String habilidades, Double peso) {
        this.nome = nome;
        this.categoria = categoria;
        this.habilidades = habilidades;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public Double getPeso() {
        return peso;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id.equals(pokemon.id) &&
                nome.equals(pokemon.nome) &&
                categoria.equals(pokemon.categoria) &&
                habilidades.equals(pokemon.habilidades) &&
                peso.equals(pokemon.peso);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, categoria, habilidades, peso);
    }
}

package com.example.exame;

public class Cachorro {

    private String nome;
    private String sexo;
    private String raca;

    public Cachorro(String nome, String sexo, String raca){

        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaca() {
        return raca;
    }

}

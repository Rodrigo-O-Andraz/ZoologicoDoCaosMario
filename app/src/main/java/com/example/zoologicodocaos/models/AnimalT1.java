package com.example.zoologicodocaos.models;

import java.lang.StringBuilder;

public class AnimalT1
{
    private String especie;
    private String habilidade;
    
    public AnimalT1(String especie, String habilidade) {
        this.especie = especie;
        this.habilidade = habilidade;
    }
    
    public String getEspecie() {
        return this.especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getHabilidade() {
        return this.habilidade;
    }
    
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Especie: ").append(especie).append("\n");
        sb.append("Habilidade: ").append(habilidade).append("\n");
        
        return sb.toString();
    }
}
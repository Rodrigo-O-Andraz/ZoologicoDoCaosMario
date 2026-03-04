package com.example.zoologicodocaos.models;

import java.util.HashMap;
import java.lang.StringBuilder;

public class ZoologicoDoCaosT1 
{
    private String nome;
    private HashMap<String, AnimalT1> animais;
    
    public ZoologicoDoCaosT1(String nome) {
        this.nome = nome;
        animais = new HashMap();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public HashMap getAnimais() {
        return animais;
    }
    
    public ZoologicoDoCaosT1 addAnimal(AnimalT1 animal) {
        if(!this.existeKey(animal.getEspecie()) )
            this.animais.put(animal.getEspecie(), animal);
            
        return this;
    }
    
    private boolean existeKey(String str)
    {
        return this.animais.containsKey(str);
    }

    public void remAnimal(AnimalT1 animal) {
        this.animais.remove(animal.getEspecie());
    }
    
    public void clear()
    {
        this.animais.clear();
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("Animais: ").append("\n").append(animais.toString());
        
        return sb.toString();   
    }
}
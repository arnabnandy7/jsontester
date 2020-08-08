package com.arnab.json.model;
import java.util.List;
public class DexList
{
    private List<Pokemon> pokemon;

    public void setPokemon(List<Pokemon> pokemon){
        this.pokemon = pokemon;
    }
    public List<Pokemon> getPokemon(){
        return this.pokemon;
    }
}

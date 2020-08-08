package com.arnab.json.model;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon implements Serializable
{
	private static final long serialVersionUID = -5244099630683365385L;

	private int id;

    private String num;

    private String name;

    private String img;

    private List<String> type;

    private String height;

    private String weight;

    private String candy;

    private int candy_count;

    private String egg;

    private double spawn_chance;

    private int avg_spawns;

    private String spawn_time;

    private List<Double> multipliers;

    private List<String> weaknesses;

    @JsonProperty("next_evolution")
    private List<Next_evolution> next_evolution;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setNum(String num){
        this.num = num;
    }
    public String getNum(){
        return this.num;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setImg(String img){
        this.img = img;
    }
    public String getImg(){
        return this.img;
    }
    public void setType(List<String> type){
        this.type = type;
    }
    public List<String> getType(){
        return this.type;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public String getHeight(){
        return this.height;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight;
    }
    public void setCandy(String candy){
        this.candy = candy;
    }
    public String getCandy(){
        return this.candy;
    }
    public void setCandy_count(int candy_count){
        this.candy_count = candy_count;
    }
    public int getCandy_count(){
        return this.candy_count;
    }
    public void setEgg(String egg){
        this.egg = egg;
    }
    public String getEgg(){
        return this.egg;
    }
    public void setSpawn_chance(double spawn_chance){
        this.spawn_chance = spawn_chance;
    }
    public double getSpawn_chance(){
        return this.spawn_chance;
    }
    public void setAvg_spawns(int avg_spawns){
        this.avg_spawns = avg_spawns;
    }
    public int getAvg_spawns(){
        return this.avg_spawns;
    }
    public void setSpawn_time(String spawn_time){
        this.spawn_time = spawn_time;
    }
    public String getSpawn_time(){
        return this.spawn_time;
    }
    public void setMultipliers(List<Double> multipliers){
        this.multipliers = multipliers;
    }
    public List<Double> getMultipliers(){
        return this.multipliers;
    }
    public void setWeaknesses(List<String> weaknesses){
        this.weaknesses = weaknesses;
    }
    public List<String> getWeaknesses(){
        return this.weaknesses;
    }
    public void setNext_evolution(List<Next_evolution> next_evolution){
        this.next_evolution = next_evolution;
    }
    public List<Next_evolution> getNext_evolution(){
        return this.next_evolution;
    }
}
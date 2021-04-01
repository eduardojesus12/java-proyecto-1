/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebatecnicajava.projecto1;

import java.util.Date;

/**
 *
 * @author carloseduardojesusleon
 */
public class Carro extends Propietario {
    private String modelo;
    private String color;
    private int anio;
    private String marca;
    private String chasis;
    private int velocidad_max;
    private int velocidad_act;
    private int num_puertas;
    private boolean quemacocos;
    private int num_marcha;
    private boolean automatico;
    private float volumen_combustible;

    public Carro(String nombre, String cpf, String rg, String colonia, String ciudad, String estado, int cp) {
        super(nombre, cpf, rg, colonia, ciudad, estado, cp);
    }
 

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public int getVelocidad_act() {
        return velocidad_act;
    }

    public void setVelocidad_act(int velocidad_act) {
        this.velocidad_act = velocidad_act;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public boolean isQuemacocos() {
        return quemacocos;
    }

    public void setQuemacocos(boolean quemacocos) {
        this.quemacocos = quemacocos;
    }

    public int getNum_marcha() {
        return num_marcha;
    }

    public void setNum_marcha(int num_marcha) {
        this.num_marcha = num_marcha;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public float getVolumen_combustible() {
        return volumen_combustible;
    }

    public void setVolumen_combustible(float volumen_combustible) {
        this.volumen_combustible = volumen_combustible;
    }


    public void acelerar() {
        this.velocidad_act = this.velocidad_act + 1;
    }
    
    public void frenar() {
        this.velocidad_act = 0;
    }
    
    public void aumentarMarcha () {
        this.num_marcha = this.num_marcha + 1;
    }
    
    public void reducirMarcha () {
        this.num_marcha = this.num_marcha - 1;
    }
  
}

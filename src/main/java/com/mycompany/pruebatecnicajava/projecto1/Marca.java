/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebatecnicajava.projecto1;

/**
 *
 * @author carloseduardojesusleon
 */
public class Marca {
    private String nombre;
    private int num_modelo;
    private int lanzamiento;
    private String codigo_identificador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_modelo() {
        return num_modelo;
    }

    public void setNum_modelo(int num_modelo) {
        this.num_modelo = num_modelo;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getCodigo_identificador() {
        return codigo_identificador;
    }

    public void setCodigo_identificador(String codigo_identificador) {
        this.codigo_identificador = codigo_identificador;
    }
    
    
}

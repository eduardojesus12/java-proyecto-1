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
public class Propietario extends Direccion {
    private String nombre;
    private String cpf;
    private String rg;
    private  Date fecha_nacimiento;
    private String complemento;

    public Propietario(String nombre, String cpf, String rg, String colonia, String ciudad, String estado, int cp) {
        super(colonia, ciudad, estado, cp);
        this.nombre = nombre;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
  
}

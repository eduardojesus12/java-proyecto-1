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
public class PruebaClases {
     public static void main(String[] args) {
     
        
        Carro carro = new Carro("Carlos", "120ASA234", "ASHSTW6", "Centro", "Villahermosa", "Tabasco", 86000);
        carro.setModelo("D20");
        carro.setColor("Rojo");
        carro.setAnio(2018);
        carro.setMarca("BAIC");
        carro.setChasis("Chasis A");
        carro.setVelocidad_max(200);
        carro.setVelocidad_act(80);
        carro.setNum_puertas(4);
        carro.setQuemacocos(true);
        carro.setNum_marcha(5);
        carro.setAutomatico(false);
        carro.setVolumen_combustible(15);
        
        System.out.println("Nombre del propietario: " + carro.getNombre());
        System.out.println("CPF: " + carro.getCpf());
        System.out.println("RG: " + carro.getRg());
        System.out.println("Colonia: " + carro.getColonia());
        System.out.println("Ciudad: " + carro.getCiudad());
        System.out.println("Estado: " + carro.getEstado());
        System.out.println("Código postal: " + carro.getCp());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Color: " + carro.getColor());
        System.out.println("Año: " + carro.getAnio());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Chasis: " + carro.getChasis());
        System.out.println("Velocidad máxima: " + carro.getVelocidad_max());
        System.out.println("Velocidad actual: " + carro.getVelocidad_act());
        System.out.println("No. de puertas: " + carro.getNum_puertas());
        System.out.println("¿Tiene quemacocos?: " + carro.isQuemacocos());
        System.out.println("No. de marcha: " + carro.getNum_marcha());
        System.out.println("¿Es automático?: " + carro.isAutomatico());
        System.out.println("Volumen de combustible: " + carro.getVolumen_combustible() + " l");
         
        System.out.println("*****************************");
        
        Propietario propietario = new Propietario("Luis", "12045AHS4", "9234GATSSH", "Centro", "Guadalajara", "Jalisco", 73423);
        System.out.println("Nombre del propietario: " + propietario.getNombre());
        System.out.println("CPF: " + propietario.getCpf());
        System.out.println("RG: " + propietario.getRg());
        System.out.println("Colonia: " + propietario.getColonia());
        System.out.println("Ciudad: " + propietario.getCiudad());
        System.out.println("Estado: " + propietario.getEstado());
        System.out.println("Código postal: " + propietario.getCp());
        
        System.out.println("*****************************");
        
        Direccion direccion = new Direccion("Pradis", "Tuxtla Gutierrez", "Chiapas", 62346);
        System.out.println("Colonia: " + direccion.getColonia());
        System.out.println("Ciudad: " + direccion.getCiudad());
        System.out.println("Estado: " + direccion.getEstado());
        System.out.println("Código postal: " + direccion.getCp());
        
        System.out.println("*****************************");
        
        Marca marca = new Marca();
        marca.setNombre("Nissan");
        marca.setNum_modelo(73838);
        marca.setLanzamiento(2021);
        marca.setCodigo_identificador("12312A");
        System.out.println("Nombre: " + marca.getNombre());
        System.out.println("No. de modelo: " + marca.getNum_modelo());
        System.out.println("Lanzamiento: " + marca.getLanzamiento());
        System.out.println("Código identificador: " + marca.getCodigo_identificador());
        
        
        
        
        
        
        
        
    }
}

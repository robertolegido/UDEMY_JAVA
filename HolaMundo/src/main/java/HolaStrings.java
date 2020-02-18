/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author robertolegidosilva
 */
// las CLASES siempre empiezan en MayúsculaYCamelCase 
public class HolaStrings {
    public static void main(String args[]){
        // Las variable siempre en minúsculaYCamelCase
        // Primer ejemplo con tipo String 
        String saludito = "Hola holita con string";
        // Salida por pantalla
        System.out.println(saludito);
        // definicion de un tipo de variable con el tipo reservador var
        var nombre = "variable";
        // Unico operador sobrecargado
        System.out.println(saludito + "" + nombre);
        // primitivos enteros
        var i = 4;
        var j = 2; 
        // Operaciones 
        System.out.println(saludito + i +j);
        // Operaciones con orden 
        System.out.println(i + j + saludito); // suma y concatena
        System.out.println(saludito + i + j); // convierte a string
    }
    
}

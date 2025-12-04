package com.mycompany.ejercicio3_test;

public class GestorDescuentos {
    
 
    public int calculaDescuento(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }
        
        if (cliente.getAntiguedad() > 5) {
            return 10; // 10% de descuento
        } else {
            return 0;  // Sin descuento
        }
    }
}

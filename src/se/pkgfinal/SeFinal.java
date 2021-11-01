/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.pkgfinal;

import model.Persona;
import model.Viaje;

/**
 *
 * @author MtsSk
 */
public class SeFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona pruebaPlazasP = Persona.builder()
                .edad("> 36")
                .grupo("Gays")
                .visitaPrevia("No")
                .build();
        
        Viaje pruebasPlazasV = Viaje.builder()
                .presupuesto("< 500")
                .plan("Visitar")
                .estacion("invierno")
                .build();
        
        motor.MotorController.getInstance().ejecutar(pruebaPlazasP, pruebasPlazasV);
        
        Persona pruebaSkyP = Persona.builder()
                .edad("> 36")
                .grupo("Gays")
                .visitaPrevia("Si")
                .build();
        
        Viaje pruebasSkyV = Viaje.builder()
                .presupuesto("> 1000")
                .plan("Diversion")
                .estacion("Invierno")
                .build();
        
        motor.MotorController.getInstance().ejecutar(pruebaSkyP, pruebasSkyV);
        
        Persona pruebaBodegaP = Persona.builder()
                .edad("> 36")
                .grupo("Pareja")
                .visitaPrevia("Si")
                .build();
        
        Viaje pruebasBodegaV = Viaje.builder()
                .presupuesto("> 1000")
                .plan("Diversion")
                .estacion("Invierno")
                .build();
        
        motor.MotorController.getInstance().ejecutar(pruebaBodegaP, pruebasBodegaV);
        
    }
    
}

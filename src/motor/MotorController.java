/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

import java.util.logging.Level;
import java.util.logging.Logger;
import jess.JessException;
import jess.Rete;
import model.Persona;
import model.Viaje;

/**
 *
 * @author MtsSk
 */
public class MotorController {
    
    Rete motor;

    private static MotorController instance;
    
    private MotorController() {
        try {
            motor = new Rete();
            motor.reset();
            motor.batch("facts.clp");
        } catch (JessException ex) {
            System.out.print(ex.toString());
        }
    }
    
    public static MotorController getInstance() {
        if (instance == null) {
           instance = new MotorController(); 
        }
        return instance;
    }
    
    public void ejecutar(Persona p, Viaje v){
        try {
            motor.add(p);
            motor.add(v);
            motor.run();
        } catch (JessException ex) {
            System.out.print(ex.toString());
        }
    }
    
}

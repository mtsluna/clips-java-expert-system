/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

import java.io.PrintWriter;
import java.io.StringWriter;
import jess.JessException;
import jess.Rete;
import jess.Value;
import jess.awt.TextAreaWriter;
import jess.swing.JTextAreaWriter;
import model.Persona;
import model.Viaje;
import se.pkgfinal.Interface;

/**
 *
 * @author MtsSk
 */
public class MotorController {
    
    public Rete rete;
    
    public MotorController() {
        try {
            rete = new Rete();
            rete.reset();
            rete.batch("facts.clp");
        } catch (JessException ex) {
            System.out.print(ex.toString());
        }
    }
    
    public String ejecutar(Persona p, Viaje v){
        try {
            rete.add(p);
            rete.add(v);
            StringWriter stringWriter = new StringWriter();
            rete.addOutputRouter("t", stringWriter);
            rete.run();
            return stringWriter.toString().trim();
        } catch (JessException ex) {
            System.out.print(ex.toString());
            return "";
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Eli
 */
public class LoginContext {

    private ILoginStrategy strategy;

    public void setStrategy(ILoginStrategy strategy) {

        this.strategy = strategy;

    }
    
    public void login(){
        
        System.out.println("Hora de Ingreso: " + LocalTime.now());
        System.out.println("Fecha de Ingreso: " + LocalDate.now());
        this.strategy.login();
        
    }

}

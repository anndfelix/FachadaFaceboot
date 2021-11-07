/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Eli
 */
public class SesionFaceboot implements ILoginStrategy {

    @Override
    public void login() {
         JOptionPane.showMessageDialog(null," Login desde Faceboot. ");
    }

}

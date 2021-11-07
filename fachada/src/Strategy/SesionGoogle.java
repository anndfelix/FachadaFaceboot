/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Eli
 */
public class SesionGoogle implements ILoginStrategy {

    @Override
    public void login() {
        JOptionPane.showMessageDialog(null," Login desde Google. ");
    }

}

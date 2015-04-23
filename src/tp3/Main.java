/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import javax.swing.*;

/**
 *
 * @author david
 */
public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Livres");
        frame.setContentPane(new Login().panel);
        frame.setVisible(true);
        frame.setSize(500, 400);
        
    }
    
}

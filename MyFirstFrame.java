/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class MyFirstFrame extends JFrame{
    
   public MyFirstFrame(){
    setTitle("Crazy Shickpic");
       setSize(400,600);
       setLocationRelativeTo(null);
       setBackground(Color.yellow);
       setVisible(true);
       setResizable(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }


}
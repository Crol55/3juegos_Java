package mis3juegos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class DamasEspanolas extends JFrame implements ActionListener{

    public JButton boton[][] = new JButton[8][8];
    public static Vector verificador = new Vector(5, 5);
    String sapbe;
     ImageIcon negrita = new ImageIcon("C:\\Users\\carlos\\Documents\\NetBeansProjects\\Mis3Juegos\\src\\mis3juegos\\negra.png");
        ImageIcon blanquita = new ImageIcon("C:\\Users\\carlos\\Documents\\NetBeansProjects\\Mis3Juegos\\src\\mis3juegos\\blancaa.png");
  // public class button extends JButton{

   //}
    public DamasEspanolas() {
        super("Damas espanolas");
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenido = getContentPane();
        GridLayout grid = new GridLayout(8, 8);
        contenido.setLayout(grid);
       
        for (int filas = 0; filas < 8; filas++) { //agregamos los botones al tablero
            for (int columnas = 0; columnas < 8; columnas++) {
                boton[filas][columnas] = new JButton();

                if (filas % 2 != 0) {
                    if (columnas % 2 != 0) {//pintamos tablero
                        boton[filas][columnas].setBackground(Color.WHITE);

                    } else {
                        boton[filas][columnas].setBackground(Color.LIGHT_GRAY);

                    }
                } else if (filas % 2 == 0) {
                    if (columnas % 2 == 0) {
                        boton[filas][columnas].setBackground(Color.WHITE);

                    } else {
                        boton[filas][columnas].setBackground(Color.LIGHT_GRAY);
                      //  boton[filas][columnas].setIcon(blanquita);

                    }

                }
              
                contenido.add(boton[filas][columnas]);

            }
        }//cierra ciclo de llenado de tablero
        ///Action listener para vigilar los botones
        for (int filas = 0; filas < 8; filas++) {
            for (int columna = 0; columna < 8; columna++) {
                
                 for (int col = 0; col < 8; col++) {
                        if(filas%2==0){
                            if(col%2!=0){
                          boton[filas][col].addActionListener(this);
                            
                            }
                        } else{
                        if(filas%2!=0){
                          if(col%2==0){
                          boton[filas][col].addActionListener(this);
                             }  
                      }
                        }////
                    }
            }
        }
        
        
        ///////////////////termina action listener
 ////pintado de tablero con sus respectivas 
  for (int fila = 0; fila <= 2; fila++) {//creacion de las fichas blancas
                    for (int col = 0; col < 8; col++) {
                        if(fila%2==0){
                            if(col%2!=0){
                          boton[fila][col].setIcon(blanquita);
                            
                            }
                        } else{
                        if(fila%2!=0){
                          if(col%2==0){
                          boton[fila][col].setIcon(blanquita);
                             }  
                      }
                        }////
                    }
                }// CIERRE FICHAS BLANCAS
  
  ////////CREACION DE LAS FICHAS NEGRAS
  for (int fila = 5; fila <= 7; fila++) {//creacion de las fichas blancas
                    for (int col = 0; col < 8; col++) {
                        if(fila%2==0){
                            if(col%2!=0){
                          boton[fila][col].setIcon(negrita);
                         // boton[fila][col].setText("1");
                            }
                        } else{
                        if(fila%2!=0){
                          if(col%2==0){
                          boton[fila][col].setIcon(negrita);
                         //  boton[fila][col].setText("1");
                             }  
                      }
                        }
                    }
                }//CIERRE FICHAS NEGRAS
  
  
  
  
    }
    @Override
     public void actionPerformed(ActionEvent eve) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                 if(eve.getSource()==boton[i][j]){
           
             if(boton[i][j].getIcon()!=null){
                   verificador.addElement(boton[i][j].getIcon());
                 //  verificador.addElement( boton[i][j].getText());
                    boton[i][j].setIcon(null);
                      JOptionPane.showMessageDialog(null, "texto almacenado en verificador:  "+verificador.elementAt(0));
                  break;
                 
            } 
                 } 
        
            
            
            
            } }//cierra ciclo de accion
         
         
         
         
     }

    public static void main(String[] args) {
        DamasEspanolas d = new DamasEspanolas();
        d.setVisible(true);

    }

}

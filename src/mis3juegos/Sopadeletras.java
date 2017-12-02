package mis3juegos;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Sopadeletras extends JFrame implements ActionListener {

    public JPanel panelcentral;// panel donde se colocaran los 64 botones
    public JPanel panelsuperior;// panel donde se colocara el puntaje y las frases restantes a encontrar
    public JPanel panelderecho;// panel donde se almacenaran las frases que se supone encontrar
    public JLabel puntaje;
    JTextField frases;// botones que pondre en el principio
    public JButton uno;
    JButton dos;
    JButton dd;
    JButton os;
    JButton s;
    JButton d;
    public JLabel palabra;
    JLabel palabra1;
    JLabel palabra2;
    JLabel palabra3;
    JLabel palabra4;
    JLabel palabra5;
    JLabel palabra6;
    JLabel palabra7;
    public JLabel palabra8;
    JLabel palabra9;
    JLabel palabra10;
    JLabel palabra11;// botones que se colocaran al lado derecho de la pantalla principal de SL
    JLabel palabra12;
    JLabel palabra13;
    JLabel palabra14;
    JLabel palabra15;
    JLabel palabra16;
    JLabel palabra17;
    JLabel palabra18;
    JLabel palabra19;
    JLabel palabra20;
    JLabel palabra21;
    JLabel palabra22;
    JLabel palabra23;
    JLabel palabra24;
    JLabel palabra25;
    public JLabel sapbe;

    public String frase = "P,E,Z,G,U,T,Z,X,W,W,V,Q,R,N,P,C,H,K,F,U,M,Z,U,A,R,S,R,Q,Q,Y,E,S,R,A,D,I,O,X,R,A,B,Z,F,Z,Q,J,T,Q,R,B,R,M,M,B,A,F,L,L,A,V,E,S,F,R";
    public String frase2 = "C,Z,B,U,S,C,A,R,O,M,W,L,X,H,H,G,R,Z,F,I,J,W,Z,R,R,G,O,L,P,E,M,I,E,Z,I,L,J,F,X,T,R,X,M,M,F,W,Z,A,W,S,A,L,T,A,R,R,M,Z,W,X,H,H,M,Z";
    public String frase3 = "I,T,E,R,A,R,F,M,H,G,G,H,V,H,J,E,T,V,W,X,Y,V,G,T,E,B,O,R,R,A,R,O,C,W,Z,H,Y,N,F,D,L,N,U,Q,N,Z,U,O,A,V,F,V,V,W,N,H,S,F,C,L,I,C,K,X";
    public String frase4 = "T,Y,B,Y,W,V,S,Z,I,R,E,L,O,J,E,R,E,Q,V,K,B,K,G,Q,M,W,L,H,W,R,U,K,P,R,L,O,H,V,N,Y,O,V,Y,R,B,H,D,Q,B,Z,W,A,Q,L,O,R,F,E,C,H,A,B,S,Z";
    public String frase5 = "B,Y,T,E,S,H,Q,C,F,F,Z,W,K,Y,F,M,P,U,E,R,T,O,S,O,C,H,W,C,F,K,Y,U,Q,F,B,I,T,S,D,S,H,Y,D,Q,F,W,F,E,U,S,B,D,Y,C,H,Q,Y,Z,Q,K,D,C,H,Z";
    public static Vector separador = new Vector(65, 5);
    public static Vector almacen = new Vector(70, 5);
    public JButton botones[] = new JButton[64];
    public String h;
    String cadena[];
    String cadena1[];
    String cadena2[];
    String cadena3[];
    String cadena4[];
    public String cadena5[];
    String cadena6[];
    String cadena7[];
    String cadena8[];
    String cadena9[];
    public int contador, resultadofinal, palabrasrestantes, x, y, z, w, xx;
    public String total;

    private String palabrita = "";
    public Random aleatorio = new Random();

    //////////////////////constructor///////////////////////
    public Sopadeletras() {

        super("Sopa de Letras");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = getContentPane();
        int num = aleatorio.nextInt(5);

        // creacion del panel inicial
        panelsuperior = new JPanel();
        panelsuperior.setLayout(new FlowLayout());
        puntaje = new JLabel("Frases Restantes    ");
        frases = new JTextField(15);
        panelsuperior.add(puntaje);
        panelsuperior.add(frases);
        contenedor.add(panelsuperior, BorderLayout.NORTH);

        ////// creacion del panel Derecho////////////////////////////////////
        panelderecho = new JPanel();
        GridLayout l = new GridLayout(11, 1);
        //l.setHgap(10); l.setVgap(5);
        panelderecho.setLayout(l);
        palabra = new JLabel("Frases a Encontrar");
        panelderecho.add(palabra);

        panelcentral = new JPanel();//Panel donde se colocaran los botones con las frases a seleccionar
        //JOptionPane.showMessageDialog(null, "el numero aleatorio fue:  "+num);
        palabra1 = new JLabel("     pez");
        palabra2 = new JLabel("     casa");
        palabra3 = new JLabel("     radio");
        palabra4 = new JLabel("     puerta");
        palabra5 = new JLabel("     llaves");
        palabra6 = new JLabel("     correr");
        palabra7 = new JLabel("     saltar");
        palabra8 = new JLabel("     buscar");
        palabra9 = new JLabel("     gritar");
        palabra10 = new JLabel("     golpe");
        palabra11 = new JLabel("     click");
        palabra12 = new JLabel("     teclas");
        palabra13 = new JLabel("     borrar");
        palabra14 = new JLabel("     iterar");
        palabra15 = new JLabel("     metodo");
        palabra16 = new JLabel("     reloj");
        palabra17 = new JLabel("     fecha");
        palabra18 = new JLabel("     hora");
        palabra19 = new JLabel("     tiempo");
        palabra20 = new JLabel("     segundos");
        palabra21 = new JLabel("     bits");
        palabra22 = new JLabel("     Bytes");
        palabra23 = new JLabel("     puertos");
        palabra24 = new JLabel("     usb");
        palabra25 = new JLabel("     mouse");
        contenedor.add(panelderecho, BorderLayout.EAST);
        //num=4;
        switch (num) {
            case 0: {// dependiendo el numero random            
                panelderecho.add(palabra1);
                panelderecho.add(palabra2);
                panelderecho.add(palabra3);
                panelderecho.add(palabra4);
                panelderecho.add(palabra5);

                cadena = frase.split(",");// de la cadena frase se descompone para poder tener cada letra en la posicion cadena[i]

                for (int i = 0; i < cadena.length; i++) {
                    separador.addElement(cadena[i]);// cada elemento en cadena es almacenado por nuestra libreria Vector para recibirlos en orden

                }
            }
            break;
            case 1: {
                panelderecho.add(palabra6);
                panelderecho.add(palabra7);
                panelderecho.add(palabra8);
                panelderecho.add(palabra9);
                panelderecho.add(palabra10);
                contenedor.add(panelderecho, BorderLayout.EAST);
                cadena = frase2.split(",");

                for (int i = 0; i < cadena.length; i++) {
                    separador.addElement(cadena[i]);

                }

            }
            break;

            case 2: {
                cadena = frase3.split(",");

                panelderecho.add(palabra11);
                panelderecho.add(palabra12);
                panelderecho.add(palabra13);
                panelderecho.add(palabra14);
                panelderecho.add(palabra15);
                for (int i = 0; i < cadena.length; i++) {
                    separador.addElement(cadena[i]);

                }

            }
            break;
            case 3: {
                cadena = frase4.split(",");

                panelderecho.add(palabra16);
                panelderecho.add(palabra17);
                panelderecho.add(palabra18);
                panelderecho.add(palabra19);
                panelderecho.add(palabra20);

                for (int i = 0; i < cadena.length; i++) {
                    separador.addElement(cadena[i]);

                }

            }
            break;
            case 4: {
                cadena = frase5.split(",");

                panelderecho.add(palabra21);
                panelderecho.add(palabra22);
                panelderecho.add(palabra23);
                panelderecho.add(palabra24);
                panelderecho.add(palabra25);

                for (int i = 0; i < cadena.length; i++) {
                    separador.addElement(cadena[i]);

                }

            }
            break;

        }

        GridLayout gl = new GridLayout(8, 8);// crea el tablero de 8*8
        gl.setHgap(5);
        gl.setVgap(5);
        panelcentral.setLayout(gl);
        for (int j = 0; j < 64; j++) {
            botones[j] = new JButton((String) separador.elementAt(j));//ciclo para llenar los botones con sus respectivos caracteres
            botones[j].addActionListener(this);// a cada boton almacenado en su array se le agrega un vigilante tipo action listener
        }
        for (int i = 0; i < 64; i++) {

            panelcentral.add(botones[i]);//agregue los botones al panel
        }
        contenedor.add(panelcentral, BorderLayout.CENTER);

    }// cierra el costrucctor de la sopa de letras

    @Override

    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 64; i++) {

            if (e.getSource() == botones[i]) {//condicionamos todos los botones que al ser clickeados ejecuten todos la misma accion
                //JOptionPane.showMessageDialog(null, "letra registrada");  
                h = botones[i].getText();
                palabrita = palabrita + h;
                almacen.addElement(h);
 //////////comprobante si las frases van correctamente alineadas       
                // JOptionPane.showMessageDialog(null, "son iguales:  "+cadena[j]+"almacen  "+almacen.elementAt(contador));

                //JOptionPane.showMessageDialog(null, "palabrita almaceno   :  "+palabrita);
                switch (palabrita) {

                    case "PEZ": {
                        //   JOptionPane.showMessageDialog(null, "La logitud final fue de 3:  ");
                        x = 0;

                        for (int j = 0; j < 3; j++) {
                            botones[j].setBackground(Color.yellow);
                            botones[j].setEnabled(false);
                        }

                        palabrita = "";
                        almacen.removeAllElements();
                        x = 1;
                    }
                    break;
                    case "CASA": {
                        y = 0;
                        for (int j = 15; j <= 39; j += 8) {
                            botones[j].setBackground(Color.BLUE);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        y = 1;
                    }
                    break;

                    case "RADIO": {
                        z = 0;
                        for (int j = 32; j <= 36; j++) {
                            botones[j].setBackground(Color.white);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        z = 1;
                    }
                    break;

                    case "PUERTA": {
                        w = 0;
                        for (int j = 14; j <= 54; j += 8) {
                            botones[j].setBackground(Color.green);
                            botones[j].setEnabled(false);

                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        w = 1;
                    }
                    break;
                    case "LLAVES": {
                        xx = 0;
                        for (int j = 56; j <= 61; j++) {
                            botones[j].setBackground(Color.CYAN);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        xx = 1;
                    }
                    break;
                    ////////// SEGUNDO TABLERO//////       
                    case "CORRER": {
                        x = 0;
                        for (int j = 0; j <= 40; j += 8) {
                            botones[j].setBackground(Color.orange);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        x = 1;
                    }
                    break;
                    case "SALTAR":
                        y = 0;
                         {
                            for (int j = 49; j <= 54; j++) {
                                botones[j].setBackground(Color.GRAY);
                                botones[j].setEnabled(false);
                            }
                            palabrita = "";
                            almacen.removeAllElements();
                            y = 1;
                        }
                        break;

                    case "BUSCAR": {
                        z = 0;
                        for (int j = 2; j <= 7; j++) {
                            botones[j].setBackground(Color.WHITE);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        z = 1;
                    }
                    break;
                    case "GRITAR": {
                        w = 0;
                        for (int j = 15; j <= 55; j += 8) {
                            botones[j].setBackground(Color.yellow);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        w = 1;
                    }
                    break;

                    case "GOLPE": {
                        xx = 0;
                        for (int j = 25; j <= 29; j++) {
                            botones[j].setBackground(Color.RED);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        xx = 1;
                    }
                    break;

                    ///////////3ER TABLERO//////////
                    case "ITERAR": {
                        x = 0;

                        for (int j = 0; j <= 5; j++) {
                            botones[j].setBackground(Color.orange);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        x = 1;
                    }
                    break;

                    case "BORRAR": {
                        y = 0;
                        for (int j = 25; j <= 30; j++) {
                            botones[j].setBackground(Color.CYAN);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        y = 1;
                    }
                    break;
                    case "CLICK": {
                        z = 0;
                        for (int j = 58; j <= 62; j++) {
                            botones[j].setBackground(Color.MAGENTA);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        z = 1;
                    }
                    break;

                    case "METODO": {
                        w = 0;
                        for (int j = 7; j <= 49; j += 8) {
                            botones[j].setBackground(Color.yellow);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        w = 1;
                    }
                    break;
                    case "TECLAS": {
                        xx = 0;
                        for (int j = 16; j <= 62; j += 8) {
                            botones[j].setBackground(Color.WHITE);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        xx = 1;
                    }
                    break;
                    ////////////4TO TABLERO//////////////////////////
                    case "RELOJ": {
                        x = 0;
                        for (int j = 9; j <= 13; j++) {
                            botones[j].setBackground(Color.GREEN);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        x = 1;
                    }
                    break;

                    case "FECHA": {
                        y = 0;
                        for (int j = 56; j < 61; j++) {
                            botones[j].setBackground(Color.CYAN);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        y = 1;
                    }
                    break;
                    case "HORA": {
                        z = 0;
                        for (int j = 27; j <= 56; j += 8) {
                            botones[j].setBackground(Color.RED);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        z = 1;
                    }
                    break;

                    case "SEGUNDOS": {
                        w = 0;
                        for (int j = 6; j <= 62; j += 8) {
                            botones[j].setBackground(Color.WHITE);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        w = 1;

                    }
                    break;
                    case "TIEMPO": {
                        xx = 0;
                        for (int j = 0; j <= 40; j += 8) {
                            botones[j].setBackground(Color.yellow);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        xx = 1;
                    }
                    break;

                    ////////5TO TABLERO/////////////////////
                    case "BYTES": {
                        x = 0;
                        for (int j = 0; j < 5; j++) {
                            botones[j].setBackground(Color.GREEN);
                            botones[j].setEnabled(false);
                        }

                        palabrita = "";
                        almacen.removeAllElements();
                        x = 1;
                    }
                    break;

                    case "BITS": {
                        y = 0;
                        for (int j = 34; j < 38; j++) {
                            botones[j].setBackground(Color.CYAN);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        y = 1;

                    }
                    break;
                    case "PUERTOS": {
                        z = 0;
                        for (int j = 16; j <= 22; j++) {
                            botones[j].setBackground(Color.RED);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        z = 1;
                    }
                    break;

                    case "USB": {
                        w = 0;
                        for (int j = 48; j <= 50; j++) {
                            botones[j].setBackground(Color.orange);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        w = 1;

                    }
                    break;
                    case "MOUSE": {
                        xx = 0;
                        for (int j = 15; j <= 50; j += 8) {
                            botones[j].setBackground(Color.yellow);
                            botones[j].setEnabled(false);
                        }
                        palabrita = "";
                        almacen.removeAllElements();
                        xx = 1;
                    }
                    break;

                }//cierrra switch
                resultadofinal = x + y + z + w + xx;
                palabrasrestantes = 5 - x - y - z - w - xx;
                total = Integer.toString(palabrasrestantes);
                frases.setText(total);

                if (resultadofinal == 5) {
                    JOptionPane.showMessageDialog(null, "FELICITACIONES USTED HA COMPLETADO LA SOPA DE LETRAS");
                }

            }
        }

    }// cerrar action performed

    public static void main(String[] args) {
        Sopadeletras r = new Sopadeletras();
        r.setVisible(true);

    }

}

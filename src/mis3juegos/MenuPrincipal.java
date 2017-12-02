
package mis3juegos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.jvnet.substance.SubstanceLookAndFeel;


public class MenuPrincipal extends JFrame implements ActionListener{
    private JMenuBar Menu;
    public JMenu opcion1,opcion2;
    public JMenuItem DE,PP,sopa,opcion5,manual,acerca,sal;
    public MenuPrincipal(){
   super("ETOYS,Mis 3 Juegos Menu Principal ");
   
   setSize(400,400);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Menu = new JMenuBar();
   setLayout(null);
   //Menu= new JMenuBar();// principal
   setJMenuBar(Menu);
  
   
   opcion1= new JMenu("Juego");
   Menu.add(opcion1);
      DE= new JMenuItem("Damas Espanolas");// agregamos opcion2 dentro de opcion1 y asi es con todas
      opcion1.add(DE);
      DE.addActionListener(this);// Action listener vigila si se recibe alguna respuesta de Damas espanolas
      PP= new JMenuItem("PipePlayer");
      opcion1.add(PP);
      PP.addActionListener(this);
      sopa= new JMenuItem("Sopa de Letras");
      opcion1.add(sopa);
      sopa.addActionListener(this);
      sal= new JMenuItem("Salir");
      opcion1.add(sal);
      sal.addActionListener(this);
   opcion2= new JMenu("Ayuda");
   Menu.add(opcion2);
   manual= new JMenuItem("Manual de usuario");
   opcion2.add(manual);
   acerca= new JMenuItem("Acerca de");
   opcion2.add(acerca);
    
    }
    public void actionPerformed(ActionEvent e){
    Container f=this.getContentPane();
        if (e.getSource()==DE) {
         DamasEspanolas damas= new DamasEspanolas();
         damas.setVisible(true);
        } else if(e.getSource()==sal){
          System.exit(0);
        
        } else if(e.getSource()==sopa){
         SubstanceLookAndFeel.setSkin("false");
      SubstanceLookAndFeel.getCurrentDecorationPainter();
         Sopadeletras sopita= new Sopadeletras();
         sopita.setVisible(true);
       
        }
 
    
    }
    
    
}
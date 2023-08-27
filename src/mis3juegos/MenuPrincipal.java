
package mis3juegos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.jvnet.substance.SubstanceLookAndFeel;


public class MenuPrincipal extends JFrame implements ActionListener{

    private JMenuBar Menu;
    public JMenu tabJuegos,tabAyuda;
    public JMenuItem itemDE, itemPipePlayer, itemSopa, opcion5, itemManual, itemAbout, itemExit;
    
    public MenuPrincipal(){

      super("ETOYS,Mis 3 Juegos Menu Principal ");
   
      setSize(400,400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Menu = new JMenuBar();
      setLayout(null);
      setJMenuBar(Menu);
      
      this.populateJMenuBar(Menu);
    
    }


    private void populateJMenuBar(JMenuBar mainMenu){
      
      tabJuegos= new JMenu("Juego");
      
      itemDE= new JMenuItem("Damas Espanolas");// agregamos opcion2 dentro de opcion1 y asi es con todas
      itemDE.addActionListener(this);
      tabJuegos.add(itemDE);
      
      itemPipePlayer= new JMenuItem("PipePlayer");
      itemPipePlayer.addActionListener(this);
      tabJuegos.add(itemPipePlayer);  

      itemSopa= new JMenuItem("Sopa de Letras");
      itemSopa.addActionListener(this);
      tabJuegos.add(itemSopa);
        
      itemExit= new JMenuItem("Salir");
      itemExit.addActionListener(this);
      tabJuegos.add(itemExit);
      
      tabAyuda= new JMenu("Ayuda");
      
      itemManual= new JMenuItem("Manual de usuario");
      tabAyuda.add(itemManual);

      itemAbout= new JMenuItem("Acerca de");
      tabAyuda.add(itemAbout);

      mainMenu.add(tabJuegos);
      mainMenu.add(tabAyuda);
          
    }

    public void actionPerformed(ActionEvent e){
      
      Container f=this.getContentPane();

      if (e.getSource() == itemDE) {

       DamasEspanolas damas = new DamasEspanolas();
       damas.setVisible(true);

      } else if(e.getSource() == itemExit){

        System.exit(0);
      
      } else if(e.getSource() == itemSopa){
        //SubstanceLookAndFeel.setSkin("false");
        //SubstanceLookAndFeel.getCurrentDecorationPainter();
        Sopadeletras sopita = new Sopadeletras();
        sopita.setVisible(true);
      }
 
    
    }
    
    
}
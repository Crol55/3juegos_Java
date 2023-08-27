
package mis3juegos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Registro extends JFrame implements ActionListener{
    public JLabel usuario;// Label con texto "Usuario"
    public JTextField usuario1; // Donde se recibe el texto
    public JLabel contrasena;// label 
    public JTextField contrasena1;// recibe el texto
    public JButton aceptar;
    
    
    public Registro(){

      super("Login De Usuario");
      setSize(500,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Container contenedor= getContentPane();
      GridBagLayout GB= new GridBagLayout();
      contenedor.setLayout(GB);

      GridBagConstraints atributos = new GridBagConstraints();
      
  
      atributos.gridx=0;// dependiendo en donde se quiere colocar en el eje x
      atributos.gridy=0;// eje y creando filas, y escogiendo la posion 1.
      atributos.gridwidth=1;
      atributos.gridheight=1;
      // atributos.weightx=1.0;// le ordenamos que ocupe toda su casilla en filas.
      atributos.anchor= GridBagConstraints.WEST;

      usuario= new JLabel("Ingreso de Usuario    ");
      contenedor.add(usuario,atributos);
      
       //////////////////////////////////// texto
      atributos.fill = GridBagConstraints.NONE;
      usuario1 = new JTextField(20);

      atributos.gridx=2;
      atributos.gridy=0;
      atributos.gridwidth=1;
      atributos.gridheight=1;
      atributos.anchor= GridBagConstraints.CENTER;
      atributos.fill=GridBagConstraints.HORIZONTAL;
      contenedor.add(usuario1,atributos);
 
 
      aceptar= new JButton("Aceptar");// boton aceptar
      atributos.gridx=2;
      atributos.gridy=2;
      atributos.gridwidth=1;
      atributos.gridheight=1;
      atributos.anchor=GridBagConstraints.EAST;// traslada el boton al este de su posicion
      aceptar.addActionListener(this);
      contenedor.add(aceptar,atributos);
    }
    
    public void actionPerformed(ActionEvent ev){// registra los eventos que se crearan al tocar el boton aceptar
      
      if(ev.getSource() == aceptar){
          if((usuario1.getText().isEmpty())){
             
           JOptionPane.showMessageDialog(null, "Ingrese denuevo su usuario esta Vacio");
          
          }else{

            JOptionPane.showMessageDialog(null, "Bienvenido "+usuario1.getText()+" usted ha ingresado exitosamente su nombre");
            MenuPrincipal mn= new MenuPrincipal();{// si el usuario ingresa su contrasena correctamente despliega la ventana de juegos
            mn.setVisible(true);
            
          } 
        }           
      }
    }
    
}

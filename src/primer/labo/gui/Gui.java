
package primer.labo.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Gui extends JFrame {
    private JTextField caja1,caja2;
    private JButton boton;

    public Gui() {
        super("Titulo");
        initialComponent();
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                caja2.setText(caja1.getText());
            }
        });
        
    }
    
    public void initialComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300,300);
        
        caja1= new JTextField();
        caja1.setBounds(10, 100, 150, 30);
        Container container= getContentPane();
        container.add(caja1);
          
        caja2= new JTextField();
        caja2.setBounds(10, 150, 150, 30);
        Container container2= getContentPane();
        container2.add(caja2);
        caja2.setEditable(false);
        
        boton= new JButton("|o|");
        boton.setBounds(180, 100, 80, 80);
        Container container3= getContentPane();
        container3.add(boton);
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
        
        
    }
            

}


package Control_BD;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JDCR03
 */
public class Limpiar {
    
    public void limpiar_texto(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            }
            else if(panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setText("");
            }
        }
    }
    
}

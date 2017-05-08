
package myframe;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PC
 */ 
public class KeyEventDemo extends Frame implements KeyListener {
 
   private TextField txtInput; 
   private TextArea taDisplay;
 
   public KeyEventDemo() {
      setLayout(new FlowLayout()); 
 
      add(new Label("Enter Text: "));
      txtInput = new TextField(10);
      add(txtInput);
      taDisplay = new TextArea(5, 40); 
      add(taDisplay);
 
      txtInput.addKeyListener(this);
 
      setTitle("KeyEvent Demo"); 
      setSize(400, 200);        
      setVisible(true);         
   }

   public static void main(String[] args) {
      new KeyEventDemo();  
   }
 

   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
 
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
}
    

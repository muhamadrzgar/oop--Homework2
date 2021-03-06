
package oophomework2;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


public class newframe extends Oophomework2 implements ActionListener{
    
     JFrame converterFrame;

  JPanel converterPanel;

  JTextField tempCelsius;

  JLabel celsiusLabel, fahrenheitLabel;

  JButton convertTemp;

 
  public newframe() {
    // Create the frame and container.
    converterFrame = new JFrame("Convert Celsius to Fahrenheit");
    converterPanel = new JPanel();
    converterPanel.setLayout(new GridLayout(2, 2));
      JFrame f1 = new JFrame("login");
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setVisible(true);
f1.setSize(400,400);
   
    addWidgets();

   
    converterFrame.getContentPane()
        .add(converterPanel, BorderLayout.CENTER);

   
    converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    converterFrame.pack();
    converterFrame.setVisible(true);
    
  }


  private void addWidgets() {

  
    tempCelsius = new JTextField(2);
    celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
    convertTemp = new JButton("Convert...");
    fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);

  
    convertTemp.addActionListener(this);

   
    converterPanel.add(tempCelsius);
    converterPanel.add(celsiusLabel);
    converterPanel.add(convertTemp);
    converterPanel.add(fahrenheitLabel);

    celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

  }

  
  public void actionPerformed(ActionEvent event) {
   
    int tempFahr = (int) ((Double.parseDouble(tempCelsius.getText())) * 1.8 + 32);
    fahrenheitLabel.setText(tempFahr + " Fahrenheit");
  }
}

//  public static void main(String[] args) {
//
//    try {
//      UIManager.setLookAndFeel(UIManager
//          .getCrossPlatformLookAndFeelClassName());
//    } catch (Exception e) {
//    }
//
//    newframe converter = new newframe();
//  }
//}

      
    
    
    


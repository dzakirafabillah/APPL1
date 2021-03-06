package CurrencyConverter;

// ******************************************************************
// RatePanel.java
// @author DZAKIRA
// Panel for a program that converts different currencies to
// U.S. Dollars
// ******************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class RatePanel extends JPanel{
    private double[] rate; // exchange rates
    private String[] currencyName;
    private JLabel result;
    private JComboBox choiceCurrencyName;
    private JTextField cost = new JTextField("1");
    // ------------------------------------------------------------
    // Sets up a panel to convert cost from one of 6 currencies
    // into U.S. Dollars. The panel contains a heading, a text
    // field for the cost of the item, a combo box for selecting
    // the currency, and a label to display the result.
    // ------------------------------------------------------------
    public RatePanel (){
        //panel
        this.setBackground(new Color(204,229,255));
        this.setLayout(new GridLayout(4,4,1,1));
        this.setBorder(new EmptyBorder(15, 15, 15, 15));
        
        //title
        JLabel title = new JLabel ("How much is that in dollars?");
        title.setAlignmentX (0);
        title.setFont (new Font ("Helvetica", Font.BOLD, 20));
        
        // Set up the arrays for the currency conversions
        currencyName = new String[] {"Select the currency..",
        "European Euro", "Canadian Dollar",
        "Japanese Yen", "Australian Dollar",
        "Indian Rupee", "Mexican Peso"};
        rate = new double [] {0.0, 1.2103, 0.7351,
        0.0091, 0.6969,
        0.0222, 0.0880};
        
        result = new JLabel (" ------------ ");
        
        //cost form 
        JLabel labelCost = new JLabel("Cost of an Item");
        cost.setPreferredSize(new Dimension(140,30));
        
        //currency
        JLabel labelCurrency = new JLabel("Currency Name");
        choiceCurrencyName = new JComboBox (currencyName);
        choiceCurrencyName.addActionListener(new ComboListener());
        
        add(title);
        add(result);
        add(labelCost);
        add(cost);
        add(labelCurrency, "SOUTH");
        add(choiceCurrencyName);
    }
    
    // ******************************************************
    // Represents an action listener for the combo box.
    // ******************************************************
    private class ComboListener implements ActionListener{
        // --------------------------------------------------
        // Determines which currency has been selected and
        // the value in that currency then computes and
        // displays the value in U.S. Dollars.
        // --------------------------------------------------
        public void actionPerformed (ActionEvent event){
            int index = choiceCurrencyName.getSelectedIndex();
            result.setText (cost.getText() +" " + currencyName[index] +
            " = " + (rate[index] * Integer.valueOf(cost.getText())) + " U.S. Dollars");
        }
    }
}

package Calculator_Big;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;

class BigBlobGUI extends JFrame {
    //... Constants
    private static final String INITIAL_VALUE = "1";
    
    //... Components
    private JTextField m_totalTf     = new JTextField(10);
    private JTextField m_userInputTf = new JTextField(10);
    private JButton    m_multiplyBtn = new JButton("Multiply");
    private JButton    m_clearBtn    = new JButton("Clear");
    
    private BigInteger m_total;  // The total current value state.
    
    /** Constructor */
    BigBlobGUI() {
        //... Initialize components and model
        m_total = new BigInteger(INITIAL_VALUE);
        m_totalTf.setText(INITIAL_VALUE);
        m_totalTf.setEditable(false);
        
        //... Layout the components.        
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);
        
        //... finalize layout
        this.setContentPane(content);
        this.pack();
        
        //... Listener to do multiplication
        m_multiplyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    m_total = m_total.multiply(new BigInteger(m_userInputTf.getText()));
                    m_totalTf.setText(m_total.toString());
                } catch (NumberFormatException nex) {
                    JOptionPane.showMessageDialog(BigBlobGUI.this, "Bad Number");
                }
            }
        });
        
        //... Listener to clear.
        m_clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m_total = new BigInteger(INITIAL_VALUE);
                m_totalTf.setText(INITIAL_VALUE);
            }
        });
    }
}
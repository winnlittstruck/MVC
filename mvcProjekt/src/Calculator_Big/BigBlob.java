package Calculator_Big;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;

public class BigBlob {
    public static void main(String[] args) {
        JFrame window = new BigBlobGUI();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Simple Calc");
        window.setVisible(true);
    }
}


package src;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiscreteCalculatorGUI extends JFrame implements ActionListener {

    private JPanel ContentPanel;
    private JPanel middlePane;
    private JPanel screenPane;
    private JPanel changePanel;
    private JPanel Hypergeometric;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox operationComboBox;
    private JButton computeButton;
    private JRadioButton rBA;
    private JRadioButton rBB;
    private JRadioButton rBC;
    private JRadioButton rBD;
    private JRadioButton rBE;
    private JRadioButton rBF;
    private JPanel innerMiddlePane;
    private JPanel Choices;
    private JButton clearButton;
    private JScrollPane scrollPane;
    private JPanel scrollPaneLayout;
    private JLabel operationLabel;
    private ButtonGroup radioButtonGroup;


    public DiscreteCalculatorGUI(){
        setTitle("Discrete Calculator");
        setSize(500, 920);
        setLocationRelativeTo(null);
        BackgroundPanel bg = new BackgroundPanel("assets/mainFrame.png");
        bg.add(ContentPanel);
        setContentPane(bg);



        // grouping radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(rBA);
        radioButtonGroup.add(rBB);
        radioButtonGroup.add(rBC);
        radioButtonGroup.add(rBD);
        radioButtonGroup.add(rBE);
        radioButtonGroup.add(rBF);


        // setting scrollpane transparent
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        setResizable(false);
        setVisible(true);

        operationComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleected = (String)operationComboBox.getSelectedItem();
                operationLabel.setText(seleected);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new DiscreteCalculatorGUI();
    }
}

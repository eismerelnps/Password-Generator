package GUI;

import Control.Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel mainPanel;
    private JButton generateButton;
    private JTextField lengthTextField;
    private JPanel setOptionsPanel;
    private JRadioButton capitalCharsRadioButton;
    private JButton setCharsButton;
    private JRadioButton minCharsRadioButton;
    private JRadioButton numbersCharsRadioButton;
    private JRadioButton specialCharsRadioButton;
    private JLabel passwordJLabel;
    private JTextArea passwordTextArea;
    private JButton copyButton;
    Generator generator = new Generator();

    public GUI() {
        setOptionsPanel.setVisible(false);
        capitalCharsRadioButton.setSelected(true);

        setCharsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lengthTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "Please set a length first ",
                            "",
                            2,
                            null);
                } else if(Integer.parseInt(lengthTextField.getText()) <= 4 || Integer.parseInt(lengthTextField.getText()) > 120) {
                    JOptionPane.showMessageDialog(null,
                            "For security set a length between 4 and 120 characters ",
                            "",
                            2,
                            null);
                } else if (!capitalCharsRadioButton.isSelected() && !minCharsRadioButton.isSelected() && !numbersCharsRadioButton.isSelected() && !specialCharsRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Set at least one of the requirements",
                            "",
                            2,
                            null);
                } else {
                    generator.setOptions(Integer.parseInt(lengthTextField.getText()), capitalCharsRadioButton.isSelected(), minCharsRadioButton.isSelected(), numbersCharsRadioButton.isSelected(), specialCharsRadioButton.isSelected());
                    passwordJLabel.setText(generator.generate(Integer.parseInt(lengthTextField.getText())));
                }
            }
        });
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOptionsPanel.setVisible(true);
                JOptionPane.showOptionDialog(null,
                        setOptionsPanel,
                        "",
                        JOptionPane.DEFAULT_OPTION,
                        -1,
                        null, new Object[]{},
                        null);

            }
        });

    }

    public void StartGUI() {
        JFrame window = new JFrame("PetShop");
        window.setContentPane(new GUI().mainPanel);
        window.pack();
        window.setBounds(300, 150, 1000, 515);
        window.setVisible(true);
        window.setMinimumSize(new Dimension(1106, 507));
        window.setBackground(Color.darkGray);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

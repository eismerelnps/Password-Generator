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
    private JButton button1;
    Generator generator = new Generator();

    public GUI() {
        setOptionsPanel.setVisible(false);

        setCharsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(lengthTextField.getText()) <= 4 || Integer.parseInt(lengthTextField.getText()) > 120) {
                    JOptionPane.showMessageDialog(null,
                            "For security set e length between 4 and 120 characters ",
                            "",
                            2,
                            null);
                }
                if (!capitalCharsRadioButton.isSelected() && !minCharsRadioButton.isSelected() && !numbersCharsRadioButton.isSelected() && !specialCharsRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Set at least one of the requirements",
                            "",
                            2,
                            null);
                } else {
                    generator.setOptions(Integer.parseInt(lengthTextField.getText()), capitalCharsRadioButton.isSelected(), minCharsRadioButton.isSelected(), numbersCharsRadioButton.isSelected(), specialCharsRadioButton.isSelected());
                    JOptionPane.showMessageDialog(null,
                            generator.generate(Integer.parseInt(lengthTextField.getText())),
                            "",
                            2,
                            null);
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

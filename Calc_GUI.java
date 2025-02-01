import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;

import static java.lang.Integer.parseInt;

public class Calc_GUI {
    private JPanel panel1;
    JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a6Button;
    private JButton a7Button1;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton cButton;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel calcPanel;
    private JButton decButton;
    private JButton expButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton cotButton;
    private JButton lnButton;
    private JButton logButton;
    private JButton openParenButton;
    private JButton negativeButton;
    private JButton closeParenButton;
    private JFrame guiFrame = new JFrame("Calculator");
    private JFrame errorFrame = new JFrame("ERROR");
    StringBuilder equation = new StringBuilder();
    ArrayList<String> eqList = new ArrayList<>();

    public Calc_GUI() {
        panel1 = new JPanel();
        Calc_Functions calc_Functions = new Calc_Functions();
        /*
        String[] opArray = new String[3];
        StringBuilder term1 = new StringBuilder();
        StringBuilder operator = new StringBuilder();
        StringBuilder term2 = new StringBuilder();
        char termFlag = 1;

         */


        buildGuiPanel();


        a1Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a7Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        cButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //equation.append(e.getActionCommand());
                //clear the screen
                textArea1.setText("");
                equation.setLength(0);
                eqList.clear();
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        button4.addActionListener(new ActionListener() {
            float finalVal = 0;

            public void actionPerformed(ActionEvent e) {
                if (equation.length() != textArea1.getText().length()) {
                    textArea1.setText("");
                    equation.setLength(0);
                    eqList.clear();
                    throwError();
                } else {
                    textArea1.append(e.getActionCommand());
                    eqList = parseString();
                }

                if (validateInput(eqList)) {
                    finalVal = calc_Functions.equalsOp(eqList);
                    textArea1.append("\n" + finalVal);
                }

            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        decButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        expButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        sinButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        cosButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        tanButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        cotButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        lnButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        logButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append("log");
                //print the number on the screen
                textArea1.append("log");
            }
        });
        openParenButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
        negativeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(" -");
                //print the number on the screen
                textArea1.append(" -");
            }
        });
        closeParenButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                equation.append(e.getActionCommand());
                //print the number on the screen
                textArea1.append(e.getActionCommand());
            }
        });
    }

    public void buildGuiPanel() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(200, 200));
        panel2.setLayout(new GridLayout(2, 1));
        panel1.add(panel2);
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        panel3 = new JPanel();
        panel3.setBackground(new Color(-328193));
        panel2.add(panel3);
        textArea1 = new JTextArea();
        textArea1.setPreferredSize(new Dimension(150, 150));
        panel3.add(textArea1);
        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(4, 3));
       panel2.add(panel4);
        a1Button = new JButton();
        a1Button.setText("1");
        //panel4.add(a1Button, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a1Button);
        a2Button = new JButton();
        a2Button.setText("2");
        //panel4.add(a2Button, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a2Button);
        a3Button = new JButton();
        a3Button.setText("3");
        //panel4.add(a3Button, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a3Button);
        a5Button = new JButton();
        a5Button.setText("5");
        //panel4.add(a5Button, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a5Button);
        a4Button = new JButton();
        a4Button.setText("4");
        //panel4.add(a4Button, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a4Button);
        a6Button = new JButton();
        a6Button.setText("6");
        //panel4.add(a6Button, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a6Button);
        a7Button1 = new JButton();
        a7Button1.setText("7");
        //panel4.add(a7Button1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a7Button1);
        a8Button = new JButton();
        a8Button.setText("8");
        //panel4.add(a8Button, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a8Button);
        a9Button = new JButton();
        a9Button.setText("9");
        //panel4.add(a9Button, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a9Button);
        a0Button = new JButton();
        a0Button.setText("0");
        //panel4.add(a0Button, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(a0Button);
        decButton = new JButton();
        decButton.setText(".");
        //panel4.add(decButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4.add(decButton);

       // calcPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.CENTER, TitledBorder.TOP, null));
        panel5 = new JPanel();
        panel5.setLayout(new GridLayout(8, 2));
        //panel1.add(panel5, new uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel1.add(panel5);

        cButton = new JButton();
        cButton.setText("C");
        //panel5.add(cButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(cButton);
        sinButton = new JButton();
        sinButton.setText("sin");
        //panel5.add(sinButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(sinButton);
        cosButton = new JButton();
        cosButton.setText("cos");
        //panel5.add(cosButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(cosButton);
        tanButton = new JButton();
        tanButton.setText("tan");
        //panel5.add(tanButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(tanButton);
        cotButton = new JButton();
        cotButton.setText("cot");
        //panel5.add(cotButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(cotButton);
        lnButton = new JButton();
        lnButton.setText("ln");
        //panel5.add(lnButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(lnButton);
        logButton = new JButton();
        logButton.setText("log(Base 10)");
        //panel5.add(logButton, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(logButton);
        button1 = new JButton();

        button2 = new JButton();
        button2.setText("*");
        //panel5.add(button2, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(button2);
        button3 = new JButton();
        button3.setText("/");
        //panel5.add(button3, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(button3);
        button5 = new JButton();
        button5.setText("+");
        //panel5.add(button5, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(button5);
        button1.setText("-");
        //panel5.add(button1, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(button1);
        expButton = new JButton();
        expButton.setText("^");
        //panel5.add(expButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(expButton);

        negativeButton = new JButton();
        negativeButton.setText("- (negative)");
        //panel5.add(negativeButton, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(negativeButton);
        button4 = new JButton();
        button4.setText("=");
        //panel5.add(button4, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(button4);
        openParenButton = new JButton();
        openParenButton.setText("( ");
        //panel5.add(openParenButton, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(openParenButton);
        closeParenButton = new JButton();
        closeParenButton.setText(" )");
        //panel5.add(closeParenButton, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5.add(closeParenButton);
        /*
        panel2 = new JPanel();

        panel2.add(panel3);
        panel2.add(panel4);

         */
        //panel1.add(calcPanel);
        panel1.add(panel2);
        panel1.add(panel5);

        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setSize(525, 350);
        guiFrame.setContentPane(panel1);
        guiFrame.setVisible(true);
    }

    public ArrayList parseString() {
        char flag = 1;
        int startDig = 0;
        System.out.println("equation: " + equation.toString());
        System.out.println("equation length: " + equation.length());

        //New Code:

        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                eqList.add("(");
            }
            if (equation.charAt(i) == ')') {
                eqList.add(")");
            }
            //System.out.println("i :" + i);
            if (equation.charAt(i) == ' ' && equation.charAt(i + 1) == '-') {
                for (int j = i + 2; j < equation.length(); j++) {
                    //System.out.println("j :" + j);
                    if (!Character.isDigit(equation.charAt(j)) && equation.charAt(j) != '.') {
                        eqList.add(equation.substring(i + 1, j));
                        //System.out.println("Current eq val: " + equation.substring(i, j));
                        i = j - 1;
                        break;
                    }
                    if (j == equation.length() - 1) {
                        eqList.add(equation.substring(i + 1));
                        i = j;
                    }
                }
            } else if (Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') {
                for (int j = i; j < equation.length(); j++) {
                    //System.out.println("j :" + j);
                    if (!Character.isDigit(equation.charAt(j)) && equation.charAt(j) != '.') {
                        eqList.add(equation.substring(i, j));
                        //System.out.println("Current eq val: " + equation.substring(i, j));
                        i = j - 1;
                        break;
                    }
                    if (j == equation.length() - 1) {
                        eqList.add(equation.substring(i));
                        i = j;
                    }
                }
            } else if (Character.isLetter(equation.charAt(i))) {
                //System.out.println("At least got here");
                for (int j = i; j < equation.length(); j++) {
                    if (!Character.isLetter(equation.charAt(j))) {
                        //System.out.println("At least got here");
                        eqList.add(equation.substring(i, j));
                        //System.out.println("Current eq val: " + equation.substring(i, j));
                        i = j - 1;
                        break;
                    }
                    if (j == equation.length() - 1) {
                        eqList.add(equation.substring(i));
                        i = j;
                    }
                }

            } else if (isOp(equation.charAt(i))) {
                //System.out.println("Current eq val: " + equation.substring(i, i+1));
                eqList.add((equation.substring(i, i + 1)));
            }
            //System.out.println("Equation val at " + i + ": " + equation.charAt(i));
        }

        //End of new code
        System.out.println("parsed eqList: " + eqList);
        return eqList;
    }

    public boolean isInteger(String eqListVal) {
        try {
            Integer.parseInt(eqListVal);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isFloat(String eqListVal) {
        try {
            Float.parseFloat(eqListVal);
            //System.out.println("Float: " + eqListVal);
            return true;
        } catch (NumberFormatException e) {
            //System.out.println("Float: " + eqListVal);
            return false;
        }
    }

    public void throwError() {
        Error_GUI error_GUI = new Error_GUI();
        error_GUI.buildGuiPanel();
        textArea1.setText("");
        equation.setLength(0);
        eqList.clear();
    }

    public boolean validateInput(ArrayList<String> eqList) {
        boolean valSoFar = false;
        if (startEndWithOp()) {
            textArea1.setText("");
            equation.setLength(0);
            eqList.clear();
            throwError();
            return false;
        } else {
            //System.out.println(eqList.toString());
            valSoFar = true;
        }

        if (eqList.size() > 0 && valSoFar) {
            for (int i = 0; i < eqList.size(); i++) {
                if (!isInteger(eqList.get(i)) && !isFloat(eqList.get(i)) && !isOp(eqList.get(i).charAt(0)) && !isTrigFunction(eqList.get(i)) && !isParen(eqList.get(i))) {
                    textArea1.setText("");
                    equation.setLength(0);
                    eqList.clear();
                    throwError();
                    return false;
                }
            }

            //check for divide by zero
            //check for log of a negative
            //check for two operators back to back
            //check for all other potential problems
        }
        return true;
    }

    public boolean startEndWithOp() {
        if ((eqList.get(0) == "*" || eqList.get(0) == "/" || eqList.get(0) == "+" || eqList.get(0) == "-" ||
                eqList.get(0) == "^") || (eqList.get(eqList.size() - 1) == "*" || eqList.get(eqList.size() - 1) == "/" ||
                eqList.get(eqList.size() - 1) == "+" || eqList.get(eqList.size() - 1) == "-" || eqList.get(eqList.size() - 1) == "^")) {
            return true;
        } else
            return false;
    }

    public boolean isOp(char potOp) {
        if (potOp == '*' || potOp == '/' || potOp == '+' || potOp == '-' || potOp == '^') {
            return true;
        } else
            return false;
    }

    public boolean isTrigFunction(String eqListVal) {
        if (eqListVal.equalsIgnoreCase("sin") || eqListVal.equalsIgnoreCase("cos") || eqListVal.equalsIgnoreCase("tan") || eqListVal.equalsIgnoreCase("cot") || eqListVal.equalsIgnoreCase("ln") || eqListVal.equalsIgnoreCase("log")) {
            return true;
        } else
            return false;
    }

    public boolean isParen(String eqListVal) {
        if (eqListVal.equalsIgnoreCase("(") || eqListVal.equalsIgnoreCase(")")) {
            return true;
        } else
            return false;
    }
}


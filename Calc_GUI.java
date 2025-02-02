import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Calc_GUI {
    //instantiate all necessry elements of the calulator gui
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

    /**
     * constructor for Calc_GUI class
     * contains action listeners and functionalities for all buttons on calculator
     */
    public Calc_GUI() {
        Calc_Functions calc_Functions = new Calc_Functions();
        //buld the GUI panel
        panel1 = new JPanel();
        buildGuiPanel();

        //implement action listeners for all GUI buttons
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

    /**
     * builds the calculator GUI panel
     */
    public void buildGuiPanel() {
        //initialize and add all necessary GUI elements to the panel
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
        panel4.add(a1Button);
        a2Button = new JButton();
        a2Button.setText("2");
        panel4.add(a2Button);
        a3Button = new JButton();
        a3Button.setText("3");
        panel4.add(a3Button);
        a5Button = new JButton();
        a5Button.setText("5");
        panel4.add(a5Button);
        a4Button = new JButton();
        a4Button.setText("4");
        panel4.add(a4Button);
        a6Button = new JButton();
        a6Button.setText("6");
        panel4.add(a6Button);
        a7Button1 = new JButton();
        a7Button1.setText("7");
        panel4.add(a7Button1);
        a8Button = new JButton();
        a8Button.setText("8");
        panel4.add(a8Button);
        a9Button = new JButton();
        a9Button.setText("9");
        panel4.add(a9Button);
        a0Button = new JButton();
        a0Button.setText("0");
        panel4.add(a0Button);
        decButton = new JButton();
        decButton.setText(".");
        panel4.add(decButton);
        panel5 = new JPanel();
        panel5.setLayout(new GridLayout(8, 2));
        panel1.add(panel5);
        cButton = new JButton();
        cButton.setText("C");
        panel5.add(cButton);
        sinButton = new JButton();
        sinButton.setText("sin");
        panel5.add(sinButton);
        cosButton = new JButton();
        cosButton.setText("cos");
        panel5.add(cosButton);
        tanButton = new JButton();
        tanButton.setText("tan");
        panel5.add(tanButton);
        cotButton = new JButton();
        cotButton.setText("cot");
        panel5.add(cotButton);
        lnButton = new JButton();
        lnButton.setText("ln");
        panel5.add(lnButton);
        logButton = new JButton();
        logButton.setText("log(Base 10)");
        panel5.add(logButton);
        button1 = new JButton();

        button2 = new JButton();
        button2.setText("*");
        panel5.add(button2);
        button3 = new JButton();
        button3.setText("/");
        panel5.add(button3);
        button5 = new JButton();
        button5.setText("+");
        panel5.add(button5);
        button1.setText("-");
        panel5.add(button1);
        expButton = new JButton();
        expButton.setText("^");
        panel5.add(expButton);
        negativeButton = new JButton();
        negativeButton.setText("- (negative)");
        panel5.add(negativeButton);
        button4 = new JButton();
        button4.setText("=");
        panel5.add(button4);
        openParenButton = new JButton();
        openParenButton.setText("( ");
        panel5.add(openParenButton);
        closeParenButton = new JButton();
        closeParenButton.setText(" )");
        panel5.add(closeParenButton);
        panel1.add(panel2);
        panel1.add(panel5);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setSize(525, 350);
        guiFrame.setContentPane(panel1);
        guiFrame.setVisible(true);
    }

    /**
     * parses String equation
     * @return ArrayList version of String equation
     */
    public ArrayList parseString() {
        //char flag = 1;
        //int startDig = 0;

        //using a for loop, parse through the equation string and build an arraylist using its values and operators
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                eqList.add("(");
            }
            if (equation.charAt(i) == ')') {
                eqList.add(")");
            }
            if (equation.charAt(i) == ' ' && equation.charAt(i + 1) == '-') {
                for (int j = i + 2; j < equation.length(); j++) {
                    if (!Character.isDigit(equation.charAt(j)) && equation.charAt(j) != '.') {
                        eqList.add(equation.substring(i + 1, j));
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
                    if (!Character.isDigit(equation.charAt(j)) && equation.charAt(j) != '.') {
                        eqList.add(equation.substring(i, j));
                        i = j - 1;
                        break;
                    }
                    if (j == equation.length() - 1) {
                        eqList.add(equation.substring(i));
                        i = j;
                    }
                }
            } else if (Character.isLetter(equation.charAt(i))) {
                for (int j = i; j < equation.length(); j++) {
                    if (!Character.isLetter(equation.charAt(j))) {
                        eqList.add(equation.substring(i, j));
                        i = j - 1;
                        break;
                    }
                    if (j == equation.length() - 1) {
                        eqList.add(equation.substring(i));
                        i = j;
                    }
                }

            } else if (isOp(equation.charAt(i))) {
                eqList.add((equation.substring(i, i + 1)));
            }
        }

        System.out.println("parsed eqList: " + eqList);
        return eqList;
    }

    /**
     * determines if the passed val is an integer
     * @param eqListVal
     * @return boolean true or false
     */
    public boolean isInteger(String eqListVal) {
        //determine if a value is an integer or not
        try {
            Integer.parseInt(eqListVal);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * determines if the passed val is a float
     * @param eqListVal
     * @return boolean true or false
     */
    public boolean isFloat(String eqListVal) {
        //determine if a value is a float or not
        try {
            Float.parseFloat(eqListVal);
            //System.out.println("Float: " + eqListVal);
            return true;
        } catch (NumberFormatException e) {
            //System.out.println("Float: " + eqListVal);
            return false;
        }
    }

    /**
     * displays GUI error message
     */
    public void throwError() {
        //build and display an error GUI panel
        Error_GUI error_GUI = new Error_GUI();
        error_GUI.buildGuiPanel();
        textArea1.setText("");
        equation.setLength(0);
        eqList.clear();
    }

    /**
     * determines if passed ArrayList equation is valid
     * @param eqList
     * @return boolean true or false
     */
    public boolean validateInput(ArrayList<String> eqList) {
        //using a flag variable, iterate through the equation and determine if it is valid
        boolean valSoFar = false;
        if (startEndWithOp()) {
            textArea1.setText("");
            equation.setLength(0);
            eqList.clear();
            throwError();
            return false;
        } else {
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
        }
        return true;
    }

    /**
     * determines if the equation starts or ends with a binary operator
     * @return boolean true or false
     */
    public boolean startEndWithOp() {
        //determine if the equation begins or ends with an operator
        if ((eqList.get(0) == "*" || eqList.get(0) == "/" || eqList.get(0) == "+" || eqList.get(0) == "-" ||
                eqList.get(0) == "^") || (eqList.get(eqList.size() - 1) == "*" || eqList.get(eqList.size() - 1) == "/" ||
                eqList.get(eqList.size() - 1) == "+" || eqList.get(eqList.size() - 1) == "-" || eqList.get(eqList.size() - 1) == "^")) {
            return true;
        } else
            return false;
    }

    /**
     * determines if the passed value is a binary operator
     * @param potOp
     * @return boolean true or false
     */
    public boolean isOp(char potOp) {
        //determine if the passed character is a binary operator or not
        if (potOp == '*' || potOp == '/' || potOp == '+' || potOp == '-' || potOp == '^') {
            return true;
        } else
            return false;
    }

    /**
     * determines if the passed value is a trig function or a log
     * @param eqListVal
     * @return boolean true or false
     */
    public boolean isTrigFunction(String eqListVal) {
        //determing if the passed string is a unary operator
        if (eqListVal.equalsIgnoreCase("sin") || eqListVal.equalsIgnoreCase("cos") || eqListVal.equalsIgnoreCase("tan") || eqListVal.equalsIgnoreCase("cot") || eqListVal.equalsIgnoreCase("ln") || eqListVal.equalsIgnoreCase("log")) {
            return true;
        } else
            return false;
    }

    /**
     * determines if the passed value is a parentheses
     * @param eqListVal
     * @return boolean true or false
     */
    public boolean isParen(String eqListVal) {
        //determine if the passed string is a parenthesis
        if (eqListVal.equalsIgnoreCase("(") || eqListVal.equalsIgnoreCase(")")) {
            return true;
        } else
            return false;
    }
}


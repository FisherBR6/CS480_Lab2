import java.util.ArrayList;

import static java.lang.Float.MIN_VALUE;

public class Calc_Functions {
    public float add(float a, float b) { return a + b;}

    public float sub(float a, float b) {return a - b;}

    public float mul(float a, float b) {return a * b;}

    public float div(float a, float b) {return a / b;}

    public float exp(float a, float b){return (float) Math.pow(a, b);}

    public float sin(float a){return (float) Math.sin(a);}
    public float cos(float a){return (float) Math.cos(a);}
    public float tan(float a){return (float) Math.tan(a);}
    public float cot(float a){return (float) (1/Math.tan(a));}
    public float ln(float a){return (float) Math.log(a);}
    public float log(float a){return (float) Math.log10(a);}

    private Calc_GUI gui;


    public float equalsOp(ArrayList<String> eqList){
        System.out.println("eqList in functions 1: " + eqList);
        if(parenPresent(eqList)){
            eqList = checkParens(eqList);
        }
        System.out.println("eqList in functions 2: " + eqList);
        return findVal(eqList);
    }
    public float findVal(ArrayList<String> eqList) {
        float a = MIN_VALUE;
        float b = MIN_VALUE;
        char operator = ' ';
        float finalVal = 0;
        boolean flag = false;
        int j = 0;

        while(eqList.size() >= 2 && j < eqList.size()) {
            for (int i = j; i < eqList.size(); i++) {
                if (eqList.get(i).equalsIgnoreCase("sin")) {
                    float sinVal = sin(Float.parseFloat(eqList.get(i + 1)));
                    eqList.remove(i);
                    eqList.remove(i);
                    eqList.add(i, String.valueOf(sinVal));
                    finalVal = sinVal;
                } else if (eqList.get(i).equalsIgnoreCase("cos")) {
                    float cosVal = cos(Float.parseFloat(eqList.get(i + 1)));
                    eqList.remove(i);
                    eqList.remove(i);
                    eqList.add(i, String.valueOf(cosVal));
                    finalVal = cosVal;
                } else if (eqList.get(i).equalsIgnoreCase("tan")) {
                    float tanVal = tan(Float.parseFloat(eqList.get(i + 1)));
                    eqList.remove(i);
                    eqList.remove(i);
                    eqList.add(i, String.valueOf(tanVal));
                    finalVal = tanVal;
                } else if (eqList.get(i).equalsIgnoreCase("cot")) {
                    float cotVal = cot(Float.parseFloat(eqList.get(i + 1)));
                    eqList.remove(i);
                    eqList.remove(i);
                    eqList.add(i, String.valueOf(cotVal));
                    finalVal = cotVal;
                } else if (eqList.get(i).equalsIgnoreCase("ln")) {
                    if (Float.parseFloat(eqList.get(i + 1)) < 0){
                        throwError();
                        break;
                    }
                    float lnVal = ln(Float.parseFloat(eqList.get(i + 1)));
                    eqList.remove(i);
                    eqList.remove(i);
                    eqList.add(i, String.valueOf(lnVal));
                    finalVal = lnVal;
                } else if (eqList.get(i).equalsIgnoreCase("log")) {
                    if (Float.parseFloat(eqList.get(i + 1)) < 0){
                        throwError();
                        break;
                    }
                    float logVal = log(Float.parseFloat(eqList.get(i + 1)));
                    eqList.remove(i);
                    eqList.remove(i);
                    eqList.add(i, String.valueOf(logVal));
                    finalVal = logVal;
                }
            }
            if (eqList.get(j).charAt(0) == '*') {
                a = Float.parseFloat(eqList.get(j - 1));
                b = Float.parseFloat(eqList.get(j + 1));
                float c = mul(a, b);
                System.out.println("c = " + c);
                System.out.println("String.valueOf(c) = " + String.valueOf(c));
                eqList.add(j - 1, String.valueOf(c));
                finalVal = c;
                eqList.remove(j);
                eqList.remove(j);
                eqList.remove(j);
                j = 0;
            } else if (eqList.get(j).charAt(0) == '/') {
                if(Float.parseFloat(eqList.get(j+1)) == 0){
                    throwError();
                    break;
                }
                a = Float.parseFloat(eqList.get(j - 1));
                b = Float.parseFloat(eqList.get(j + 1));
                float c = div(a, b);
                eqList.add(j - 1, String.valueOf(c));
                finalVal = c;
                eqList.remove(j);
                eqList.remove(j);
                eqList.remove(j);
                j = 0;
            }
            else if (eqList.get(j).charAt(0) == '^') {
                a = Float.parseFloat(eqList.get(j - 1));
                b = Float.parseFloat(eqList.get(j + 1));
                float c = exp(a, b);
                eqList.add(j - 1, String.valueOf(c));
                finalVal = c;
                eqList.remove(j);
                eqList.remove(j);
                eqList.remove(j);
                j = 0;
            }
            j++;
        }
        int i = 0;
        System.out.println("eqList size: " + eqList.size());
        while(eqList.size() > 2 && i < eqList.size()) {
            if (eqList.get(i).charAt(0) == '+') {
                a = Float.parseFloat(eqList.get(i - 1));
                b = Float.parseFloat(eqList.get(i + 1));
                float c = add(a, b);
                eqList.add(i - 1, String.valueOf(c));
                finalVal = c;
                eqList.remove(i);
                eqList.remove(i);
                eqList.remove(i);
                i = 0;
            }
            if (eqList.get(i).charAt(0) == '-' && eqList.get(i).length() == 1 ) {
                a = Float.parseFloat(eqList.get(i - 1));
                b = Float.parseFloat(eqList.get(i + 1));
                float c = sub(a, b);
                eqList.add(i - 1, String.valueOf(c));
                finalVal = c;
                eqList.remove(i);
                eqList.remove(i);
                eqList.remove(i);
                i = 0;
            }
            i++;
        }
        eqList.clear();
        return finalVal;
    }

    public ArrayList checkParens(ArrayList<String> eqList) {
        int openIndex = 0;
        int closeIndex = 0;
        int numOpen = 0;
        int numClose = 0;
        float currVal = 0;
        boolean parenFlag = true;

        for (int i = 0; i < eqList.size(); i++) {
            if (eqList.get(i).charAt(0) == '(') {
                numOpen++;
            }else if (eqList.get(i).charAt(0) == ')') {
                numClose++;
            }
        }
        if (numOpen != numClose) {
            throwError();
        }

        ArrayList<String> eqCopy = new ArrayList<>();

        Calc_Functions calc = new Calc_Functions();
        while (parenFlag) {
            parenFlag = false;
            for (int i = 0; i < eqList.size(); i++) {
                if (eqList.get(i).charAt(0) == '(') {
                    openIndex = i;
                    parenFlag = true;
                }
            }
            for (int i = 0; i < eqList.size(); i++) {
                if (eqList.get(i).charAt(0) == ')') {
                    closeIndex = i;
                    break;
                }
            }
            for (int i = openIndex + 1; i < closeIndex; i++) {
                eqCopy.add(eqList.get(i));
            }
            currVal = calc.findVal(eqCopy);
            int j = openIndex;
            System.out.println("eqList 3: " + eqList);
            while(true && j < eqList.size()) {
                if (eqList.get(j).charAt(0) == ')') {
                    eqList.remove(j);
                    eqList.add(j, String.valueOf(currVal));
                    break;
                }else {
                    eqList.remove(j);
                }
            }
            parenFlag = parenPresent(eqList);
        }


        return eqList;
    }

    public boolean parenPresent(ArrayList<String> eqList) {
        for (int i = 0; i < eqList.size(); i++) {
            if (eqList.get(i).charAt(0) == '(') {
                return true;
            }
        }
        return false;
    }

    public void throwError() {
        Error_GUI error_GUI = new Error_GUI();
        error_GUI.buildGuiPanel();
        gui.textArea1.setText("");
        gui.equation.setLength(0);
        gui.eqList.clear();
    }
}


package mypackage.calculator;

public class Calculator {



        public enum Operation{
            SUM, SUB, MUL, DIV
        }

        int result;

        public int calculate(int num1, int num2, Operation operation) {
            switch (operation) {
                case SUM: result = num1+num2;
                    break;

                case SUB: result = num1-num2;
                    break;

                case MUL: result = num1*num2;
                    break;

                case DIV: result = num1/num2;


            } return result;
        }
    }


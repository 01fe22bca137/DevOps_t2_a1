/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two operands.
 */

 class calculator extends Extendedcalculator{
    float addition(float oparend_1, float oparend_2){
        return(oparend_1 + oparend_2);
    }
    float subtraction(float oparend_1, float oparend_2){
        return(oparend_1 - oparend_2);
    }
    // The `float multiplication(float oparend1, float oparend2)` method in the `Calculator` class is
    // performing a multiplication operation on two operands `oparend1` and `oparend2`. It multiplies
    // the values of `oparend1` and `oparend2` and returns the result.
    float multiplication(float oparend_1, float oparend_2){
        return(oparend_1 * oparend_2);
    }
    /**
     * The function "division" takes two float numbers as input and returns their division result.
     * 
     * @param oparend_1 The first operand of the division operation.
     * @param oparend_2 The second operand in the division operation.
     * @return the result of dividing oparend1 by oparend2.
     */
    float division(float oparend_1, float oparend_2){
        return(oparend_1 / oparend_2);

    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        float oparend_1 =10;
        float oparend_2 =5;
        float add_result =calc.addition(oparend_1, oparend_2);
        System.out.println("Result of addition is " + add_result);

        float sub_result =calc.subtraction(oparend_1, oparend_2);
        System.out.println("Result of subtraction is " + sub_result);

        float mul_result =calc.multiplication(oparend_1, oparend_2);
        System.out.println("Result of multiplication is " + mul_result);

       // The code `float div_result =calc.division(oparend1, oparend2);` is performing a division
       // operation using the `division` method of the `Calculator` class. It takes the values of
       // `oparend1` and `oparend2` as input and returns the result of dividing `oparend1` by
       // `oparend2`. The result is then stored in the variable `div_result`.
        float div_result =calc.division(oparend_1, oparend_2);
        System.out.println("Result of division is " + div_result);

        

       // The code is calculating the square, cube, and modulus of the operand `oparend_1` using the
       // methods `square`, `qube`, and `modulo` respectively.
        float square_result =calc.square(oparend_1);
        System.out.println("Result of square is " + square_result);

       // The code `float qube_result =calc.qube(oparend_1);` is calculating the cube of the operand
       // `oparend_1` using the `qube` method of the `calculator` class. The `qube` method takes the
       // value of `oparend_1` as input, calculates its cube, and returns the result. The result is
       // then stored in the variable `qube_result`.
        float qube_result =calc.qube(oparend_1);
        System.out.println("Result of qube is " + qube_result);

       // The code `float modulo_result =calc.modulo(oparend_1,oparend_2);` is calculating the modulus
       // of `oparend_1` and `oparend_2` using the `modulo` method of the `calculator` class. The
       // `modulo` method takes the values of `oparend_1` and `oparend_2` as input, performs the
       // modulus operation, and returns the result. The result is then stored in the variable
       // `modulo_result`. Finally, the result is printed to the console using
       // `System.out.println("Result of modulus is " + modulo_result);`.
        float modulo_result =calc.modulo(oparend_1,oparend_2);
        System.out.println("Result of modulus is " + modulo_result);
    }
}

  /**
   * The Extendedcalculator class is a Java class that likely contains additional functionality beyond
   * a basic calculator.
   */
  class Extendedcalculator {
    /**
     * The function "square" takes a float as input and returns the square of that number.
     * 
     * @param oparend_1 The parameter "oparend_1" is a float variable that represents the operand for
     * which we want to calculate the square.
     * @return the square of the input operand.
     */
    float square(float oparend_1){
        return(oparend_1*oparend_1);
    }
   // The `qube` method in the `Extendedcalculator` class is calculating the cube of the `oparend_2`
   // parameter. It multiplies `oparend_2` by itself three times (`oparend_2 * oparend_2 * oparend_2`)
   // and returns the result as a `float` value.
    float  qube(float oparend_2){
        return(oparend_2*oparend_2*oparend_2);
    }
    // The `float modulo(float oparend_1,float oparend_2)` method in the `Extendedcalculator` class is
    // calculating the modulo (remainder) of `oparend_1` divided by `oparend_2`. It uses the `%`
    // operator to perform the modulo operation and returns the result as a `float` value.
    float modulo(float oparend_1,float oparend_2){
        return(oparend_1%oparend_2);
    }
}


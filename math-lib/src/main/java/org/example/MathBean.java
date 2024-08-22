package org.example;

import lombok.NoArgsConstructor;

/**
 * MathBean is a simple utility class providing common mathematical operations.
 * This class is intended to be used as a Spring Bean in your application.
 */

@NoArgsConstructor
public class MathBean {

    /**
     * Adds two integers together.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first one.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers together.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second one.
     * Note: This method does not handle division by zero.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

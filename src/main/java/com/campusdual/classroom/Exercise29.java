package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try
        {
            int erroInt = 10 / 0;
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Error" + exception.getMessage());
        }
    }
}

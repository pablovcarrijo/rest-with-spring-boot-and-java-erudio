package br.com.controllers;

import br.com.exceptions.UnsoppotedMathOperationException;

public class VerifyControllers {

    public static boolean isNumber(String numberString){
        try{
            if(numberString == null || numberString.isEmpty()){
                return false;
            }
            String number = numberString.replace(",",".");
            Integer.parseInt(number);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    public static Double convertToDouble(String number) throws IllegalArgumentException{
        if(number == null || number.isEmpty()){
            throw new UnsoppotedMathOperationException("Please, set a numeric value");
        }
        return Double.parseDouble(number.replace(",","."));
    }

}

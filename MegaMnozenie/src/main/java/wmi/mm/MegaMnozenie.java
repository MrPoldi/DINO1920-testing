/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.mm;

/**
 *
 * @author bikol
 */
public class MegaMnozenie
{

    public static String mnozenie(String a, String b)
    {
        // both "a" and "b" are double or int
        if(isParsableToDouble(a) && isParsableToDouble(b)){
            // both "a" and "b" are int
            if(isParsableToInt(a) && isParsableToInt(b)){
                int aa = Integer.parseInt(a);
                int bb = Integer.parseInt(b);
                return Integer.toString(aa * bb);
            }
            // one of them is double
            else{
                double aa = Double.parseDouble(a);
                double bb = Double.parseDouble(b);
                double result = Math.round(aa * bb * 100.0) / 100.0;
                return Double.toString(result);
            }
        }
        // second one is string
        else if (isParsableToInt(a) && !isParsableToInt(b)){
            int aa = Integer.parseInt(a);
            return multiplyString(b, aa);
        }
        // first one is string
        else{
            int bb = Integer.parseInt(b);
            return multiplyString(a, bb);
        }
    }

    // Method checks if given String is parsable to int
    public static boolean isParsableToInt(String value)
    {
        try
        {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }


    public static String multiplyString(String stringToMultiply, int howManyTimes)
    {
        String result = "";

        for(int i = 0; i < howManyTimes; i ++)
        {
            result += stringToMultiply;
        }
        return result;
    }

    private static boolean isParsableToDouble(String value){
        try{
            Double.parseDouble(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

}
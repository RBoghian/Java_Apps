public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int prim= (int) firstNumber;
        int secund = (int)secondNumber;
        if(prim == secund){             //unitate
            firstNumber*=10;
            secondNumber*=10;
           prim= (int) firstNumber;
            secund = (int)secondNumber;
            if(prim==secund){           //1 zecimala
                firstNumber*=10;
                secondNumber*=10;
                prim= (int) firstNumber;
                secund = (int)secondNumber;
                        if(prim==secund){       //2 zecimala
                            firstNumber*=10;
                            secondNumber*=10;
                            prim= (int) firstNumber;
                            secund = (int)secondNumber;
                            if(prim == secund){     //3 zecimala
                                return true;
                            }else{return false;}
                        }else{return false;}
            }else{return false;}
        }else{return false;}



    }
}

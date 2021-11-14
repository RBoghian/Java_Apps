public class FeetInchesCalculator {

    public static double calcFeetAndInchesToCentimeters ( double feet, double inches){
        if((feet>=0)&&(inches>=0&&inches<=12)){
           inches+= (feet *12);
           double centimeters = inches*2.54;

           return centimeters;

        }else{
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters (double inches){
        if(inches>=0){
         double centimeters = calcFeetAndInchesToCentimeters(0,inches);
         double feet = centimeters*0.032808;
return feet;
        }else{
            return -1;
        }
    }
}

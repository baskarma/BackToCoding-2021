/*
* Question:
* Given two integers, an hour and a minute, write a function to calculate the angle between the two hands on a clock representing that time.
*/

public class Solution11M {
    public static void main(String args[]){
        System.out.println(clockAngle(12,00));
    }

    public static String clockAngle(int hour, int minutes){
        if((hour <= 0 || hour >= 13) || (minutes < 0 || minutes > 59))
            return null;
        
        double degreePerMinute = 360 / 60;
        double degreePerHour = 360 / 12;
        
        double minuteAngle = minutes * degreePerMinute;
        double hourAngle = hour * degreePerHour + ((minutes / 60) * degreePerHour);
        
        double diff = Math.abs(minuteAngle - hourAngle);
        if(diff > 180)
            return Double.toString(360 - diff) + " deg";

        return Double.toString(diff) + " deg";
    }
}

/*
Testcases:

T1: clockAngle(3, 40) --> 150.0 deg
T2: clockAngle(-3, 40)--> null
T3: clockAngle(12, 00)--> 0.0 deg
*/
public class TimeCalc {
    public static void main(String[] args) {
        String time24hr = args[0];
        // שעות הן התווים 0 ו-1. דקות הן התווים 3 ו-4.
        String hoursStr = time24hr.substring(0, 2);
        String minutesStr = time24hr.substring(3, 5);
        String minutesToAdd = args[1];
        int minadd = Integer.parseInt(minutesToAdd);
        int hours24 = Integer.parseInt(hoursStr);
        int min60 = Integer.parseInt(minutesStr);
        int newmin;
        int newhour;
        int totalmin = min60 + hours24 * 60 + minadd;
        newhour = totalmin / 60;
        newmin = totalmin % 60 ;
        if (newhour > 23) {
            newhour = newhour - 24;
        }
        String outhour = String.valueOf(newhour);
        String outmin = String.valueOf(newmin) ;
        char chartoadd = '0';
        if (newhour<10){
            outhour = chartoadd + outhour;
        }
        if (newmin<10){
            outmin = chartoadd + outmin;
        }
        System.out.println(outhour + ":" + outmin);
    }
}
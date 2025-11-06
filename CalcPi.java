// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) { 
        String Num = args[0];
        int n = Integer.parseInt(Num);
        double sum = 0.0;
        int sign = 1;
        int mechane = 1;
        for (int i = 0; i < n; i++) {
            double term = sign * (1.0 / mechane);
            sum = sum + term;
            mechane = mechane + 2;  // המכנה תמיד גדל ב-2 (1, 3, 5...)
            sign = sign * -1;       // הסימן מתהפך כל פעם
        }
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + (sum * 4));
    }
}
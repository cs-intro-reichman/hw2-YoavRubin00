public class Cheers {
    public static void main(String[] args) {
        String str = args[0];
        int n = Integer.parseInt(args[1]);
        String specialChars = "AEFHILMNORSX";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char chUpper = Character.toUpperCase(ch); 
            String article;
            if (specialChars.indexOf(chUpper) != -1) {
                article = "an";
            } else {
                article = "a "; 
            }
            System.out.println("Give me " + article + " " + chUpper + ": " + chUpper + "!");
        }

        System.out.println("What does that spell?");
        String strUpper = str.toUpperCase();
        for (int i = 0; i < n; i++) {
            System.out.println(strUpper + "!!!");
        }
    }
}
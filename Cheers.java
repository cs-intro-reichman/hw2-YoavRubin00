public class Cheers {
    public static void main(String[] args) {
        String str = args[0];
        String Num = args[1];
        int n = Integer.parseInt(Num);
        String specialChars = "AEFHILMNORSX";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            String article;
            if (specialChars.indexOf(ch) != -1) {
                article = "an";
            } else {
                article = "a";
            }
            System.out.println("give me " + article + " " + ch + ": " + ch + "!");
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < n; i++) {
            System.out.println(str + "!!!");
        }
    }
}
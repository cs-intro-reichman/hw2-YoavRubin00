public class Collatz {
    public static void main(String[] args) {
        
        int N = Integer.parseInt(args[0]); 
        String mode = args[1]; 
        // יוצר "דגל" בוליאני לבדיקה קלה בהמשך
        // mode.equals("v") יחזיר true אם המשתמש הזין "v"
        boolean isVerbose = mode.equals("v");
        for (int seed = 1; seed <= N; seed++) {
        int currentNum = seed;
        int steps = 1;
        if (isVerbose) {
            System.out.print(currentNum + " "); // הדפס את ה-seed
}
        while (currentNum != 1 || steps == 1) {
        if (currentNum % 2 == 0) {
        currentNum = currentNum / 2;
        }   
        else {
        currentNum = (currentNum * 3) + 1;
        }
        steps++; // קדם צעדים
        if (isVerbose) {
        System.out.print(currentNum + " ");
        }
}
        if (isVerbose) {
        System.out.println("(" + steps + ")");
}
        } 
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
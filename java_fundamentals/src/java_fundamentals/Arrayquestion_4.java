package java_fundamentals;

public class Arrayquestion_4 {
    public static void main(String[] args) {
        
        int[] asciiValues = {72, 69, 76, 76, 79};

        System.out.print("Characters: ");

       
        for (int value : asciiValues) {
            System.out.print((char) value);
        }
    }
}
package Cwiczenie_1;

public class Opakowanie {
    public static void main(String[] args) {
        int x= 5;
        Integer x1= Integer.valueOf(x);
        Integer x2 = new Integer(x);

        int y = x1.intValue();
        System.out.println(y);
    }

}

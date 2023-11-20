package Recursion;

public class Fibinochi {

    public static int FibinochiFind(int number) {

        if (number <= 1) {
            return number;
        }
        return FibinochiFind(number - 1) + FibinochiFind(number - 2);
    }

    public static void main(String[] args) {
        // Fibinochi s = new Fibinochi();
        int and = FibinochiFind(4);
        System.out.println(and);
    }
}

public class Main {
    public static void main(String[] args) {

        Iterative iterative = new Iterative();

        int[] fibonacciArray = {
                4181, 89, 2584, 2, 3, 8, 5, 34, 21, 13,
                55, 1, 144, 1597, 377, 610, 987,
                233, 1, 0
        };
        iterative.sortIteratively(fibonacciArray);
    }
}
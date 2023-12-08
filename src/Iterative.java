public class Iterative {

    public int[] sortIteratively(int[] fibanachInts){

        boolean isIntsSorted = false;
        while (!isIntsSorted){
            isIntsSorted = true;
            for (int i = 1; i < fibanachInts.length; i++) {
                if (fibanachInts[i] < fibanachInts[i - 1]) {
                    int temp = fibanachInts[i];
                    fibanachInts[i] = fibanachInts[i - 1];
                    fibanachInts[i - 1] = temp;
                    isIntsSorted = false;
                }
            }
        }
        for (int print : fibanachInts){
            System.out.print(print + " ");
        }
        return fibanachInts;
    }
}

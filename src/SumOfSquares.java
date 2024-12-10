public class SumOfSquares {
    public static void main(String[] args){
        double[] array = {1,2,3,4,5};
        arraySquare(array);
        for(double num : array){
            System.out.print(num + ", ");
        }
        System.out.println("\nThe sum is " + sum(array));
    }

    public static void arraySquare(double[] original){
        for(int i = 0; i < original.length; i++){
            original[i] *= original[i];
        }
    }

    public static double sum(double[] vals){
        double total = 0;
        for(double db : vals){
            total += db;
        }
        return total;
    }
}


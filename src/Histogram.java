import java.util.Scanner;
public class Histogram {
    public static void main(String[] args){

        int[] histogram = new int[10];
        double nextDouble;
        int range = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 50 (inclusive) to add it to the histogram" +
                "\nEnter a number outside this range to display the histogram");
        nextDouble = input.nextDouble();

        while(nextDouble >= 1 && nextDouble <= 50){
            int index;
            if((nextDouble / 5 % 1 == 0)){
                index = (int)nextDouble / 5 - 1;
            }
            else{
                index = (int)nextDouble / 5;
            }
            histogram[index]++;
            System.out.println("Enter another number or a number outside this range to display the histogram");
            nextDouble = input.nextDouble();
        }
        for(int number : histogram){
            System.out.print((range) + "\t-\t" + (range + 4) + "\t|");
            range += 5;
            for(int i = number; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

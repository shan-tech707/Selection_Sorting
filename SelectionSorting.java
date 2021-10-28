import java.util.Scanner;

public class SelectionSorting {
    static boolean asc=false;
    static void display(int[] array){
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    static void selectionSorting(int[] array){
        int i,j,min_max,temp;
        for(i=0 ; i<array.length ; i++) {
            min_max=i;
            for(j=i+1 ; j<array.length ; j++) {
                if (!asc) {
                    if(array[min_max]>array[j])
                        min_max=j;
                } else {
                    if(array[min_max]<array[j])
                        min_max=j;
                }
            }
            if (min_max != i) {
                temp = array[i];
                array[i] = array[min_max];
                array[min_max] = temp;
            }
        }
        asc=true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] array=new int[5];

        for (int i=0; i<array.length;i++){
            System.out.print("Enter Value at "+i+" index = ");
            array[i]=input.nextInt();
        }

        System.out.println("The unsorted array: ");
        display(array);

        selectionSorting(array);

        System.out.println("\nThe Sorted (ASC) Array: ");
        display(array);

        selectionSorting(array);

        System.out.println("\nThe Sorted (DESC) Array: ");
        display(array);

    }
}

import java.util.Scanner;

public class countStudentsPassed {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the number of students :");
            size = scanner.nextInt();
            if (size > 30) System.out.print("Numbers of students do not exceed 30");
        }while (size>30);
        array= new int[size];
        int i = 0;
        while (i<array.length){
            System.out.print("The score of student " + (i + 1) + " = ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        for (int j = 0; j < array.length; j ++){
            if (5<=array[j]&&array[j]<=10){
                count++;
            }
        }
        System.out.print("Numbers of students passed is :" + count);
    }
}

import java.util.Scanner;

public class lastminuteclutch{

    public static void main(String[] args){
        largest_element();
    }

    public static void array_maker(){
        double[] myList = new double[3];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;           
        System.out.println(myList[2] + myList[1]);          
    }

    public static void array_samesentence(){
        double[] hisList = {1,2,3};
        System.out.println(hisList[2]);
    }

    public static void array_length(){
        int[] lengthtest = {1,2,3,4,10};
        System.out.println(lengthtest.length); //tells you the length/size of the array or in other words how much it can store

        System.out.println(4+" " +5);
    }

    public static void array_forloop(){ //printing all elements in an array
    String[] array = {"hello","world","you stupid fuck"};



    for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ";");        
        }
    }

    public static void summing_array_elements(){
        double[] array = {1,2,3,4};
        double total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        System.out.println(total);
    }

    public static void arrays_input_values(){
        // Populating Arrays with Input Values
        int[] myArray = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter" + myArray.length + " values:");
        for (int i=0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }
        System.out.println("The item stored in index 2 of the array is: " + myArray[2]);        
    }

    public static void largest_element(){
        //Finding the Largest Element
        double[ ] myArray = {10.5, 2.6, 3.0, 4.50, 7.25, 6.0, 7.2, 8.50, 9.20, 10.15};
        double max = myArray[0];
        for (int i=0; i< myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];
            }
        System.out.println("The max number in the array is: " + max);
    }

    

}
import java.util.Scanner;

public class Week4_ReadingInputsAndControlStatement{

    public static void main(String[] args){
        String x = input("dorya");
        System.out.println(x);
    }

    public static String input(String print){
        System.out.println(print);
        Scanner scanner = new Scanner(System.in);
        String intama = scanner.nextLine();



        return intama;
    }

    public static void MultiWayIf(){
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score >= 90){
            System.out.println("Grade is A");
        }
        else if (score >=80){
            System.out.println("Grade is B");
        }
        else if (score >=70){
            System.out.println("Grade is C");
        }
        else if (score >= 60){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Grade is F");
        }
    }

    public static void IfStatements(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 65){
            System.out.println("You are on a pension"); //single statement if statement
        }
        System.out.println(age);
    }

    public static void OneWayIfStatement(){
        Scanner scanner = new Scanner(System.in);
        int muldiv = scanner.nextInt();
        if (muldiv%5 == 0){
            System.out.println("HiFive");
        }
        if (muldiv%2 == 0){
            System.out.println("HiEven");
        }        
    }

    public static void TwoWayIfStatement(){
        Scanner scanner = new Scanner(System.in);
        int schoolage = scanner.nextInt();
        if (schoolage > 18){
            System.out.println("You are in college");
        }
        else{
            System.out.println("You are too young for college");
        }
    }

    public static void radius(){
        Scanner scanner = new Scanner(System.in);
        double radius1 = scanner.nextDouble();
        if (radius1 >= 0){
            System.out.println(3.14 * radius1 * radius1);
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public static void ReadingUserInput(){


    Scanner scanner = new Scanner(System.in);
    
    //System.out.println(scanner.next());  

    String experiment = scanner.next();

    System.out.println("Hi" + experiment + experiment);

    scanner.close();

/*next(): Reads the next word (up to the next whitespace).
nextLine(): Reads the entire line of input, including spaces.
nextInt(): Reads the next integer.
nextDouble(): Reads the next double.
hasNextLine(): Checks if there's another line of input to read.
nextFloat() – Reads the next float
nextLong() – Reads the next long integer
nextShort() – Read the next short integer
nextBoolean() – Read the next boolean */


    }



}
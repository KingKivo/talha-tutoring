public class Week3_ElementaryJava {
    
    public static void main(String[] args) {
        string_methods();

    }

    public static void logic_operators(){
        // Logical Operators
        /*Used to combine boolean expressions
        Java defines three logical operators:
        • && (AND),
        • || (OR),
        • ! (NOT)
        For example:*/

        boolean z = true;
        boolean y = false;
        System.out.println(z && y); // false
        System.out.println(z || y); // true
        System.out.println(!z); // false    
    }

    public static void string_methods(){
        //length() returns the number of characters in the string.
        String text = "Java";
        int len = text.length(); // len will be 4
        System.out.println("Length is: " + len);       
        
        //charAt(int index) returns the character at the specified index. Indices start at 0.
        String word = "Code";
        char firstChar = word.charAt(0); // firstChar will be 'C’
        System.out.println("First character: " + firstChar); 
        
        //substring(int beginIndex, int endIndex) returns a new string that is a substring of this string, starting from the specified index.
        String sentence = "Learning Java";
        String sub = sentence.substring(9); // sub will be "Java"
        System.out.println("Substring: " + sub);   
        
        //indexOf() returns the index of the first occurrence of a specified character or substring within the string. If the character is not found, it returns -1.
        String myString = "hello world";
        int index = myString.indexOf('o'); // This will return 4, as 'o' is at index 4 (the first one)    

        //equals(Object anotherString) Compares two strings for equality. Use this instead of ‘== ‘ to compare content.
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2)); // Prints false (case-sensitive)
        System.out.println(s1.equalsIgnoreCase(s2)); // Prints true   

        //toLowerCase() and toUpperCase() returns a new string with all characters converted to lowercase or uppercase.
        String original = "Programming";
        String lower = original.toLowerCase(); // lower is "programming“
        System.out.println("Lowercase: " + lower);    

        //String Immutability. Immutability means a String object's value cannot be changed after it is created.
        //For example:
        String str = "Hello";
        str = str.concat(" World"); // This doesn't change "Hello“
        /*The concat() method does not modify the original "Hello" object.
        It creates a new String object "Hello World" and assigns its
        reference to the variable str.
        The original "Hello" object is now eligible for garbage collection.*/

        String a = "test";
        String b = new String("test");
        System.out.println(a == b); // false (different objects in memory)
        /*What it compares: The memory address (reference) of two string objects.
        Use Case: To check if two variables refer to the exact same object in memory.*/
        
        System.out.println(a.equals(b)); // true (same content)
        /*The actual content of two strings (character by character).
        To check if two strings have the same sequence of characters. This is what you almost always want.*/

    }

    public static void string_concatenation(){
        String firstName, lastName;

        firstName ="Joe";
        lastName ="Mark";

        System.out.println("My name is " + firstName + " " + lastName);
    }

    public static void string_learning(){
        //String is a class and not a primitive data type (example float) and Strings cannot have their values changed
        String o = "talha_tutoring"; //o is not storing "talha_tutoring" but is storing an address in memory to where "talha_tutoring" is stored
        System.out.println(o);
        o = "talha_teaching"; //did not change where in the memory "talha_tutoring" is stored but referencing a new address in memory where now "talha_teaching" is being stored
        System.out.println(o); //not actually changing the value of o, but changing the address that o is calling from

        String name1 = "Alice";
        String name2 ="Alice"; //Reuse the same object being "Alice"
        System.out.println(name1 == name2); //if both name1 and name2 are the same values, then it will print true otherwise it will print false 

        System.out.println( System.identityHashCode(name1) ); //address for name1
        System.out.println( System.identityHashCode(name2) ); //address for name2
                                                              /*NOTE that these addresses are the same as they are referring to the same address in memory that holds the 
                                                              String object "Alice"*/


        String city1 = new String("Paris"); //This creates the original String object
        String city2 = new String("Paris"); //This is a new object
        System.out.println(city1 == city2); //check if city1 and city 2 hold the same address in memory

        System.out.println( System.identityHashCode(city1) ); //address for city1
        System.out.println( System.identityHashCode(city2) ); //address for city2        
    }

    public static void increment_decrement() {
        int i = 2;
        int j = i++; //this is postfixing, j is storing the initial value of i, only after that does i increment into 1 value higher
        int k = ++i; //this is prefixing, i is incremented into 1 value higher, then k stores that new value

        System.out.println(k);
        System.out.println(j);
        System.out.println(i);
    }

    public static void augmented_assignment(){
        int num1 = 2;
        int num2 = 3;

        num2 += num1; //this does num2 = num2 + num1 (talha make sure you explain why there is no third value later)
        num2 -= num1; // num2 = num2-num1
        num2 *= num1; // num2 = num2*num1
        num2 /= num1; // num2 = num2/num1
        num2 %= num1; // num2 = num2/num1    
        
    }

    public static void constant_typecasting(){
        final double pi = 3.14159; //adding final before the data type means you can no longer change the value (this is a constant)

        System.out.println(pi);

        int cake = (int)pi;

        System.out.println(cake); //this is an example of typecasting, changing a data type to another data type
    }

}




import jdk.nashorn.internal.ir.GetSplitState;

import java.util.*;
import java.util.stream.*;

class Main{

    
    static Scanner sc = new Scanner(System.in);

    // For Constant variables in java use final. Value cannot be changed
    final double PI = 3.14159;

    //Primitives in Java are byte, short, char, boolean, int, float, double, long
    //Float is precise up to 6 decimal. Must be concatednated with F. E.G. float a = 3.1456F;
    //Double precises up to 15 decimal places. double thousand =1e+22;

    //Casting: can go from smaller to larger, not larger to smaller. byte can be converted to int, int cannot be converted to byte

    //String myString = Double.toString(1.556); Every primitive has a class with a toString() for converting. The method is static
    //uses i++;

    //Contains tons of math functions. Random number generation
    //Strings are objects. They have a bunnch of built in methods

    static String name  = new String("Ge");
    static String animal = "cat";
    //String functions in java are
        //+= for concat name+="babe"
        //a.charAt(n)
        //a.contains("sunstring")
        //a.indexOf("substring")
        //a.equals("string")
        //a.equalsIgnoreCase("string")
        //NEVER DO S1 == S2
        //a.compareTo("strin"g) same as strcmp
        //a.replace("substring to be replaced", "substring to replace with")
        //a.replace(6, 9, "substring to insert")
        //a.substring(6, 9)
        //a.indexOf("substring")

        //Use a string buffer if using threads.

        //Arrays
        //int[] ar1 = new int[10]
        //Arrays.fill(ar1, 2) -> whole array has 2
        //ar1.length
        //One typer per array
        //int[] oneToTen = IntStream.rangeClosed(1, 10).toArray();  -> fills oneToTen with the values 1-10

        //enhanced for loop
        //for(int x: oneToTen)
        //Searching through the array. Arrays.binarySearch(oneToTen, 7);
        //int 2D[][] = new int[3][3]
        //String [][][] 3D = new String[3][3][3]

        //int a6[] = {1,2,3};
        //int a7[] = Arrays.copyOf(a6, 3);
        //Arrays.equals(a6, a7)
        //Arrays.sort(a8)
        //Arrays.toString(a8)

        //Array lists
        //ArrayList <String> al1 = new ArrayList<String>(20);
        //al1.add("Sue")
        //al1.get(n)
        //al1.set(0, "Bob") ->replaced Sue with Bob
        //al1.remove(0);
        //al1.clear();

        //Iterator it = al1.iterator();
        //while(it.hasNext())
        //{
        //  it.next();
        //}

        //LinkedLists 
        //LinkedList <Integer> ll1 = new LinkedList <Integer>();
        //ll1.contains(val)
    

        //Getting User input
        //if(scannerObject.hasNextLine())
        //{
            //String userInput = scannerObject.nextLine();
        //}
    public static void main(String[] args)
    {
        System.out.println("Please work in bash");
        System.out.println(name+" Here "+animal);

        int sum, sumTwo = getSum(2, 3);
    }

    private static int getSum(int a, int b)
    {
        System.out.println(a+b);
        return a+b;
    }

}
import java.util.ArrayList;

public class ArrayListDemo {
  
  public static void main(String[] args) {

    // ArrayList<Integer> alInt = new ArrayList<Integer>();

    // System.out.println("Is empty? " + alInt.isEmpty());
    // System.out.println("Size: " + alInt.size());

    // alInt.add(1);
    // alInt.add(2);
    // alInt.add(3);
    // alInt.add(4);
    // alInt.add(5);

    // System.out.println(alInt);
    // System.out.println("Size: " + alInt.size());

    ArrayList<String> strList = new ArrayList<String>();

    System.out.println("Size: " + strList.size());

    strList.add("one");
    strList.add("two");
    strList.add("three");
    strList.add("four");

    strList.add(3, "five");  // insert to specific index
    strList.remove("two");  // remove a value

    System.out.println(strList);
    System.out.println("Index of 'one': " + strList.indexOf("one"));
    System.out.println("Size: " + strList.size());
  }
}

import java.util.HashMap;


class Person {
  private String firstName;
  private String lastName;

  Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }
}

public class HashMapDemo {
  
  public static void main(String[] args) {

    HashMap<String, Person> people = new HashMap<String, Person>();

    people.put("JS", new Person("John", "Smith"));
    people.put("JW", new Person("Jane", "Wyatt"));
    people.put("MT", new Person("Mark", "Thompson"));

    // System.out.println(people.get("JS").getName());

    // System.out.println(people.keySet());

    

    System.out.println("Size " + people.size());
    System.out.println("is empty? " + people.isEmpty());
    System.out.println("Does it contain key 'MT'? " + people.containsKey("MT"));
    System.out.println("Does it contain value 'Marc'? " + people.containsValue("Marc"));

    people.remove("JW");

    for (String k : people.keySet()) {
      System.out.println(people.get(k).getName());
    }





  }
}

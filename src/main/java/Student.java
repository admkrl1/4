public class Student {

  private String Name;
  private String LastName;
  private int Age;

  public Student(String name, String lastName, int age) {
    Name = name;
    LastName = lastName;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetLastName() {return LastName;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + LastName + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", "Parse Error", -1);
    else
    return new Student(data[0], data[1], Integer.parseInt(data[2]));
  }
}
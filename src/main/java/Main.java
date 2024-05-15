/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

  import java.io.IOException;
  import java.util.Scanner;

  class Main {
    public static void main(String[] args) {
      try {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
      while(true){
        System.out.println("Wybierz opcję: 1. Dodaj studenta, 2. Wypisz listę studentów, 3. Dodaj studenta z innymi danymi");
        int k = scanner.nextInt();

        switch(k) {
          case 2:
          var students = service.getStudents();
        for(Student student : students){
          System.out.println(student.ToString());    
        }
        break;
          case 3:
            System.out.println("Podaj imię studenta:");
            String name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.println("Podaj nazwisko studenta:");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wiek studenta:");
            int age = scanner.nextInt();
            service.addStudent(new Student(name, lastName, age));
            break;
      }


      }

      }
     catch (IOException e) {

      }
    }
  } 
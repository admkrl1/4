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
        System.out.println("Wybierz opcję: 1. Dodaj studenta, 2. Wypisz listę studentów");
        String k = scanner.nextLine();

        switch(k) {
         case"1":
          System.out.println("Podaj imię studenta:");
          String imię = scanner.nextLine();
          System.out.println("Podaj wiek studenta:");
          int wiek = scanner.nextInt();
          scanner.nextLine();
        service.addStudent(new Student(imię, wiek));
        break;
         case"2":
          var students = service.getStudents();
        for(Student student : students){
          System.out.println(student.ToString());
        }
        break;
          
      }


      }

      }
     catch (IOException e) {

      }
    }
  } 
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
        System.out.println("Wybierz opcję: 2. Wypisz listę studentów, 4. Dodaj studenta z datą urodzenia");
        int k = scanner.nextInt();

        switch(k) {
          case 2:
          var students = service.getStudents();
        for(Student student : students){
          System.out.println(student.ToString());    
        }
        break;
          case 4:
            System.out.println("Podaj imię: ");
            String name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wiek: ");
            int age = scanner.nextInt();
            System.out.println("Podaj datę urodzenia: ");
            String birthDate = scanner.nextLine();
            birthDate = scanner.nextLine();
            service.addStudent(new Student(name, lastName, age, birthDate));
            break;
      }


      }

      }
     catch (IOException e) {

      }
    }
  } 
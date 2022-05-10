package co.edu.cesde;


import java.util.ArrayList;
import  java.util.List;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        List<Watchman> Watchmans = new ArrayList();
        List<Cleaningstaff> Cleaningstaffs = new ArrayList();
        List<Accountant> Accountants = new ArrayList();
        List<Admin> Admins = new ArrayList();

        String j = "si";
        int n;

        while (j.equals("si") || j.equals("si") || j.equals("SI")) {

            System.out.println("Que profesion desea digitar 1.Watchman,2.Cleaningstaff, 3.Accountant, 4.Admin");
            n = Integer.parseInt(scanner.nextLine());

            if (n == 1) {


                Watchman Watchman = new Watchman();
                System.out.println("Ingrese el nombre del vigilante");
                Watchman.setName(scanner.nextLine());
                System.out.println("Ingrese el numero de identificacion del vigilante");
                Watchman.setIdentification(scanner.nextLine());
                System.out.println(" Ingrese la edad del vigilante");
                Watchman.setAge(scanner.nextLine());
                System.out.println(" Ingrese el tipo de arma");
                Watchman.setWeapon(scanner.nextLine());
                System.out.println("ingrese el dia de trabajo");
                Watchman.setWorkday(scanner.nextLine());
                Watchmans.add(Watchman);
            } else {
                if (n == 2) {

                    Cleaningstaff Cleaningstaff = new Cleaningstaff();
                    System.out.println("Ingrese el nombre de su equipo de limpieza");
                    Cleaningstaff.setName(scanner.nextLine());
                    System.out.println("Ingrese el numero de indentificacion de su equipo de limpieza");
                    Cleaningstaff.setIdentification(scanner.nextLine());
                    System.out.println("Ingrese la edad de su equipo de limpieza");
                    Cleaningstaff.setAge(scanner.nextLine());
                    System.out.println("Ingrese el dia de descanso de su equipo de limpieza");
                    Cleaningstaff.setDayoff(scanner.nextLine());
                    Cleaningstaffs.add(Cleaningstaff);
                } else {
                    if (n == 3) {

                        Accountant Accountant = new Accountant();
                        System.out.println(" Ingrese el nombre del contador");
                        Accountant.setName(scanner.nextLine());
                        System.out.println("Ingrese el numero de identificacion del contador");
                        Accountant.setIdentification(scanner.nextLine());
                        System.out.println("Ingrese la edad del contador");
                        Accountant.setAge(scanner.nextLine());
                        System.out.println("Ingrese el nombre del jefe del contador");
                        Accountant.setLeader(scanner.nextLine());
                        System.out.println("ingrese el parqueadero del contador");
                        Accountant.setParking(scanner.nextLine());
                        Accountants.add(Accountant);
                    } else {
                        if (n == 4) {

                            Admin Admin = new Admin();
                            System.out.println(" Ingrese el nombre del administrador");
                            Admin.setName(scanner.nextLine());
                            System.out.println("Ingrese la edad del administrador ");
                            Admin.setAge(scanner.nextLine());
                            System.out.println(" Ingrese el numero de identificacion del administrador");
                            Admin.setIdentification(scanner.nextLine());
                            System.out.println("Ingrese el nombre del jefe del administrador ");
                            Admin.setLeader(scanner.nextLine());
                            System.out.println("ingrese el parqueadero del administrador");
                            Admin.setParking(scanner.nextLine());
                            Admins.add(Admin);
                        }
                    }
                }
            }
            System.out.println("desea ingresar otra profesion:");
            String stop = scanner.nextLine();
            if (stop.equals("no") || stop.equals("NO")) {
                break;
            }



        }

        System.out.println("Cual es la profesion que desea consultar 1.Watchman,2.Cleaningstaff, 3.Accountant, 4.Admin ");
         n = Integer.parseInt(scanner.nextLine());
         switch (n)
         {

             case 1:
                 for ( int a= 0; a< Watchmans.size();a++){
                     System.out.println("el perfil del vigilante: " + Watchmans.get(a).Watchman());
                 }
                 break;

             case 2:
                 for ( int b= 0; b<Cleaningstaffs.size();b++){
                     System.out.println("El equipo de limpieza es: " + Cleaningstaffs.get(b).Cleaningstaff());
                 }
                 break;


             case 3:
                 for ( int c= 0; c<Accountants.size();c++){
                     System.out.println("El nombre del contador es: " + Accountants.get(c).Accountant());
                 }
                 break;

             case 4:
                 for ( int d= 0; d<Admins.size();d++){
                     System.out.println("El nombre del administrador es: " + Admins.get(d).Admin());
                 }
                 break;

         }

    }
}

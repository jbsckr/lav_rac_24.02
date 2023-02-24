import java.util.Scanner;

class Naloga2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Avto avto = new Avto(
            "Honda",
            "crv",
            "petnajst tisoč evrov",
            "Tjan (",
        );

        boolean jeVoznik = false;

        for (int i = 0; i++ ) {
         System.outprintl("Napišite katero funkcijo želite izvesti");
         String vhod = sc.nextLine();    
        }

       if (vhod.equals("opis")) {
        System.out.println(avto.opis());  
       }
       else if (vhod.equals("nastaviVoznika")) {
        System.out.println(avto.nastaviVoznika());  
       }
    }
}
import java.util.Date;

public class Main {
    public static void main (String[] args) {
        Customer C1;
        Customer C2;
        Customer C3;

        String M1_Title;
        int M1_PriceCode;

        String M2_Title;
        int M2_PriceCode;

        String M3_Title;
        int M3_PriceCode;

        C1 = new Customer("John");
        C2 = new Customer("Mary");
        C3 = new Customer("Manny");

        M1_Title = "Oz The Great and Powerful";
        M1_PriceCode = Movie.NEW_RELEASE;
        Movie M1 = new Movie(M1_Title,M1_PriceCode);

        M2_Title = "The Dark Knight";
        M2_PriceCode = Movie.REGULAR;
        Movie M2 = new Movie(M2_Title,M2_PriceCode);

        M3_Title = "Wreck-it Ralph";
        M3_PriceCode = Movie.CHILDRENS;
        Movie M3 = new Movie(M3_Title,M3_PriceCode);

        Date start = new Date(2013, 7, 1);
        Date end1 = new Date(2013, 7, 6);
        Date end2 = new Date(2013, 7, 4);
        Date end3 = new Date(2013, 7, 5);
//        C1.addRental(new Rental(M1_Title, M1_PriceCode, start, end1));
//        C1.addRental(new Rental(M2_Title, M2_PriceCode, start, end2));
//        C1.addRental(new Rental(M3_Title, M3_PriceCode, start, end3));
        System.out.println(C1.htmlStatement());
        System.out.println();

        start = new Date(2013, 7, 11);
        end1 = new Date(2013, 7, 12);
        end2 = new Date(2013, 7, 19);
//        C2.addRental(new Rental(M1_Title, M1_PriceCode, start, end1));
//        C2.addRental(new Rental(M3_Title, M3_PriceCode, start, end2));
        System.out.println(C2.htmlStatement());
        System.out.println();

        start = new Date(2013, 6, 1);
        end1 = new Date(2013, 6, 3);
        end2 = new Date(2013, 6, 2);
//        C3.addRental(new Rental(M2_Title, M2_PriceCode, start, end1));
//        C3.addRental(new Rental(M3_Title, M3_PriceCode, start, end2));
        System.out.println(C3.htmlStatement());
        System.out.println();
    }
}

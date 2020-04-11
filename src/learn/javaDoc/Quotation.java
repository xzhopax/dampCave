package learn.javaDoc;

/**
 * Worker class for javaDoc
 * @author Aleksey
 */

public class Quotation {
    /**
     * Display author's name and quotation on the new line whit index
     * @param author name of the author
     * @param quotation text of the quotation
     */
    //String author = "Aleksey";
   // String quotation = "Что б вам такого пожелать, чтобы потом не завидовать?";

    public static void displayQuotation(String author, String quotation){
        System.out.printf("%s says: \n\t'%s'.\n", author,quotation); //to show quotation on the new line whit index
    }
}

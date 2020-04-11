package learn.javaDoc;

public class QuotationTest {
    public static void main(String[] args) {
        /**
         * Uses Quotation class to display quotation
         * @see Quotation#displayQuotation(java.lang.String, java.lang.String)
         */

        Quotation.displayQuotation("Aleksey", "Что б вам такого пожелать, чтобы потом не завидовать?");
        Quotation.displayQuotation(args[0],args[1]);
    }
}

package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println( Solution.sendPassword("ERQWSDstalk2sersqqAWWer72542"));

        String message = "stalker72";
        int lengthMessage = message.length();
        int hash = 75 % 26;

//        System.out.println(hash);

        System.out.println(Solution.sendPassword(message));

        //246

    }

}

package com.codewars.kyu8.welcome;

import javax.sql.rowset.FilteredRowSet;
import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        Map<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome" );
        greeting.put("czech", "Vitejte" );
        greeting.put("danish", "Velkomst" );
        greeting.put("dutch", "Welkom" );
        greeting.put("estonian", "Tere tulemast" );
        greeting.put("finnish", "Tervetuloa" );
        greeting.put("flemish", "Welgekomen" );
        greeting.put("french", "Bienvenue" );
        greeting.put("german", "Willkommen" );
        greeting.put("irish", "Failte" );
        greeting.put("italian", "Benvenuto" );
        greeting.put("latvian", "Gaidits" );
        greeting.put("lithuanian", "Laukiamas" );
        greeting.put("polish", "Witamy" );
        greeting.put("spanish", "Bienvenido" );
        greeting.put("swedish", "Valkommen" );
        greeting.put("welsh", "Croeso" );
        greeting.put("IP_ADDRESS_INVALID", "Welcome" );
        greeting.put("IP_ADDRESS_NOT_FOUND", "Welcome" );
        greeting.put("IP_ADDRESS_REQUIRED", "Welcome" );

        for (Map.Entry<String, String> item : greeting.entrySet()) {
            if (item.getKey().equals(language)){
                return item.getValue();
            }
        }
        return "Null";

    }
}

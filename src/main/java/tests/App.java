package tests;

import java.io.IOException;
import java.util.*;


public class App {
    private Map<String, Object> temporaryData = new HashMap<>();

    public static void main( String[] args ) throws InterruptedException, IOException {
        ArrayList<Integer> persistIt = new ArrayList<>(Collections.nCopies(60, 0));

        Pool.put(TempDataType.LONG_TEMPORARY_DATA,100L);
        Pool.put(TempDataType.INT_TEMPORARY_DATA,13);
        Pool.put(TempDataType.STRING_DATA,"LIST_SOURCE_val");

        //test case: data Long is present
        Long i = Pool.get(TempDataType.LONG_TEMPORARY_DATA).orElse(null);
        System.out.println("test present long(not null): " + i);

        //test case: data String format is present
        String s = Pool.get(TempDataType.STRING_DATA).orElse(null);
        System.out.println("Test present String(not null): " + s);

        //test case: if there isn't present data in collection
        String np = Pool.get(TempDataType.NOT_PRESENT_DATA).orElse("Not present!");
        System.out.println("Test not present: " + np);

        //test case: if there isn't present data in collection then use default
        String def = Pool.get(TempDataType.NOT_PRESENT_DATA, "default value");
        System.out.println("Use default value: " + def);

        //test case: data Collection
            //persist
        Pool.put(TempDataType.ARR_DATA, persistIt);
            //get
        List<Integer> readIt = Pool.get(TempDataType.ARR_DATA, new ArrayList<Integer>());
        System.out.println("Test arr: " + readIt);
    }



}

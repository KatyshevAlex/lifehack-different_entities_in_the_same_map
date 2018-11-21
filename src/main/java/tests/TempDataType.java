package tests;


import lombok.Getter;

import java.util.ArrayList;

@Getter
public class TempDataType<T> {
    public static TempDataType<Long> LONG_TEMPORARY_DATA = new TempDataType<>("any_key_1", Long.class);
    public static TempDataType<Integer> INT_TEMPORARY_DATA = new TempDataType<>("any_key_2", Integer.class);
    public static TempDataType<String> STRING_DATA = new TempDataType<>("any_key_3", String.class);
    public static TempDataType<String> NOT_PRESENT_DATA = new TempDataType<>("any_key_4", String.class);
    public static TempDataType<ArrayList> ARR_DATA = new TempDataType<>("just for example", ArrayList.class);

    private String key;
    private Class<T> clazz;

    private TempDataType(String key, Class<T> clazz) {
        this.key = key;
        this.clazz = clazz;
    }

}
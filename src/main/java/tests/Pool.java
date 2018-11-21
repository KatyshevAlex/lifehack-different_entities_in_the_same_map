package tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Pool {
        private final static Map<String, Object> temporaryData = new HashMap<>();

        static  <T> void put(TempDataType<T> tempData, T value) {
            temporaryData.put(tempData.getKey(), value);
        }

        static  <T> Optional<T> get(TempDataType<T> tempData) {
            Object o = temporaryData.get(tempData.getKey());
            return Optional.ofNullable(tempData.getClazz().cast(o));
        }

        static  <T> T get(TempDataType<T> tempData, T defaultVal) {
            return get(tempData).orElse(defaultVal);
        }
}



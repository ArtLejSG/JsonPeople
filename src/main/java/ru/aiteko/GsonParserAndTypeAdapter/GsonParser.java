package ru.aiteko.GsonParserAndTypeAdapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.aiteko.users.Root;

import java.io.FileReader;
import java.time.LocalDateTime;

public class GsonParser {
    private static final Gson gson = getGsonParser();

    private static final String PATH_TO_JSON_FILE = "src\\main\\resources\\data.json";

    private static Gson getGsonParser() {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
                .create();
    }
    public static Root parse(){
        try(FileReader reader = new FileReader(PATH_TO_JSON_FILE)) {
            return gson.fromJson(reader,Root.class);
        } catch (Exception e) {
            System.out.println("Parsing Error " + e);
            return null;
        }
    }
}
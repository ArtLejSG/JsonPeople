package ru.aiteko.GsonParserAndTypeAdapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {  //форматтер чтобы преобразовывать
    // LocalDateTime в строку и обратно
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    @Override
    public void write (JsonWriter out, LocalDateTime result) throws IOException {
        out.value(result == null ? null : result.format(formatter));
    }

    @Override
    public LocalDateTime read (JsonReader in) throws IOException {
        String strDate= in.nextString();
        return LocalDateTime.parse (strDate, formatter);
    }
}

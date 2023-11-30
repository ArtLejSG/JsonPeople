//package ru.aiteko.users;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import java.util.Objects;
//import  com.google.gson.Gson;
//import java.util.Map;
//@Data
//@AllArgsConstructor
//public class Coordinates {
//    private double latitude;
//    private double longtitude;
//}
//    private Double latitude;
//    private Double longitude;
//
//   public Coordinates(Double latitude, Double longitude){
//       this.latitude = latitude;
//       this.longitude = longitude;
//   }
//
//    public static void main(String[] args) {
//    String jsonDouble = "{\"coordinates\": {\"latitude\": -39.0855, \"longtitude\": -36.2158}}";
//    Gson gson = new Gson();
//    Map<String, Map<String, Double>> data = gson.fromJson(jsonDouble, Map.class);
//    Map<String, Double> coordinatesData = data.get("coordinates");
//    Coordinates coordinates = new Coordinates(coordinatesData.get("latitude"), coordinatesData.get("longtitude"));
//        System.out.println(coordinates.getLatitude());   // Giles
//        System.out.println(coordinates.getLongtitude());  // Brooklyn
//    }
//
//    public Double getLatitude() {
//        return latitude;
//    }
//
//    public Double getLongtitude() {
//        return longitude;
//    }
//}
package ru.aiteko.users;

import java.util.Objects;

public record Coordinates(double latitude, double longitude) {
    public Coordinates {
        // Валидация или другая логика конструктора может быть добавлена здесь
        if (latitude < -90 || latitude > 90 || longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Invalid coordinates");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.longitude, longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}


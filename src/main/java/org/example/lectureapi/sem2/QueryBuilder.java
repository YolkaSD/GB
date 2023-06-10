package org.example.lectureapi.sem2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class QueryBuilder {
    public static void main(String[] args)  {
        ObjectMapper objectMapper = new ObjectMapper();
        File query1Path = new File("src/main/resources/query1.json");
        try {
            QueryDTO query = objectMapper.readValue(query1Path, new TypeReference<>() {});
            System.out.println(queryBuilder("select * from students where", query));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String queryBuilder(String query, QueryDTO queryDTO) {
        StringBuilder stringBuilder = new StringBuilder(query);
        if (Objects.nonNull(queryDTO.getName())) {
            stringBuilder.append(" name=").append(queryDTO.getName()).append(" AND");
        }
        if (Objects.nonNull(queryDTO.getAge())) {
            stringBuilder.append(" age=").append(queryDTO.getAge()).append(" AND");
        }
        if (Objects.nonNull(queryDTO.getCountry())) {
            stringBuilder.append(" country=").append(queryDTO.getCountry()).append(" AND");
        }
        if (Objects.nonNull(queryDTO.getCity())) {
            stringBuilder.append(" city=").append(queryDTO.getCity()).append(" AND");
        }

        if (stringBuilder.toString().endsWith("AND")) {
            stringBuilder.replace(stringBuilder.length() - 4, stringBuilder.length(), ";");
            return stringBuilder.toString();
        } else {
            return null;
        }
    }
}

class QueryDTO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("age")
    private String age;

    public QueryDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

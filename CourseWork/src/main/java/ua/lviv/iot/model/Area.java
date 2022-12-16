package ua.lviv.iot.model;
import lombok.Data;

@Data
public class Area {
    private Integer id;
    private Integer humidity;
    private Integer lighting;
    private String location;

    public Area( Integer humidity, Integer lighting, String location) {
       this.humidity = humidity;
       this.lighting = lighting;
       this.location = location;
    }

    public static String getHeader(){
        return ( "id, humidity, lighting, location\n");
    }
    public String toCSV(){
        return String.format("%s, %s %s %s \n", id, humidity, lighting, location);
    }

}

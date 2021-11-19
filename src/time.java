package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {
        // LocalTime time = LocalTime.now();  
        // System.out.println(time); 
        LocalDateTime now = LocalDateTime.now();  
        // System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println(formatDateTime); 
    }
}

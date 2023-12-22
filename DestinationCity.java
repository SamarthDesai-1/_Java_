import java.util.*;

public class DestinationCity {

    public static String destCity(String[][] map) {
        Set<String> oc = new HashSet<>();
        Set<String> dc = new HashSet<>();

        for (String[] path : map) {
            oc.add(path[0]);
            dc.add(path[1]);
            System.out.println();
            for (String element : path) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        for (String cities : dc) {
            if (!oc.contains(cities)) return cities;
        }

        return "";
    }
    public static void main(String[] args) {
        String[][] map = {
            { "B", "C" },
            { "D", "B" },
            { "C", "A" }
        };

        String destinationCity = destCity(map);
        System.out.println("Destination City is : " + destinationCity);

    }
}
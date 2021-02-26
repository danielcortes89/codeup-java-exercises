package playground;

import java.util.ArrayList;
import java.util.List;

public class Sandbox {
    public static void main(String[] args) {
        Kiddo jimmy = new Kiddo("jimmy");
        Kiddo becky = new Kiddo("becky");

        becky.setBully(true);
        jimmy.setBully(false);
        List<Kiddo> group = new ArrayList<>();

        group.add(jimmy);
        group.add(becky);

        System.out.println(clearBullies(group));

    }

    public static List clearBullies(List<Kiddo> kids){
        List<Kiddo> cleaned = new ArrayList<>();

        for(Kiddo kid : kids){
            if(kid.getBully() == true) {
                continue;
            }
            cleaned.add(kid);
        }

        for(Kiddo kid : cleaned){
            System.out.println(kid.getName());
        }

        return cleaned;
    }
}

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destinCity(List<List<String>> paths) {
        Set<String> sources = new HashSet<>();

        for (List<String> path : paths) {
            sources.add(path.get(0));
        }

        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!sources.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}

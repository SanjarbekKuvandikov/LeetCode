
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int[] location = new int[2];
        set.add(Arrays.toString(location));
        for (char c : path.toCharArray()){
            if (c == 'N') location[0]++;
            if (c == 'S') location[0]--;
            if (c == 'E') location[1]++;
            if (c == 'W') location[1]--;

            if (!set.add(Arrays.toString(location))) return true;
        }
        return false;
    }
}

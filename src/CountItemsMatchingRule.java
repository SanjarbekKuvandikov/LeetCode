import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex;
        if (ruleKey.equals("type")) {
            ruleIndex = 0;
        } else if (ruleKey.equals("color")) {
            ruleIndex = 1;
        } else {
            ruleIndex = 2;
        }

        int count  = 0;
        for (List<String> item : items){
            if (item.get(ruleIndex).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}

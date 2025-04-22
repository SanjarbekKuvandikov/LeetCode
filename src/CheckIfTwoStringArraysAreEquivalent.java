
public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String resultOne = String.join("", word1);
        String resultTwo = String.join("",word2);

        return resultTwo.equals(resultOne);
    }
}

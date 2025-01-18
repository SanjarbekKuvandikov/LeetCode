public class ValidWord {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        // Check  vowel
        boolean hasVowels = word.chars().anyMatch(c -> "AEIOUaeiou".indexOf(c) >= 0);

        // Check consonant
        boolean hasConsonants = word.chars().anyMatch(c -> Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1);

        // Check if the word contains only valid characters (letters and digits)
        boolean onlyValidChars = word.chars().allMatch(Character::isLetterOrDigit);

        return hasVowels && hasConsonants && onlyValidChars;
    }

}

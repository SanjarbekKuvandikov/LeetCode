public class ExceelNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length()-1;
        for (int i=0; i<columnTitle.length(); i++) {
            char x = columnTitle.charAt(i);
            int number = value(x);
            result += number * (int)Math.pow(26,length);
            length--;
        }
        return result;
    }
    int value(char excel){
        if (excel == 'A') return 1;
        if (excel == 'B') return 2;
        if (excel == 'C') return 3;
        if (excel == 'D') return 4;
        if (excel == 'E') return 5;
        if (excel == 'F') return 6;
        if (excel == 'G') return 7;
        if (excel == 'H') return 8;
        if (excel == 'I') return 9;
        if (excel == 'J') return 10;
        if (excel == 'K') return 11;
        if (excel == 'L') return 12;
        if (excel == 'M') return 13;
        if (excel == 'N') return 14;
        if (excel == 'O') return 15;
        if (excel == 'P') return 16;
        if (excel == 'Q') return 17;
        if (excel == 'R') return 18;
        if (excel == 'S') return 19;
        if (excel == 'T') return 20;
        if (excel == 'U') return 21;
        if (excel == 'V') return 22;
        if (excel == 'W') return 23;
        if (excel == 'X') return 24;
        if (excel == 'Y') return 25;
        if (excel == 'Z') return 26;
        return -1;
    }
}

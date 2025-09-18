public class MinimumRecolorsGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int count = Integer.MAX_VALUE;
        int last = k,first = 0;
        while (last <= blocks.length()){
            count = Math.min(count,counter(blocks.substring(first,last)));
            last++;
            first++;
        }
        return count;
    }
    private int counter(String str){
        int count = 0;
        for (char c : str.toCharArray()){
            if (c == 'W') count++;
        }
        return count;
    }
}

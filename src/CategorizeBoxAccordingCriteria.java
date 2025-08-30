public class CategorizeBoxAccordingCriteria {
    public String categorizeBox(int length, int width, int height, int mass) {
        if (isBulky(length,width,height) && isHeavy(mass)) return "Both";
        else if (isBulky(length,width,height) && !isHeavy(mass)) return "Builky";
        else if (!isBulky(length,width,height) && isHeavy(mass)) return "Heavy";

        return "Neither";
    }
    private boolean isBulky(int length, int width, int height){
        long volume = 1L * length * width * height;
        if (length >= 10_000 || width >= 10_000 || height >= 10_000) return true;
        if (volume >= 1_000_000_000) return true;
        return false;
    }
    private boolean isHeavy(int mass){
        return mass >= 100;
    }
}

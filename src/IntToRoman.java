public class IntToRoman {
    int intResult;
    String romanResult;

    String [] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public String getRomanResult() {
        romanResult = hundreds[(intResult%1000)/100] + tens[(intResult%100)/10] + units[intResult%10];
        return romanResult;
    }
}
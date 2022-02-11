public class RomanToInt {
    String romanNum1, romanNum2;
    int intNum1, intNum2;
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    int getIntNum1() {
        for (int i = 1; i <= 10; i++) {
            if (romanNum1.equals(units[i])) {
                intNum1 = i;
                break;
            }
        }
        return intNum1;
    }
    int getIntNum2() {
        for (int i = 1; i <= 10; i++) {
            if (romanNum2.equals(units[i])) {
                intNum2 = i;
                break;
            }
        }
        return intNum2;
    }
}
public class MyException {
    String str;
    String regexArab = "^([1-9]|10)\\s[+*/-]\\s([1-9]|10)$";
    String regexRoman = "^(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s[+*/-]\\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$";
    void checkingExceptions() throws Exception {
        if (str.matches(regexArab)) {
         //   System.out.println("Всё ОК, это арабские");
        } else if (str.matches(regexRoman)) {
         //   System.out.println("Всё ОК, это римские");
        } else {
            System.err.println("Некорректный ввод");
            throw new Exception();
        }
    }
}
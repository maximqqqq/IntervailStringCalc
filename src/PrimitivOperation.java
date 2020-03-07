public class PrimitivOperation {
    private char[] aChar;
    private String[] strings;
    private char op;
    private double a;
    private double b;
    private double result;

    WraiterClass wraiterClass = new WraiterClass();

    public void cheked() {
        if (ReaderClass.list.isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            System.out.println("PrimitivOperation");
            for (String s : ReaderClass.list
            ) {
                System.out.println(s);
            }
        }
    }

    public void calculate() {
        strings = new String[ReaderClass.list.size()];
        strings = ReaderClass.list.toArray(strings);

        System.out.println("Calculate");
        for (int i = 0; i < strings.length; i++) {
            aChar = strings[i].toCharArray();
            for (int j = 0; j < aChar.length; j++) {
                if (aChar[j] == '+') {
                    op = aChar[j];
                    a = Character.getNumericValue(aChar[j - 1]);
                    b = Character.getNumericValue(aChar[j + 1]);
                    result = a + b;
                    wraiterClass.metodWrirer(a, b, op, result);
                    System.out.println(a + "" + op + "" + b + "=" + result);
                }
                if (aChar[j] == '-') {
                    op = aChar[j];
                    a = Character.getNumericValue(aChar[j - 1]);
                    b = Character.getNumericValue(aChar[j + 1]);
                    result = a - b;
                    wraiterClass.metodWrirer(a, b, op, result);
                    System.out.println(a + "" + op + "" + b + "=" + result);
                }
                if (aChar[j] == '*') {
                    op = aChar[j];
                    a = Character.getNumericValue(aChar[j - 1]);
                    b = Character.getNumericValue(aChar[j + 1]);
                    result = a * b;
                    wraiterClass.metodWrirer(a, b, op, result);
                    System.out.println(a + "" + op + "" + b + "=" + result);
                }
                if (aChar[j] == '/') {
                    op = aChar[j];
                    a = Character.getNumericValue(aChar[j - 1]);
                    b = Character.getNumericValue(aChar[j + 1]);
                    result = a / b;
                    wraiterClass.metodWrirer(a, b, op, result);
                    System.out.println(a + "" + op + "" + b + "=" + result);

                }
                if (aChar[j] == '^') {
                    op = aChar[j];
                    a = Character.getNumericValue(aChar[j - 1]);
                    b = Character.getNumericValue(aChar[j + 1]);
                    result = Math.pow(a, b);
                    wraiterClass.metodWrirer(a, b, op, result);
                    System.out.println(a + "" + op + "" + b + "=" + result);
                }
            }
        }


    }
}


public class Arab {
    int result;
    void arab(int a, String b, int c){
        switch (b) {
            case "+" -> result = a + c;
            case "-" -> result = a - c;
            case "/" -> result = a / c;
            case "*" -> result = a * c;
            default -> throw new RuntimeException();
        }
        System.out.println(result);
    }

}

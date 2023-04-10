public class Rim {

    private final String[]sym = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
            "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII"};
    int result;
    int firstRim;
    int secondRim;
    String finalResult;
    void rim(String a,String b, String c){
        for(int i = 0; i < sym.length; i++){
            if(a.equals(sym[i])){
                firstRim = i;
            }
            if (c.equals(sym[i])){
                secondRim = i;
            }
        }

        switch (b) {
            case "+" -> result = firstRim + secondRim;
            case "-" -> result = firstRim - secondRim;
            case "/" -> result = firstRim / secondRim;
            case "*" -> result = firstRim * secondRim;
            default -> throw new RuntimeException();
        }

        for(int i = 0; i < sym.length; i++){
            if(result == i){
                finalResult = sym[i];
                System.out.println(finalResult);
            }
        }if (result <= 0){
            throw new RuntimeException();
        }
    }
}

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        StringBuilder firstInt = new StringBuilder();
        String log = "";
        StringBuilder secondInt = new StringBuilder();
        int g = 0;
        int finalFirstInt = 0;
        int finalSecondInt = 0;

        boolean first = false;
        boolean second = false;

        Scanner sc = new Scanner(System.in);



        String firstPart = sc.nextLine();

        for(int i = 0; i != firstPart.length(); i+=1){
            if(firstPart.charAt(i)!=(' ')){
                firstInt.append(firstPart.charAt(i));
            } else if (firstPart.charAt(i)==(' ')) {
                log += firstPart.charAt(++i);
                g = i+2;
                break;
            }
        }


        for(int i = g; i != firstPart.length(); i+=1){
            secondInt.append(firstPart.charAt(i));
        }

        if (firstInt.length()>10 || secondInt.length()>10){
            System.exit(0);
        }


        try{
            finalFirstInt = Integer.parseInt(firstInt.toString());
            first = true;
        }catch(Exception ignored){}
        try{
            finalSecondInt = Integer.parseInt(secondInt.toString());
            second = true;
        }catch(Exception ignored){}


        if(first != second){
            throw new RuntimeException();
        }


        if((first && second) == true) {
            Arab arab = new Arab();
            arab.arab(finalFirstInt, log, finalSecondInt);
        }


        if((first && second) == false){
            Rim rim = new Rim();
            rim.rim(firstInt.toString(), log, secondInt.toString());
        }

    }
}
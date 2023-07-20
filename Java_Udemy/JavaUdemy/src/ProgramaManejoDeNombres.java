import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] familyMembers = new String[3];
        for(int i = 0; i < 3; i++){
            familyMembers[i] = scan.nextLine();
        }
        scan.close();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < familyMembers.length; i++){
            String secondLetterUpper = Character.toString(familyMembers[i].charAt(1)).toUpperCase();
            result.append(secondLetterUpper).append(".").append(familyMembers[i].substring(familyMembers[i].length()-2));
            if(i < familyMembers.length-1){
                result.append("_");
            }
        }

        System.out.println(result.toString());
    }
}

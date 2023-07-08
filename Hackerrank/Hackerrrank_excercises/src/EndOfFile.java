import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte countLines = 0;
        while (scanner.hasNext()) {
            String currentLine = scanner.nextLine();
            if(!currentLine.equals("end")){
                countLines++;
                System.out.println(countLines + " " + currentLine);
            }
            else{
                break;
            }
        }
    }
}

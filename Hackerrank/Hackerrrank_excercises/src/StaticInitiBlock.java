import java.sql.SQLOutput;
import java.util.Scanner;

public class StaticInitiBlock {

    public static void main(String[] args) {
    }

    static {
        Scanner scan = new Scanner(System.in);
        byte B = scan.nextByte();
        byte H = scan.nextByte();

        try{
            if(H <= 0 || B <= 0){
                throw new Exception("Breadth and height must be positive");
            }else{
                System.out.println(B*H);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally{
            scan.close();
        }
    }


}

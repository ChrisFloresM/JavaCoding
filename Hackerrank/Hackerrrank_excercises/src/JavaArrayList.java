import java.util.ArrayList;


/*This excercise is not finished yet*/
public class JavaArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(3);

        for(int i = 0; i < 5; i++)
        {
            myArrayList.add(i);
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println(myArrayList.get(i));
        }
    }
}

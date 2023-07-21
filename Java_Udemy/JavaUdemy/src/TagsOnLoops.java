public class TagsOnLoops {

    public static void main(String[] args) {

        String frase = "parangaricutirimicuaro";
        int count = 0;

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != 'a') {
                continue;
            }
            count++;
        }

    }
}

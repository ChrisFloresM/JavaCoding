public class StringExtension {
    public static void main(String[] args) {
        String fileName = "File.pdf";
        int dotIndex = fileName.lastIndexOf(".");

        System.out.println("La extension del archivo es: \n" + fileName.substring(dotIndex+1));
    }
}

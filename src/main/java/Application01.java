public class Application01 {

    public static void main(String[] args) {

        String string = "Java,Python,C++,JavaScript";

        String[] string1 = string.split(",");

        for (int i = 0; i < string1.length; i++) {
            if (string1[i].equals("Python")) {
                System.out.println("Python이 포함되어 있습니다.");
            }

        }
    }
}
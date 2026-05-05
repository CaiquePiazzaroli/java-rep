public class Main {
    public static void main(String[] args) {
        
        long time = System.currentTimeMillis();
        StringBuilder myText = new StringBuilder("");
        for (int i = 0; i < 1000000; i++) {
            myText = myText.append(" - outra String ");
        }
        long timeTwo = System.currentTimeMillis();

        System.out.println("Tempo de ex: " + (timeTwo - time) + "ms");

    }
}

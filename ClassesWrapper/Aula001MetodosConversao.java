package ClassesWrapper;

public class Aula001MetodosConversao {
    public static void main(String[] args) {
        

        // Métodos que convertem os tipos String em primitivos
        byte byteWrapper = Byte.parseByte("120");
        short shortWrapper = Short.parseShort("1000");
        int inteiroWrapper = Integer.parseInt("10");
        long logWrapper = Long.parseLong("4654498798L");
        float floatWrapper = Float.parseFloat("10.99f");
        double doubleWrapper = Double.parseDouble("10.97");
        boolean booleanWrapper = Boolean.parseBoolean("true");


    }
}

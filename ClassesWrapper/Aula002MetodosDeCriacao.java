package ClassesWrapper;

public class Aula002MetodosDeCriacao {
    public static void main(String[] args) {
        
        // Instanciando um Byte
        Byte numero1string = Byte.valueOf("100");
        Byte numero1byte = Byte.valueOf((byte)87);

        // Instanciando um Short
        Short numero2String = Short.valueOf("4500");
        Short numero2Short = Short.valueOf((short) 4500);

        // Instanciando um Integer
        Integer numero3String = Integer.valueOf("121564");
        Integer numero3int = Integer.valueOf(121564);

        // Instanciando um Long
        Long numero4String = Long.valueOf("100000L");
        Long numero4long = Long.valueOf(100000L);

        // Instanciando um Float
        Float numero5String = Float.valueOf("4.4");
        Float numero5float = Float.valueOf((float) 4.4);

        // Instanciando um Double
        Double numero6String = Double.valueOf("5.5");
        Double numero6float = Double.valueOf(5.5);

        // Instanciando um Boolean
        Boolean boleanString = Boolean.valueOf("false");
        Boolean boleanDeBoolean = Boolean.valueOf(false);

        // Instanciando um Character
        Character character1String = Character.valueOf('c');
    }
}

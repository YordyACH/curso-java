
public class StringPool {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = new String(("Hola"));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}


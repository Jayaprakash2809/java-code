public class buff {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("jai");
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.append("studend");
        System.out.println(s.capacity());
        System.out.println(s.length());
    }
}

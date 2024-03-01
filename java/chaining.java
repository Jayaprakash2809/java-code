public class chaining {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("Jai");
        System.out.println(s.append("prakash").reverse().length());
        System.out.println(s);
    }
}

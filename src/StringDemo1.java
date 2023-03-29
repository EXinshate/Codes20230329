public class StringDemo1  {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        sb.reverse();

        int len = sb.length();
        System.out.println(sb);
    }
}

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sonam");
        sb.append("kumari");
        System.out.println(sb.capacity());
        sb.deleteCharAt(5);
        sb.insert(6, "java");
        System.out.println(sb);
    }
    
}

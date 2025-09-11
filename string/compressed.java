public class compressed {
    public static String printCompressed(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer flag = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                flag++;
                i++;
            }
            sb.append(str.charAt(i));
            if (flag > 1) {
                sb.append(flag);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(printCompressed(str));
    }
}

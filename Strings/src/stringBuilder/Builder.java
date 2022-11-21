package stringBuilder;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < 26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        // builder.reverse();
        // System.out.println(builder.lastIndexOf("d"));
        // System.out.println(builder.indexOf("g"));
        System.out.println(builder.toString());
    }
}

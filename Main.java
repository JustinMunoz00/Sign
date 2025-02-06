public class Main{
    public static void main(String[] args) {
        String str; 
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines();
        System.out.println(x);
        str = sign1.getLines();
        System.out.println(str);
    }
}
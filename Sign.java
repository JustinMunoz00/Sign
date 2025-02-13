public class Sign {
    private String message;
    private int width; 
    public Sign(String m, int w){
        message = m;
        width = w;
    }
    public int numberOfLines(){
        int lines = 0;
        lines += message.length()/width;
        if (message.length() % width > 0) lines++;
        return lines;
    }
    public String getLines(){
        int lines = numberOfLines();
        if (message.equals("")) return null;
        String s = message;
        for (int i = 1; i < lines; i++){
            s = s.substring(0, i*width+i-1) + ";" + s.substring(i*width+i-1);
        }
        return s;
    }
}
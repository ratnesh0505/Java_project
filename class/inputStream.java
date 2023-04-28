import java.io.FileInputStream;
public class inputStream {
    public static void main(String[]args){
        try{
            FileInputStream fin=new FileInputStream("D://abc.txt.txt");
            int i= fin.read();
            System.out.println((char)i);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
    }
    
}
}

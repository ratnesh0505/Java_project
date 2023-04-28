import java.io.FileOutputStream;
public class DataStream {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("D://abc.txt.txt");
            String s="Welcome to javaTpoint";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");

            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

import java.util.HashMap;
import java.util.Map;
public class CalculateFreq {
    public static void main(String[]args){
        int arr[]={1,3,4,1,12,3,2,4,5};
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
        for(Integer a:arr){
            if(mp.containsKey(a)){
                mp.put(a,mp.get(a)+1);
            }else{
                mp.put(a,1);
            }
        }for(Integer i:arr){
            System.out.println(i+" ");
        }
        System.out.println();
        System.out.println("Enter the element to find the frequency: ");
        int key=Integer.parseInt(System.console().readLine());
        if(mp.containsKey(key)){
            System.out.println("Frequency of "+key+" is "+mp.get(key));
        }else{
            System.out.println("Element not found");
        }
    }
    
}

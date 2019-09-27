
public class GenerateExceptions {
    public static void main(String[] args) {
        try{
            int[] n=new int[-10];
        }
        catch(NegativeArraySizeException nas){
            nas.printStackTrace();
        }
        try{
            int[] n=new int[5];
            n[5]=100;
        }
        catch(IndexOutOfBoundsException iob){
            iob.printStackTrace();
        }
        try{
            String str=null;
            str.split(" ");
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}

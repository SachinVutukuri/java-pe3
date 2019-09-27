public class excep {
    public static void main(String[] args) {
        try{
            throw new Exception("demo");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.print("Inside finally");
        }
    }

}

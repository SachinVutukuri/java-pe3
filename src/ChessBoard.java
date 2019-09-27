public class ChessBoard {
    public static void main(String[] args) {
        System.out.println("My Chess Board:");
        for(int i=0;i<8;i++)
        {
            System.out.print("\t");
            for(int j=0;j<8;j++)
            {
                if((i+j)%2==0)
                    System.out.print("WW|");
                else
                    System.out.print("BB|");
            }
            System.out.println("");
        }
    }
}

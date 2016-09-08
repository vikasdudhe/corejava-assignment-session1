
		
public class AsciiProg
{
    public static void main(String args[])
    {
	
        String ch;
        int i;
        for(i=65; i<=90; i++)
        {
            ch = new Character((char)i).toString(); // method to print character for equivalent number
            System.out.print(i+ " -- " + ch + "\n");
        }
		
    }
}
public class Tree
{
	public static void main(String[] args) 
	{
		int height = Integer.parseInt(args[0]);
		String s = "*";
		for (int i = 1; i <= height; i++) {
			System.out.println(s);
			s = s + " *";
			
		}
	}
}
package assignment1;

public class Q1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==1 || i==3 || j==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}

	}

}

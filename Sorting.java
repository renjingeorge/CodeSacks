import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		String str = null;
		try{
			int n = Integer.parseInt(scanner.nextLine());
			Set<String> wordSet = new TreeSet<String>();
			
			if((n > 0)&& (n<5000)){
				while (i<n){
					str = scanner.nextLine();
					if(str.length()>100){
						throw new IllegalArgumentException("INVALID");
					}
					wordSet.add(str);	
					i++;
				}
			}
			else{
				throw new IllegalArgumentException("INVALID");
			}
			System.out.println("\nOutput\n-------------------\n");
			for(String res : wordSet){
				System.out.println(res);
			}
		}
		catch(Exception ex){
			if(ex.getMessage().equalsIgnoreCase("INVALID")){
				System.out.println("Invalid Input");
			}
			else{
				System.out.println("General Error");
			}
		}
	}

}

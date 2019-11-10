import java.util.Scanner;

public class QuestionsClient {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter your name to begin...");
		player p=new player(scn.next());
		System.out.println("welcome to this game"+p.getName());
		System.out.println("get ready to begin...");
	}

}

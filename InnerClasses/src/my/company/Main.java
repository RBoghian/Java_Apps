package my.company;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);
public static Button button = new Button("Print");
    public static void main(String[] args) {
//class ClickListener implements Button.OnClickListener{
//	public ClickListener(){
//		System.out.println("I ve been attached");
//	}
//
//	@Override
//	public void onClick(String title) {
//		System.out.println(title +" was clicked.");
//	}
//}
//button.setOnClickListener(new ClickListener());
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(String title) {
				System.out.println(title +" was cliiicked");
			}
		});
listen();
    }
    private static void listen(){
    	boolean quit = false;
    	while(!quit){
    		int choice = scanner.nextInt();
    		scanner.nextLine();
    		switch (choice){
				case 0:
					quit=true;
					break;
				case 1:
					button.onCLick();
			}
		}
	}
}

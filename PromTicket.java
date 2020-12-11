import java.util.Scanner;

public class PromTicket {
	private String name = "";
	private String gradeClass = "";
	private int guestCount = 0;
	private String type = "";
	private String amountDue = "";
	private double payment = 0;
	
	public PromTicket() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the students name?");
		name = keyboard.nextLine();
		System.out.println("What is their grade classification?");
		gradeClass = keyboard.nextLine();
		gradeClass = gradeClass.toLowerCase();
		System.out.println("What is the number of guests for the ticket?");
	    guestCount = keyboard.nextInt();
	    System.out.println("The student is ordering a " + ticketType() + " ticket.");
	    System.out.println("The student owes $" + ticketPrice());
	    System.out.println("How much is the student paying?");
	    payment = keyboard.nextDouble();
	    System.out.println("You owe the student $" + transaction() + " in change.");
	    keyboard.close();
	}
	
	public String ticketType() {
		if(guestCount == 1) {
			type = "solo";
		}
		
		else if(guestCount == 2) {
			type = "couples";
		}
		
		else if(guestCount == 3 || guestCount == 4) {
			type = "group";
		}
		
        return type;
	}
	
	public String ticketPrice() {
		if(type.equals("solo") && gradeClass.equals("freshman")) {
			amountDue = "65.00";
		}
		
		else if(type.equals("couples") && gradeClass.equals("freshman")) {
			amountDue = "98.00";
		}
		
		else if(type.equals("group") && gradeClass.equals("freshman")) {
			amountDue = "163.00";
		}
		
		else if(type.equals("solo") && gradeClass.equals("sophomore")) {
			amountDue = "55.00";
		}
		
		else if(type.equals("couples") && gradeClass.equals("sophomore")) {
			amountDue = "83.00";
		}
		
		else if(type.equals("group") && gradeClass.equals("sophomore")) {
			amountDue = "138.00";
		}
		
		else if(type.equals("solo") && gradeClass.equals("junior")) {
			amountDue = "45.00";
		}
		
		else if(type.equals("couples") && gradeClass.equals("junior")) {
			amountDue = "68.00";
		}
		
		else if(type.equals("group") && gradeClass.equals("junior")) {
			amountDue = "113.00";
		}
		
		else if(type.equals("solo") && gradeClass.equals("senior")) {
			amountDue = "40.00";
		}
		
		else if(type.equals("couples") && gradeClass.equals("senior")) {
			amountDue = "60.00";
		}
		
		else if(type.equals("group") && gradeClass.equals("senior")) {
			amountDue = "100.00";
		}
		
		return amountDue;
	}
	
	public double transaction () {
		double price = Double.parseDouble(amountDue);
		double amountPaid = payment;
		double transaction = price - amountPaid;
		double changeDue = transaction * -1;
		
		return changeDue;
	}
	
	public String confirmation() {
		int count = 0;
		int rand = 0;
		String confirmation = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		while(count < 6) {
			rand = (int) (Math.random() * characters.length());
			confirmation += characters.substring(rand, rand + 1);
			count ++;
		}
		System.out.println(name + " purchased a " + gradeClass + " " + ticketType() + " ticket for $" + ticketPrice() + ". the confirmation number for this sale is " + confirmation + "."); 
		return confirmation;
	}

}

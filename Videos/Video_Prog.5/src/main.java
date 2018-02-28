
public class main {

	public static void main(String[] args) {
		boolean hungry = true;
		
		if(hungry) {
			System.out.println("I'm Starving:");
		}else {
			System.out.println("I'm not Hungry:");
		}
		int HGrating = 5;
		if(!(HGrating != 6)) {
			System.out.println("Not Hungry:");
		}else {
			System.out.println("I'm Starving:");
		}
		int favoriteTemp = 75;
		int currentTemp = 100;
		String opinion;
		
		if(favoriteTemp == currentTemp) {
		if (currentTemp <= favoriteTemp - 30) {
			opinion = "It's Pretty Cold...";
		} else if(currentTemp < favoriteTemp - 20) {
			opinion = "It's kinda cold out...";
		}else if(currentTemp >= favoriteTemp +10) {
			opinion = "It's hot Out...";
		}else {
			opinion = "It's a beautiful day...";
		}
		}else {
			opinion = "Unknowm temp";
		}
		System.out.println(opinion);
		
		int month = 4;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
		break;
		case 2: monthString = "February";
		break;
		case 3: monthString = "March";
		break;
		case 4: monthString = "April";
		break;
		default: monthString = "Unknown Month";
		break;
		}
		System.out.print(monthString);
	}

}

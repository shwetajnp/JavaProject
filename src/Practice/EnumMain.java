package Practice;

public class EnumMain {	
	public static void main(String[] args){
		
		EnumDay day= EnumDay.WEDNESDAY;
		switch(day) {
		case SUNDAY: System.out.println("SUNDAY");
		break;
		case MONDAY: System.out.println("Monday");
		break;
		case TUESDAY: System.out.println("TUESDAY");
		break;
		case WEDNESDAY: System.out.println("WEDNESDAY");
		break;
		case THURSDAY: System.out.println("THURSDAY");
		break;
		case FRIDAY: System.out.println("FRIDAY");
		break;
		case SATURDAY: System.out.println("SATURDAY");
		break;
		}
	}
		
}




package chap_4;

public class P106 {

	public static void main(String[] args) {
		
		int floor = 1;
		char name=0;
		
		switch(floor) {
		case 1 : name = 'P';
		break;
		
		case 2 : name ='S';
		break;
		
		case 3 : name = 'F';
		break;
		
		case 4 : name = 'T';
		break;
		
		case 5 : name = 'H';
		break;
		
		}
		System.out.println(floor +"층은"+  name + "입니다.");
	}

}

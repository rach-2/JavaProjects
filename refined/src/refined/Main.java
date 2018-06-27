package refined;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int place;
		
		
	try {
		
		 place = in.nextInt();
		 int startpoint;
			
			if(place==1) {
				startpoint = 2;
			} else {
				startpoint = 1;
			}
			Main m = new Main();
			ArrayList<String> res;
			res = m.calculate(place,startpoint);
			
			for(String s: res) {
				
				System.out.println(s);
			}
			
			break;
	} catch(InputMismatchException m) {
		System.out.println("Must be an integer");
	}
	
		
		/////


	}
	
	
	private  ArrayList<String> calculate(int place, int startpoint){
		ArrayList<String> results = new ArrayList<>();
		for(int i = startpoint;i<=100;i++) {
			if(i == place) {
				
				continue;
			} else {
				String conv;
				conv = Integer.toString(i);
		
				if(conv.length() ==1) {
					int rev = Integer.parseInt(conv);
					switch(rev) {
					
					case 1:
						results.add(rev + "st");
						
						
					break;
					
					case 2:
				
						results.add(rev + "nd");
						break;
						
					case 3: 
						results.add(rev + "rd");
						break;
						
						default:
							results.add(rev + "th");
							
					}
					
					
					
					
				} else if((Integer.parseInt(conv) > 9 && Integer.parseInt(conv) <=20) && (conv.length()==2)) {
					
					int rev = Integer.parseInt(conv);
					results.add(rev + "th");
				
					
					
				} else if((conv.length()==2) && (Integer.parseInt(conv) > 20)) {
					char digit = conv.charAt(1);
					
					
switch(digit) {
					
					case '1':
						
						results.add(conv + "st");
					
						
					break;
					
					case '2':
						results.add(conv + "nd");
					
						break;
						
					case '3': 
						results.add(conv + "rd");
					
						break;
						
						default:
							results.add(conv + "th");
							
					}
					
					
					
				} else if(conv.length()==3) {
					
				
					results.add(conv + "th");
				}
				
			
			}
		}
		
		return results;
		
	}

}
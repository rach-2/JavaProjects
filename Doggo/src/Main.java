import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int place = in.nextInt();
		
		int startpoint;
		
		if(place==1) {
			startpoint = 2;
		} else {
			startpoint = 1;
		}
		
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
						System.out.println(rev + "st");
						
					break;
					
					case 2:
						System.out.println(rev + "nd");
						break;
						
					case 3: 
						System.out.println(rev + "rd");
						break;
						
						default:
							
							System.out.println(rev + "th");
					}
					
					
					
					
				} else if((Integer.parseInt(conv) > 9 && Integer.parseInt(conv) <=20) && (conv.length()==2)) {
					
					int rev = Integer.parseInt(conv);
					System.out.println(rev + "th");
					
					
				} else if((conv.length()==2) && (Integer.parseInt(conv) > 20)) {
					char digit = conv.charAt(1);
					
					
switch(digit) {
					
					case '1':
						System.out.println(conv + "st");
						
					break;
					
					case '2':
						System.out.println(conv + "nd");
						break;
						
					case '3': 
						System.out.println(conv + "rd");
						break;
						
						default:
							
							System.out.println(conv + "th");
					}
					
					
					
				} else if(conv.length()==3) {
					
					System.out.println(conv + "th");
				}
				
			
			}
		}

	}

}

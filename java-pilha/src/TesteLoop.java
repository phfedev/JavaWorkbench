import java.util.ArrayList;

public class TesteLoop {

	public static void main(String[] args) {
		
		loop();

	}
	
	public static void loop() {
		int i = 0;
		String as = "";
		ArrayList<String> ass = new ArrayList<String>();
		for(i=0;i<=10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ass.add("*");
			System.out.println(ass);
		}
		for(i=11; i>=0; i--) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ass.remove(i-1);
			System.out.println(ass);
			if(ass.isEmpty()) {
				loop();
			}
		}
	}

}

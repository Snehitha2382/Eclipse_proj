package basics;
import java.io.*;
public class IOstatements {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte a;
        short b;
        int c;
        long d;
        boolean bool;
        float f;
        double dob;
        char ch;
        System.out.println("Enter vales of byte, short, int, long, boolean, float, double, char : ");
        a = Byte.parseByte(br.readLine());
        b = Short.parseShort(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = Long.parseLong(br.readLine());
        bool = Boolean.parseBoolean(br.readLine());
        f = Float.parseFloat(br.readLine());
        dob = Double.parseDouble(br.readLine());
        ch = (char)(br.read());
        br.readLine();
        System.out.println(a+" "+b+" "+c+" "+d+" "+bool+" "+f+" "+dob+" "+ch);
	}

}

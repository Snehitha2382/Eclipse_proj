package basics;

public class ArgumentsCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=args.length;
        if(count==0)
        	System.out.println("NO value");
        else {
        	for(int i=0;i<count;i++) {
        		if(i<count-1)
        			System.out.println(args[i]+", ");
        		else
        			System.out.println(args[i]);
        	}
        }
	}

}

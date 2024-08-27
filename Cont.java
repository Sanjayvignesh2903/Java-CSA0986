import java.util.Scanner;

class Cont {
  public static void main(String[] args) {
	  int a,b,c,ch;
	  	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter two Numbers: ");
	  	  a = s.nextInt();
	  b = s.nextInt();
	  do{
	  System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.Exit");
	  System.out.println("ENTER THE CHOICE: ");
		  ch = s.nextInt();
		  switch(ch){
			  case 1:
			  c=a+b;
			  	  System.out.println("Sum: "+c);
				  break;
			  case 2:
			  c=a-b;
			  	  System.out.println("Sub: "+c);
				  break;
		      case 3:
			  c=a*b;
			  	  System.out.println("Product: "+c);
				  break;
			  case 4:
			  c=a/b;
			  	  System.out.println("Division: "+c);
				  break;
			  case 5:
			      System.exit(0);
				  break;
			  default: 
			  System.out.println("Your choice is wrong pls try again ");
			  
		      }
	  }while(ch!=5);
 
		  }
        
		 
}
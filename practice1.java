public class practice1{
	public static void main (String [] args){
		int a=Integer.valueOf(args[0]);
		int b=Integer.valueOf(args[1]);
		
		int summ=a+b; //�����
		int comp=a*b;//������������
		int degree=a/b;//������� 
		int remdev=a%b;//������� �� �������
		
			
		System.out.println("Sum " +summ);
		System.out.println("Comp " +comp);
		System.out.println("Degree " +degree);
		System.out.println("Reminder of devision " +remdev);
		System.out.println("Exponential " +Math.pow(a,b));
	}
}
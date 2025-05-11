
public class TypeConversion {
   public static void main(String[] args) {
	 int a=10;
	 int b=20;
	 long c=30;
	 float d=45.0F;;
	 
	 int r1=a+b;
	 float r2=b+c+d;
	 double r3=b+c+d;  //widening conversion , implicit conversion
	 byte x=100;
	 int y=x;    //widening conversion, implicit conversion
	 short s=(short)c;  //narrow conversion, explicit converisoin.
	 
	 byte b1=100;
	 short s1=200;
	 int s2=b1+s1;
	 
	 float f=a;  //widening conversion
	 f=c;   //widening conversion
	 r3=f;   //widening conversion
	 
	 char ch='A';
	 double r4=ch;
	 System.out.println(r4);
	 
	 int g=(int)(d+3); //narrow converison
	 
}
}

class Number{

public static void main(String args[]){

int price1=23;
int price2=21;
int price3=41;
int price4=42;
int totalprice=0;

System.out.println("sum of four price:"+(price1+price2+price3+price4));
System.out.println("substraction of four price:"+(price1-price2-price3-price4));
System.out.println("multiplication of four price:"+(price1*price2*price3*price4));
System.out.println("division of four price:"+(price1/price2/price3/price4));
System.out.println("mod of four price:"+(price1%price2%price3%price4));
if(price1==price2){
	System.out.println("price is zero");
}else{
	System.out.println("price is not equal to zero");
}
if(price3>=0){
	System.out.println("price3 is greater then or equal to zero");
}else{
	System.out.println("price3 is greater then or not equal to zero");
}
if(price4<=0){
	System.out.println("price4 is less then or equal to zero");
}else{
	System.out.println("price4 is not less then or equal to zero");
}
if(totalprice==price4){
System.out.println("totalprice is equal to price4");}
else{
System.out.println("totalprice is not equal to price4");
}



}
}
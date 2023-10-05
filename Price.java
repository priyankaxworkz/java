class Price{

public static void main(String args[]){

int price1=23;
int price2=34;
int price3=45;
int price4=51;
int price5=56;
int price6=47;
int totalprice=0;

System.out.println("sum of prices:"+(price1+price2+price3+price4+price5+price6));
System.out.println("substraction of prices:"+(price1-price2-price3-price4-price5-price6));
System.out.println("multiplication of prices:"+(price1*price2*price3*price4*price5*price6));
System.out.println("division of prices:"+(price1/price2/price3/price4/price5/price6));
System.out.println("mod of prices:"+(price1%price2%price3%price4%price5%price6));

if(totalprice==price1+price2+price3+price4+price5+price6){
System.out.println("sum is odd");
}else{
	System.out.println("sum is even");
}
if(totalprice>=0){
	System.out.println("price is greater then or equal to zero");
}else{
	System.out.println("price is not greater then or equal to zero");
}
if(totalprice<=0){
	System.out.println("total price is not less then or equal zero");
}else{
	System.out.println("price is less then or equal to zero");
}
if(totalprice==0){
    System.out.println("price is not equal to zero");
}else{
	System.out.println("price is equal to zero");
}
if(23==0){
	System.out.println("division price is compare to mod price");
}else{
	System.out.println("division price is not compare to mod price");
}
}
}
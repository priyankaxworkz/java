class BillRunner{

public static void main(String args[]){

int totalPrice=0;
for(int i=0;i<Bill.price.length;i++){
	System.out.println("price is:"+Bill.price[i]);
	totalPrice=totalPrice+Bill.price[i];
}
System.out.println("totalprice is:"+totalPrice);
}
}
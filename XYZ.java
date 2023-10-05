class XYZ{
public static void main(String args[]){

int[][] price={{23,21,35},{34,45,56}};
int count=0;
int totalPrice=0;
int evenNumber=0;
int oddNumber=0;
for(int i=0;i<price.length;i++){
for(int j=0;j<price[i].length;j++){

System.out.println(price[i][j]);
count++;
totalPrice=totalPrice+price[i][j];
if(price[i][j]%2==0){
	evenNumber++;
}else{oddNumber++;
}

}
}
System.out.println("count is:"+count);
System.out.println("totalPrice:"+totalPrice);
System.out.println(evenNumber);
System.out.println(oddNumber);
}
}
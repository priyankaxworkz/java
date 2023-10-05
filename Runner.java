class Runner{

public static void main(String[] args){

int[][] number={{23,43,45,34},{34,45,67,78},{34,45,21},{34,56,78,23,14}};
int count=0;
int evenNumber=0;
int oddNumber=0;
int totalSum=0;
System.out.println(number.length);

for(int i=0;i<number.length;i++){
for(int j=0;j<number[i].length;j++){

count++;
System.out.println(number[i][j]);
totalSum=totalSum+number[i][j];

if(number[i][j]%2==0){
	evenNumber++;
}else{
	oddNumber++;
}

}
}
System.out.println("element is:"+count);
System.out.println("even number is:"+evenNumber);
System.out.println("odd number is:"+oddNumber);
System.out.println("totalSum:"+totalSum);
}
}

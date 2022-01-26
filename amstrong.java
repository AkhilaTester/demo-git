class amstrong{
public static void main(String args[])
{
int n=371,temp,ncub,sum=0,temp1;
temp=n;
while(temp>0){
	temp1=temp%10;//5
	ncub=temp1*temp1*temp1;//125
	sum=sum+ncub;	//125
	//sum = sum + (temp ^ 3);
	temp=(temp/10);  //13
	//System.out.println(temp);
}
if(n==sum)
{
	System.out.println("Amstrong");
}
else
	{
	System.out.println("Not Amstrong");
}

}

}
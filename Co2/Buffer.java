import java.io.*;
class Largest
{
public static void main(String args[])
{
int n,i,temp=0;
try{
DataInputStream ds=new DataInputStream(System.in);
int arr[]=new int[10];
System.out.println("enter the limit of array...");
n=Integer.parseInt(ds.readLine());
System.out.println("enter the array elements...");
for(i=0;i<n;i++)
{
arr[i]=Integer.parseInt(ds.readLine());
}
System.out.println("Largest element in the array is...");
for(i=0;i<n;i++)
{
if(arr[i]>arr[i+1])
{
temp=arr[i];
}
}
System.out.println(temp);
}catch(Exception e){}
}
}


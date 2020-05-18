#include<iostream>
using namespace std;
int main()
{
int n,rem,sum=0;
  cin>>n;
 int  num=n;
 while(num>0)
 {
   rem=num%10;
  sum+=rem;
  num/=10;
}
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}
#include<iostream>
using namespace std;
int power(int ,int );
int main()
{
  int a,b,c;
  cout<<"Enter the value of a"<<"\n";
  cout<<"Enter the value of n"<<"\n";
  cin>>a>>b;
  c=power(a,b);
  cout<<"The value of "<<a<<" power "<<b<<" is "<<c;
  return 0;
}
int power(int a,int b)
{
  if(b==0)
    return 1;
  else
    return (a*power(a,b-1));
}
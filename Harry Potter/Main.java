#include<iostream>
using namespace std;
int main()
{
  int n,x,i=0,y;
  int n1[10];
  cin>>n;
  while(n!=0)
  {
  x=n%10;
    n1[i]=x;
    i++;
    n/=10;
  }
  y=n1[0]+n1[3];
  cout<<y;
}
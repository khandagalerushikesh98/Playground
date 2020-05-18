#include<iostream>
using namespace std;
int main()
{
  int n,a,i,s;
  cin>>n;
  for( i=1;i<=n;i++)
  {
    a=i*i;
  if(a%2==0)
  {
    cout<<a-2<<" ";
  }
  else
  {
    cout<<a-1<<" ";
    }
  }
  return 0;
}
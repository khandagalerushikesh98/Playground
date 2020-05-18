#include<iostream>
using namespace std;
int main()
{
  int t1=0,t2=1,t3,n;
  cin>>n;
 for(int i=2;i<n;i++)
  {
  t3=t1+t2;
    t1=t2;
    t2=t3;
  }
  cout<<t3;
  return 0;
}
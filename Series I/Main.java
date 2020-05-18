#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
int n,t;
  cin>>n;
  double r=0.5;
  for(int i=0;i<n;i++)
  {
  if(i==0)
  {
    cout<<r<<" ";
  }
    else
    { 
      t=pow(3,i-1);
    double x=t+r;
    r=x;
    cout<<fixed<<setprecision(1)<<x<<" ";
    }
  }
  return 0;
}
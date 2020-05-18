#include<iostream>
using namespace std;
struct Distance
{
  int ft;
  float inch;
}d1,d2,sum;
int main()
{
 cin>>d1.ft>>d1.inch;
  cin>>d2.ft>>d2.inch;
  sum.ft=d1.ft+d2.ft;
  sum.inch=d1.inch+d2.inch;
  if(sum.inch>12.00)
  {
  sum.ft++;
    sum.inch-=12.00;
  }
  cout<<sum.ft<<"\'"<<"-"<<sum.inch<<"\"";
  return 0;
}
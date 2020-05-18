#include<iostream>
using namespace std;
int main()
{
  int m,n,sum=0,attempts=0;
  cin>>m;
  while(sum<m)
  {
  cin>>n;
    sum+=n;
    attempts++;
  }
  cout<<"The number of turns is "<<attempts;
  return 0;
}
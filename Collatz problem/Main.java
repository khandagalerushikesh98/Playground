#include<iostream>
using namespace std;
int main()
{
 int n,x,count=0;
  cin>>n;
  cout<<n<<"\n";
  while(n!=1)
  {
  if(n%2==0)
  { 
    n/=2;
   cout<<n<<"\n";
    count++;
  }
    else
    {
      n=(3*n)+1;
    cout<<n<<'\n';
      count++;
    }
  }
  cout<<count;
  return 0;
}
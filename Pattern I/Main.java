#include <iostream>
using namespace std;
int main()
{
int n,num;
cin>>num;
  n=4;
for(int i=1;i<=n;i++)
{
  for(int j=1;j<=i;j++)
   {
    cout<<num;
    }
num++;
cout<<endl;
  }
num--;
   for(int i=n;i>=1;i--)
    {
     for(int j=1;j<=i;j++)
      {
       cout<<num;
       }
   num--;
   cout<<endl;
    }
return 0;
  }

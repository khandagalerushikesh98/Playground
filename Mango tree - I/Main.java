#include<iostream>
using namespace std;
int main()
{
    int r,c,num,a,b;
    cin>>r>>c>>num;
    b=((r*(c-1))+1);
    
    if(num<=r)
        cout<<"Yes";
    else if(num>=b)
    {
      if(num<=(r*c))
      {
        cout<<"Yes";
      }
    }  
    else if(num%r==1)
    {
        cout<<"Yes";
    }
    else
            {
                cout<<"No";
            }
}

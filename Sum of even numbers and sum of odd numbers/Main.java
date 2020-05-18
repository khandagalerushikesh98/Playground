#include<iostream>
using namespace std;
int main()
{
 int size;
  int odd=0,even=0;
  int i,num[i];
  cin>>size;
  for(i=0;i<size;i++)
  {
  cin>>num[i];
  }
  for(i=0;i<size;i++)
  {
  if(num[i]%2==0)
    even+=num[i];
    else
      odd+=num[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}
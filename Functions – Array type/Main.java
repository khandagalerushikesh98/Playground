#include<iostream>
using namespace std;
int main()
{
  int n,i,even=0,odd=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
  cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
  if(arr[i]%2==0)
    even++;
    if(arr[i]%2==1)
      odd++;
  }
  if(even==n)
    cout<<"The array is Even";
  else if(odd==n)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  return 0;
}
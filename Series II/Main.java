#include<iostream>
int main()
{
int n,a,b,c;
  std::cin>>n;
  a=121;
  b=11;
  if(n==1)
    std::cout<<"121"<<" ";
  else
  {  std::cout<<"121"<<" ";
  for(int i=2;i<=n;i++)
  {
  b+=4;
    c=b*b;
    std::cout<<c<<" ";
  }
  }
  return 0;
}
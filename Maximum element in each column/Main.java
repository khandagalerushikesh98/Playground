#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r>>c;
  int max=0;
  int a[r][c];
  
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>a[i][j];
  
  for(int i=0;i<c;i++)
  {
    max=0;
    for(int j=0;j<r;j++)
    {
      if(a[j][i]>max)
        max=a[j][i];
      else
        max=max;
    }
    std::cout<<max<<"\n";
  }
}
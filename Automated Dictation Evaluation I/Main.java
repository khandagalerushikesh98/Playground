#include<iostream>
#include<cstring>
using namespace std;
int main()
{
char n1[50],n2[50];
 cin.getline(n1,50);
  cin.getline(n2,50);
  int r=strcmp(n1,n2);
  if(r==0)
  cout<<"It is correct";
    else
      cout<<"It is wrong";
}
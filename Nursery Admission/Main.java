#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char name[50];
  int len;
  gets(name);
  len=strlen(name);
  cout<<"The number of letters in the name is "<<len;
}
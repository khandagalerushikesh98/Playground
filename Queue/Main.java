#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c, sum = 0;
  cin>>a>>b;
  for(int i = 0; i < a; i++) {
    cin>>c;
    sum += c;
  }
  int f = (sum % b == 0)? (sum / b): (sum / b + 1);
  if(a == b)
    f += 1;
  cout<<f;
  return 0;
}

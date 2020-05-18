#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b;
  cin>>a>>b;
  int x[a][b];
  for(int i = 0; i < a; i++)
    for(int j = 0; j < b; j++)
      cin>>x[i][j];
  for(int i = 0; i < a; i++) {
    int max = x[i][0];
    for(int j = 0; j < b; j++) {
      if(max < x[i][j])
        max = x[i][j];
    }
    cout<<max<<endl;
  }
  return 0;
}

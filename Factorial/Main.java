#include<iostream>
int factorial(int );
int main()
{
 int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<factorial(n);
  return 0;
}
int factorial(int n)
{
  if(n>1)
    return n*factorial(n-1);
  else
    return 1;
}
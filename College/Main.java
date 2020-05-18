#include<iostream>
#include<string.h>
using namespace std;
struct Student
{
char name[30];
char city[20];
int yr;
float per;
};

int main()
{
struct Student s1[1000];
struct Student t;
int i,j,n;
cout<<"Enter the number of colleges";
cin>>n;
for(i=0;i<n;i++)
  {
cout<<"\nEnter the details of college "<<i+1;
cout<<"\nEnter name";
cin>>s1[i].name;
cout<<"\nEnter city";
cin>>s1[i].city;
cout<<"\nEnter year of establishment";
cin>>s1[i].yr;
cout<<"\nEnter pass percentage";
cin>>s1[i].per;
  }
for(i=0;i<n;i++)
  {
for(j=i+1;j<n;j++)
    {
if(strcmp(s1[i].name,s1[j].name)>0)
      {
        t=s1[i];
s1[i]=s1[j];
s1[j]=t;
      }
    }
  }

cout<<"\nDetails of colleges";   
for(i=0;i<n;i++)
  {
cout<<"\nCollege:"<<i+1;
printf("\nName:%s\n",s1[i].name);
printf("City:%s\n",s1[i].city);
printf("Year of establishment:%d\n",s1[i].yr);
cout<<"Pass percentage:"<<s1[i].per;
  }
return 0;
}

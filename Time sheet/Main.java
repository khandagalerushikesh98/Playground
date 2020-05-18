#include<iostream>
#include<vector>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thu,fri,sat,hrs=0,tot,sunb=0,satb=0,ne=0,thrs=0,a=0,b=0,c=0,d=0;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  hrs=hrs+sun+mon+tue+wed+thu+fri+sat;
  tot=hrs*100;
  
  if(sun<=24 && mon<=24 && tue<=24 && wed<=24 && thu<=24 && fri<=24 && sat<=24)
 {  
  for(int i=0; i<7; i++)
  {
      if(i==0)
      {
          if(sun>8)
          {
              ne=sun-8;
              b=b+(ne*15);
          }
      }
      else if(i==1)
      {
          if(mon>8)
          {
              ne=mon-8;
              b=b+(ne*15);
          }
      }
      else if(i==2)
      {
          if(tue>8)
          {
              ne=tue-8;
              b=b+(ne*15);
          }
      }
      else if(i==3)
      {
          if(wed>8)
          {
              ne=wed-8;
              b=b+(ne*15);
          }
      }
      else if(i==4)
      {
          if(thu>8)
          {
              ne=thu-8;
              b=b+(ne*15);
          }
      }
      else if(i==5)
      {
          if(fri>8)
          {
              ne=fri-8;
              b=b+(ne*15);
          }
      }
      else if(i==6)
      {
          if(sat>8)
          {
              ne=sat-8;
              b=b+(ne*15);
          }
      }        
  }
  
  {
    if(sun>0 && sat>0)
  	{
  		sunb=sun*50;
    	satb=sat*25;
    	c=sunb+satb;
  	}
  	else if(sun>0)
  	{
  		sunb=sun*50;
    	c=sunb;
  	}
  	else if(sat>0)
  	{
  		satb=sat*25;
    	c=satb;
  	}
  }
  d=tot+a+b+c;
  cout<<d;
  }}

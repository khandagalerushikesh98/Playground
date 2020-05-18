#include<iostream>
using namespace std;
struct time
{
int hr;
  int min;
  int sec;
};
void finddiff(struct time t1,struct time t2,struct time *diff);
int main()
{
  struct time t1;
  struct time t2;
  struct time diff;
    cin>>t1.hr>>t1.min>>t1.sec;
  cin>>t2.hr>>t2.min>>t2.sec;
  finddiff(t1,t2,&diff);
  cout<<diff.hr<<":"<<diff.min<<":"<<diff.sec;
  return 0;
}
void finddiff(struct time t1,struct time t2,struct time *diff)
{
if(t2.sec>t1.sec)
{
--t1.min;
  t1.sec+=60;
}
  diff->sec=t1.sec-t2.sec;
  if(t2.min>t1.min)
  {
  --t1.hr;
    t1.min+=60;
  }
  diff->min=t1.min-t2.min;
  diff->hr=t1.hr-t2.hr;
}
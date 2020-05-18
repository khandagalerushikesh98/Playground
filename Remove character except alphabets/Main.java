#include <iostream>
using namespace std;
int main() {
char line[200], alphabetString[200];
int j = 0;
cin.getline(line, 200);
	cin>>alphabetString;
for(int i = 0; line[i] != '\0'; ++i)
    {
if ((line[i] >= 'a' && line[i]<='z') || (line[i] >= 'A' && line[i]<='Z'))
        {
alphabetString[j++] = line[i]; 

        }
    }
alphabetString[j] = '\0';

cout<<alphabetString;    
return 0;
}

#include <bits/stdc++.h>
using namespace std; 

void countCharacterType(string str) 
{ 
int vowels = 0, consonant = 0, specialChar = 0,  
digit = 0 , spaces = 0; 
for (int i = 0; i <str.length(); i++) { 

char ch = str[i]; 

if ( (ch>= 'a' &&ch<= 'z') ||  
              (ch>= 'A' &&ch<= 'Z') ) { 


ch = tolower(ch); 

if (ch == 'a' || ch == 'e' || ch == 'i' || 
ch == 'o' || ch == 'u') 
vowels++; 
else
consonant++; 
        } 
else if (ch>= '0' &&ch<= '9') 
digit++; 
else if (ch ==' ')
        {
            ++spaces;
        }
else
specialChar++; 
    } 
cout<<"Vowels:" << vowels <<endl; 
cout<<"Consonants:" << consonant <<endl; 
cout<<"White Spaces:" << spaces <<endl; 
cout<<"Digits:" << digit <<endl; 
cout<<"Symbols:" <<specialChar<<endl; 

} 


int main() 
{ 
string str;
getline(cin,str);
countCharacterType(str); 
return 0; 
}

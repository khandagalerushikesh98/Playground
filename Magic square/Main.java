#include <bits/stdc++.h>
using namespace std; 

int isMagicSquare(int matrix[50][50], int m,int n); 

int main(){ 
int matrix[50][50],  m;
  //  cout<<"Enter the length of row of the matrix: ";
cin>> m;
for(int i = 0; i < m; i++)
for(int j = 0; j < m; j++)
cin>>matrix[i][j];
if (isMagicSquare(matrix,m,m))
cout<< "Yes"; 
else
cout<< "No"; 

return 0; 
}
int isMagicSquare(int matrix[50][50], int m,int  n){  
int sum1 = 0, sum2=0;
for (int i = 0; i < m; i++) 
        sum1 = sum1 + matrix[i][i];
for (int i = 0; i < m; i++) 
        sum2 = sum2 + matrix[i][n - 1 - i]; 

if(sum1 != sum2)  
return 0; 

for (int i = 0; i < n; i++){ 

int rowSum = 0;
for (int j = 0; j < m; j++) 
rowSum = rowSum + matrix[i][j]; 

        //checking, whether eachh row sum is equal to diagonal sum or not
if (rowSum != sum1) 
return 0; 
    } 

    //finding the sum of each column
for (int i = 0; i < m; i++){ 

int columnSum = 0;  
for (int j = 0; j < m; j++) 
columnSum += matrix[j][i]; 

        //checking, whether each column sum is equal to diagonal sum or not 
if (columnSum != sum1)  
return 1; 
    } 

return true; 
}

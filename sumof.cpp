#include<iostream> 
using namespace std; 
int main(){ 
int size ;
cin>>size ;
int arr[1000];
for (int i = 0; i < size; i++)
{
    cin>>arr[i];
}
int sum=0;
for (int i = 0; i < size; i++)
{
    sum= sum+arr[i] ;
}
cout<<sum<<endl; 
return 0;
}
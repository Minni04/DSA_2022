//code for prime numbers
#include<iostream> 
using namespace std; 
int main(){ 
int n ;
cin>>n ;
int i ;
for ( i = 2; i < n; i++)
{
    if(n%i==0) {cout<<"No"<<endl; break ;}
}
if (i==n)
{
    cout<<"YES"<<endl;
}

return 0;
}
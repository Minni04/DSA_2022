#include<iostream> 
using namespace std; 
int main(){ 
int size =10;
int arr[100];
fill_n(arr,10,5);
for (int i = 0; i < size; i++)
{
    cout<<arr[i]<<" ";
}

return 0;
}

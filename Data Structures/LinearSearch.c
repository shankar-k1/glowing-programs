#include<stdio.h>
int search(int arr[],int num,int x){
    int i;for(i=0;i< num ;i++){
        if(arr[i]==x){
            return 1;
        }
        return -1;
    }
}
int main(){
    
    int x=34;
    int arr[]={7,34,12,2431,231};
    int n=sizeof(arr)/sizeof(arr[0]);
    //printf("Enter the search element to be found in the array: ");
    //scanf("%d",&x);
    //printf("Enter the numbers to be inserted in the array :");
    //for(int i=0;i<=n;i++){
    //    scanf("%d",&arr[i]);
    //}
    int final_output=search(arr,n,x);
    if(final_output==-1)
        printf("The element %d is found in the array",x);
    else 
        printf("The element %d is not found in the array",x);
    return 0;
}
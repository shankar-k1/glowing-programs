#include<stdio.h>
int main(){
    int i,num;
    int arr[10];
    printf("Enter the number of the elements to be inserted into the array :");
    scanf("%d",&num);
    printf("Enter the %d elements into the array : ",num);
    for(i=0;i<num;i++){
        scanf("%d ",arr[i]);
    }
    printf("Enter the number of elements present in the array :",arr[i]);
    for(i=0;i<=num;i++){
        printf("%d ",arr[i]);
    }
}
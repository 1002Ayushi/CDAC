class PriorityQueue{
static void Heapify(int[] arr,int[] priority,int n  , int i){
int largest = i;
int l = 2*i+1;
int r = 2*i +2;

if(l<n && priority[l] > priority[largest]){
largest = l;
}
if(r<n && priority[r] > priority[largest]){
largest = r;
}
if(largest != i){
int temp = arr[i];
arr[i] = arr[largest];
arr[largest] = temp;
Heapify(arr,priority,n,largest);
}
}
static void HeapSortByPriority(int[] arr,int[] priority){
int n = arr.length;

for(int i = n/2-1 ; i>=0 ; i--){
Heapify(arr,priority,n,i);
}
for(int i = n-1; i>=0;i--){
int temp = arr[0];
arr[0] = arr[i];
arr[i] = temp;
Heapify(arr, priority,i,0);
}
}

public static void main(String []args){
int []arr = {3,10,5,6,7};
int []priority = {2,4,6,1,3};
HeapSortByPriority(arr,priority);

for(int a : arr){
System.out.print(a+ " ");
}
}
}
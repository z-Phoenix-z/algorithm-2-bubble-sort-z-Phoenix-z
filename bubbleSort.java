1. 创建 数组 a
2. 找到第一个下标 i
3. 跟i+1对比，swap
4. 

  
int [] a = {5,4,2,1,3};
int n = 1;
while (n < a.length){
  for(int i = 0;i < a.length-n; i ++){
    int b = 0;
    if (a[i]<a[i+1]){
      b = a[i];
      a[i] = a[i+1];
      a[i+1] = b;
    }
n++;
 }
for (int i = 0 ; i < a.length; i ++){
  System.out.print(a[i]);
}

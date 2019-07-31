#include <stdio.h>
int main() {
	int n,temp,a,b,sum;
  scanf("%d",&n);
  temp=n;
  b=n%10;
  while(n>=10)
  {
    n/=10;
  }
  a=n;
  sum=a+b;
  printf("%d",sum);
	return 0;
}
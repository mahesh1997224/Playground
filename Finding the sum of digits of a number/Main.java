#include <stdio.h>
int main() {
	int n,b=0;
  scanf("%d",&n);
  while(n!=0)
  {
    int a=n%10;
    b=b+a;
    n=n/10;
  }
  printf("%d",b);
	return 0;
}
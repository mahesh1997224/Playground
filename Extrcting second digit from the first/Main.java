#include <stdio.h>
int main() {
	int a,b;
  scanf("%d",&a);
  while(a>=100)
  {
    a/=10;
  }
  b=a%10;
  printf("%d",b);
	return 0;
}
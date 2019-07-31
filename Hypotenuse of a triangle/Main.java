#include<stdio.h>
#include<math.h>
void main(void)
{
    float num1;
    float num2;
    float sum;
    scanf("%f",&num1);
    scanf("%f",&num2);
    num1 = num1 * num1;
    num2 = num2 * num2;
    sum = num1 + num2;
    float x=sqrt(sum);
        printf("%.2f",x);
    return 0;
}
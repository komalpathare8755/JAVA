#include<stdio.h>
#include<string.h>

int main()
{
	char Arr[10]="Hello";
	char *Ptr=Arr;
    int iCnt=0;
	
	while(*Ptr !='\0')
	{
		iCnt++;
	    Ptr++;
	}
	printf("length of string is :%d\n",iCnt);
	
	return 0;
}

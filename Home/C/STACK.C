#include<stdio.h>
#include<conio.h>
#define size 5
int x[size],tos=-1;
void add()
{
	if(tos==size-1)
	{
		printf("\n\tstack overflow...");
	}
	else
	{
		tos++;
		printf("\n\tEnter value : ");
		scanf("%d",&x[tos]);
	}
}
void disp()
{
	int i;
	if(tos==-1)
	{
		printf("\n\tStack underflow...");
	}
	else
	{
		for(i=0;i<=tos;i++)
		{
			printf("\n\t%d) %d",i+1,x[i]);
		}
	}
}
void del()
{
	if(tos==-1)
		printf("stack under flow....!!");
	else
	{
		printf("%d value deleted",x[tos]);
		tos--;
	}
}
void updt()
{
	int uv,i,flag=0;
	if(tos==-1)
		printf("stack under flow....!!");
	else
	{
		disp();
		printf("\n\tEnter upate value : ");
		scanf("%d",&uv);
		for(i=0;i<=tos;i++)
		{
			if(x[i]==uv)
			{
				printf("\n\tEnter value : ");
				scanf("%d",&x[i]);
				flag=1;
			}
		}
		disp();
		if(flag==0)
		{
			printf("%d value not found",uv);
		}
	}
}
void srch()
{
	int i,sv,flag=0;
	if(tos==-1)
		printf("stack under flow....!!");
	else
	{
		disp();
		printf("\n\tEnter search value : ");
		scanf("%d",&sv);
		for(i=0;i<=tos;i++)
		{
			if(x[i]==sv)
			{
				printf("%d value found at position %d",sv,i+1);
				flag=1;
			}
		}
		if(flag==0)
			printf("value not found...!!");
	}
}
void sort()
{
	int i;
	if(tos==-1)
		printf("stack under flow....!!");
	else
	{
		int j,temp,z[size];
		for(i=0;i<=tos;i++)
		{
			z[i]=x[i];
		}
		for(i=0;i<tos-1;i++)
		{
			for(j=i+1;j<=tos;j++)
			{
				if(z[i]>z[j])
				{
					temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		for(i=0;i<=tos;i++)
		{
			printf("  %d",z[i]);
		}
	}
}
void main()
{
	int ch;
	while(1)
	{
		clrscr();
		printf("1) Add Data");
		printf("\n2) Display Data");
		printf("\n3)delete data");
		printf("\n4)update data");
		printf("\n5)search data");
		printf("\n6)sort data");
		printf("\n7)count data");
		printf("\n8)exit");
		printf("\n\tEnter your choice : ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				add();
				break;
			case 2:
				disp();
				break;
			case 3:
				del();
				break;
			case 4:
				updt();
				break;
			case 5:
				srch();
				break;
			case 6:
				sort();
				break;
			case 7:
				printf("total values: %d",tos+1);
				break;
			case 8:
				exit();
			default:
				printf("\n\tInvalid choice...");
		}
		getch();
	}
}
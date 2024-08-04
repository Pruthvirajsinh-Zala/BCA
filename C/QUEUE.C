#include<stdio.h>
#include<conio.h>
#define size 10
int x[size],front=-1,rear=-1;

void add()
{
	if(rear==size-1)
	{
		printf("\nQueue is Full....");
	}
	else
	{
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else
		{
			rear++;
		}
		printf("\nEnter Value : ");
		scanf("%d",&x[rear]);
		printf("\nValue Inserted ....");
	}
}

void disp()
{
	int i;
	if(front==-1)
	{
		printf("\nQueue is Full....");
	}
	else
	{
		for(i=front;i<=rear;i++)
		{
			printf("\n\t %d",x[i]);
		}
	}
}

void del()
{
	if(front==-1)
	{
		printf("\nQueue is Full....");
	}
	else
	{
		printf("\n %d is removed from Queue....",x[front]);
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front++;
		}
	}
}

void updt()
{
	int i,uv,flag=0;
	if(front==-1)
	{
		printf("\n\n\tQueue is Empty....!");
	}
	else
	{
	printf("\n\n\tEnter Value for Update: ");
	scanf("%d",uv);
	for(i=front;i<=rear;i++)
	{
		if(uv==x[i])
		{
			printf("\n\n\tEnter New Value:");
			scanf("%d",x[i]);
			printf("\n\n\tValue Updated Successfully....");
			flag=1;
		}
	}
	if(flag==0)
	{
		printf("\n\n\tValue Not Found...");
	}
	}
}
void srch()
{
	if(front==-1)
	{
		printf("\n\n\tQueue is Empty....!");
	}
	else
	{
	int i,sv,flag=0;
	printf("\n\n\tEnter Value for Serch: ");
	scanf("%d",sv);
	for(i=front;i<=rear;i++)
	{
		if(sv==x[i])
		{
			printf("\n\n\tValue Found Successfully....");
			flag=1;
		}
	}
	if(flag==0)
	{
		printf("\n\n\tValue Not Found...");
	}
	}
}

void sort()
{
	int z[size],i,j=0,temp;
	if(front==-1)
	{
		printf("\n\n\tQueue is Empty....!");
	}
	else
	{
	for(i=front;i<=rear;i++)
	{
		z[j++]=x[i];
	}
	for(i=0;i<front+rear-1;i++)
	{
		for(j=0;j<front+rear-1;j++)
		{
			if(z[i]<z[j])
			{
				temp=z[i];
				z[i]=z[j];
				z[j]=temp;
			}
		}
	}
	for(i=0;i<front+rear-1;i++)
	{
		printf("\n\t%d) %d",i,z[i]);
	}
	}
}

void main()
{
	int ch;
	while(1)
	{
	 clrscr();
	 printf("1) Add Data\n");
	 printf("2) Display Data\n");
	 printf("3) Delete Data\n");
	 printf("4) Count Data\n");
	 printf("5) Serch Data\n");
	 printf("6) Update Data\n");
	 printf("7) Sort Data\n");
	 printf("8) Exit");
	 printf("\t\t\tEnter Your Choice : ");
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
			printf("\nTotal Data %d",rear-front+1);
			break;
		case 5:
			srch();
			break;
		case 6:
			updt();
			break;
		case 7:
			sort();
			break;
		case 8:
			exit();
		default:
			printf("\nInvalid Choice...");
	 }
	 getch();

	}
}
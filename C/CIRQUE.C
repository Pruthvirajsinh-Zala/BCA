#include<stdio.h>
#include<conio.h>
#define size 5
int x[size],front=-1,rear=-1,count=0;

void add()
{
	if((rear+1)%size==front)
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
		else if(rear==size-1)
		{
			rear=0;
		}
		else
		{
			rear++;
		}
		printf("\nEnter Value : ");
		scanf("%d",&x[rear]);
		printf("\nValue Inserted ....");
		count++;
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
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				printf("\n\t %d",x[i]);
			}
		}
		else
		{
			for(i=front;i<size;i++)
			{
				printf("\n\t %d",x[i]);
			}
			for(i=0;i<=rear;i++)
			{
				printf("\n\t %d",x[i]);
			}
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
		else if(front==size-1)
		{
			front=0;
		}
		else
		{
			front++;
		}
		count--;
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
	disp();
	printf("\n\n\tEnter Value for Update: ");
	scanf("%d",&uv);
	if(front<=rear)
	{
		for(i=front;i<=rear;i++)
		{
			if(uv==x[i])
			{
				flag=1;
				break;
			}
		}
	}
	else
	{
		for(i=front;i<size;i++)
		{
			if(x[i]==uv)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			for(i=0;i<=rear;i++)
			{
				if(x[i]==uv)
				{
					flag=1;
					break;
				}
			}
		}
	}
	if(flag==1)
	{
			printf("\n\n\tEnter New Value:");
				scanf("%d",&x[i]);
				printf("\n\n\tValue Updated Successfully....");
	}
	else
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
		scanf("%d",&sv);
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				printf("\n\t %d",x[i]);
				if(sv==x[i])
				{
					printf("\t<<=== Value Found Here");
					flag=1;
				}
			}
		}
		else
		{
			for(i=front;i<size;i++)
			{
				printf("\n\t %d",x[i]);
				if(sv==x[i])
				{
					printf("\t<<=== Value Found Here");
					flag=1;
				}
			}
			for(i=0;i<=rear;i++)
			{
				 printf("\n\t %d",x[i]);
				if(sv==x[i])
				{
					printf("\t<<=== Value Found Here");
					flag=1;
				}
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
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				z[j++]=x[i];
			}
		}
		else
		{
			for(i=front;i<size;i++)
			{
				z[j++]=x[i];
			}
			for(i=0;i<rear;i++)
			{
				z[j++]=x[i];
			}
		}
		for(i=0;i<count;i++)
		{
			for(j=0;j<count;j++)
			{
				if(z[i]<z[j])
				{
					temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		for(i=0;i<count;i++)
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
			printf("\nTotal Data : %d",count);
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

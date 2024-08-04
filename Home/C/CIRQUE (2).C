#include<stdio.h>
#include<conio.h>
#define size 5
int x[size],front=-1,rear=-1,count=0;
void add();
void disp();
void del();
void updt();
void srch();
void sort();
void main()
{
	int ch;
	while(1)
	{
		clrscr();
		printf("1)Add data");
		printf("\n2)Display data");
		printf("\n3)delete data");
		printf("\n4)update data");
		printf("\n5)count data");
		printf("\n6)search data");
		printf("\n7)sort data");
		printf("\n8) exit");
		printf("\n enter your choice: ");
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
			   printf("total no. values %d",count);
			   break;
			case 6:
			   srch();
			   break;
			case 7:
			   sort();
			   break;
			case 8:
			    exit();
			default:
			       printf("\n Invalid choice");
		}
		getch();
	}
}
void add()
{
	if((rear+1)%size==front)
	{
		printf("\n\t queue full....!!");
	}
	else
	{
		if(front==-1)
		{
			front=0;
		}
		if(rear==size-1)
		{
			rear=0;
		}
		else
		{
			rear++;
		}
		printf("\n\t enter value : ");
		scanf("%d",&x[rear]);
		count++;
		printf("\n value inserted successfully....!!");
	}
}
void disp()
{
	if(front==-1)
	{
		printf("\n\t queue is empty..!!");
	}
	else
	{
		int i;
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				printf("\n %d",x[i]);
			}
		}
		else
		{
			for(i=front;i<size;i++)
			{
				printf("\n %d",x[i]);
			}
			for(i=0;i<=rear;i++)
			{
				printf("\n %d",x[i]);
			}
		}
	}
}
void del()
{
	if(front==-1)
	{
		printf("\n\t queue is empty..!!");
	}
	else
	{
		printf("%d removed from queue ",x[front]);
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
	if(front==-1)
	{
		printf("\n\t queue is empty..!!");
	}
	else
	{
		int i,uv,flag=0;
		disp();
		printf("\nenter update value : ");
		scanf("%d",&uv);
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				if(x[i]==uv)
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
			for(i=0;i<=rear;i++)
			{
				if(x[i]==uv)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			printf("\nvalue %d not found ",uv);
		}
		else
		{
			printf("\nenter new value : ");
			scanf("%d",&x[i]);
			printf("\n\t value updated succefully...!!!");
		}
		disp();
	}
}
void srch()
{
	if(front==-1)
	{
		printf("\n\t queue is empty..!!");
	}
	else
	{
		int i,sv,flag=0;
		disp();
		printf("\nenter update value : ");
		scanf("%d",&sv);
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				if(x[i]==sv)
				{
					flag=1;
				}
			}
		}
		else
		{
			for(i=front;i<size;i++)
			{
				if(x[i]==sv)
				{
					flag=1;
				}
			}
			for(i=0;i<=rear;i++)
			{
				if(x[i]==sv)
				{
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			printf("\nvalue %d not found ",sv);
		}
		else
		{
			printf("\n\t value found");
		}
	}
}
void sort()
{
	int i,z[size],j,temp;
	if(front==-1)
	{
		printf("\n\t queue is empty..!!");
	}
	else
	{
		if(front<=rear)
		{
			for(i=front;i<=rear;i++)
			{
				z[i]=x[i];
			}
		}
		else
		{
			for(i=front;i<=size;i++)
			{
				z[i]=x[i];
			}
			for(i=0;i<=rear;i++)
			{
				z[i]=x[i];
			}
		}
	}
// sorting
	for(i=0;i<=count-1;i++)
		{
			for(j=i+1;j<=count;j++)
			{
				if(z[i]>z[j])
				{
					temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		printf("\n\t sorted data..\n");
		for(i=0;i<=count;i++)
		{
			printf(" %d",z[i]);
		}
}
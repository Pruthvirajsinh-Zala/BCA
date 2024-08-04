#include<stdio.h>
#include<conio.h>
typedef struct xyz node;
struct xyz
{
	int data;
	node *next;
};
node *temp;
node *first=NULL;
node *last;
node *ins;
node *erase;
int count=0;
void add()
{
	temp=(node*)malloc(sizeof(node));
	printf("\nEnter Value : ");
	scanf("%d",&temp->data);
	temp->next=NULL;
	if(first==NULL)
	{
		first=temp;
	}
	else
	{
		last->next=temp;
	}
	last=temp;
	printf("\nValue Insterted Successfully...!!");
	count++;
}
void disp()
{
	if(first==NULL)
	{
		printf("\nRecord Not Found...!!");
	}
	else
	{
		int i=0;
		temp=first;
		while(temp!=NULL)
		{
			printf("\n(%d) : %d",++i,temp->data);
			temp=temp->next;
		}
	}
}
void delv()
{
	int del,flag=0;
	printf("\nEnter Value For Deletation : ");
	scanf("%d",&del);
	if(first->data==del)
	{
		erase=first;
		first=first->next;
		free(erase);
		flag=1;
	}
	else
	{
		temp=first;
		while(temp!=NULL)
		{
			if(temp->next->data==del)
			{
				erase=temp->next;
				if(erase==last)
				{
					last=temp;
				}
				temp->next=erase->next;
				free(erase);
				flag=1;
			}
			temp=temp->next;
		}
	}
	if(flag==1)
	{
		printf("\n%d Is Removed From Record...!!",del);
		count--;
	}
	else
	{
		printf("\n%d Is Not Fount From Record...!!",del);
	}
}

void delp()
{
	int pos;
	printf("\n\tEnter Position no. for deletion : ");
	scanf("%d",&pos);
	if(pos>count)
	{
		printf("\n\tPlease enter position between 1 to %d",count);
	}
	else
	{
		if(pos == 1)
		{
			erase == first;
			first=first->next;
		}
		else
		{
			int i=1;
			temp=first;
			while(i<pos-1)
			{
				i++;
				temp=temp->next;
			}
			erase = temp->next;
			if(last=erase)
			{
				last=temp;
			}
			temp->next=erase->next;
		}
		free(erase);
		printf("\n\tValue Removed...!");
		count--;
	}
}

void updt()
{
	int uv,flag=0;
	if(first==NULL)
	{
		printf("\n\n\tRecord Not Found...!");
	}
	else
	{
		disp();
		printf("\n\n\tEnter Value for Update : ");
		scanf("%d",&uv);
		temp=first;
		while(temp!=NULL)
		{
			if(temp->data==uv)
			{
				flag=1;
				printf("\n\n\tEnter New Value : ");
				scanf("%d",temp->data);
				printf("\n\n\tValue Added Successfully...!");
			}
			temp=temp->next;
		}
		if(flag==0)
		{
			printf("\n\n\tValue %d not found in the Record ...!",uv);
		}
	}
}

void srch()
{
	int sv,flag=0;
	if(first==NULL)
	{
		printf("\n\n\tRecord Not Found...!");
	}
	else
	{
		disp();
		printf("\n\n\tEnter Value for Update : ");
		scanf("%d",&sv);
		temp=first;
		while(temp!=NULL)
		{
			if(temp->data==sv)
			{
				flag=1;
			}
			temp=temp->next;
		}
		if(flag==0)
		{
			printf("\n\n\tValue %d not found in the Record ...!",sv);
		}
		else
		{
			printf("\n\n\tValue Found..!");
		}
	}
}


void main()
{
	int ch;
	while(1)
	{
		clrscr();
		printf("1)Add Data");
		printf("\n2)Display Data");
		printf("\n3)Delete Data");
		printf("\n4)Update Data");
		printf("\n5)Count Data");
		printf("\n6)Sarch Data");
		printf("\n7)Sort Data");
		printf("\n8)Exit");

		printf("\n\nEnter Your Choise : ");
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
					if(first==NULL)
					{
						printf("\nRecord Not Found...!!");
					}
					else
					{
						int s;
						printf("(1) Delete By Value...");
						printf("(2) \nDelete By Position...");
						printf("\n\nEnter Your Choice : ");
						scanf("%d",&s);
						switch(s)
						{
							case 1:
								delv();
								break;
							case 2:
								delp();
								break;
							default:
								printf("\nEnter Between 1 And 2...!!");
						}
					}
				break;
			case 4:
				updt();
				break;
			case 5:
				printf("\nTotal Data %d ",count);
				break;
			case 6:
				srch();
				break;
			//case 7:
			//	sort();
			//	break;
			case 8:
				exit();
				break;
			default:
				printf("\nInvalid Choice");
		}
		getch();
	}
}


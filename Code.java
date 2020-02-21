class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}


class Logic
{
	Node head;
	int top;
	int arr[];


	public Logic(int size)
	{
		top = -1;
		head = null;
		arr = new int[size];
	}

	public boolean isEmptyList()
	{
		return (head == null);
	}

	public void insertElement(Node newnode)
	{
		if(isEmptyList())
		{
			head = newnode;
		}

		else
		{
			Node temp = head;

			while(temp.next != null)
			{
				temp = temp.next;
			}

			temp.next = newnode;


		}
	}

	public void printElement()
	{
		Node temp = head;

		if(isEmptyList())
		{
			System.out.println("Linkedlist have no Element");
		}

		else
		{
			while(temp!= null)
			{
				System.out.print(" " +temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public void printReverseElement()
	{
		Node temp = head;
		if(isEmptyList())
		{
			System.out.println("List has no Element");
		}
		while(temp != null)
		{
			//push Element of linked list into stack;
			push(temp.data);
			temp = temp.next;
		}


	}

	 
	public void push(int pusheddata)
	{ 
		if(top == arr.length)

		{
		
			System.out.println("cant push");
		}

		else
		{
			top++;
			System.out.println("Element pushed from Linkedlist into Stack:: "+ pusheddata);
			arr[top] = pusheddata;
		}

	}

	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
		}

		else
		{
			int popelement = arr[top];
			System.out.print(popelement+ " ");
			top--;
		}
	}


}
 

class Code
{
	public static void main(String[] args)
	{
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(40);
		Node n4 = new Node(50);
		Stack st = new Stack(10);

		Logic obj = new Logic(10);
		System.out.println("Element insert into Linkedlist...\n=========================");
		obj.insertElement(n1);
		obj.insertElement(n2);
		obj.insertElement(n3);
		obj.insertElement(n4);
		System.out.println("Element in Linkedlist...");
		obj.printElement();
		System.out.println("==============================");
		obj.printReverseElement();
		System.out.println("==============================\npop Element sequence");
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
	}
}
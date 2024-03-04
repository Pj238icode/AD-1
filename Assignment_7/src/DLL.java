

public class DLL {
	class Link{
		int data;
		Link next;
		Link prev;
		Link(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Link head=null;
	Link tail=null;
	void create(int data) {
		 Link n=new Link(data);
		 if(head==null) {
			 head=n;
			 tail=n;
		 }
		 else {
			 tail.next=n;
			 n.prev=tail;
			 n.next=null;
			 tail=n;
			 
			  
			  
			 
			 
			 
			
		 }
		 
		
	}
	void insertAtBeg(int data) {
		
		 Link n=new Link(data);
		 if(head==null) {
			 head=n;
		 }
		 else {
		 n.next=head;
		 n.prev=null;
		 head=n;
		 }
	 }
	void insertAtLoc(int data,int position) {
		
		 Link n=new Link(data);
		 if(head==null||head.next==null) {
			 insertAtBeg(data);
		 }
		 else {
			 Link temp=head;
			 for(int i=0;i<position-2;i++) {
				 temp=temp.next;
				 
			 }
			 Link temp1=temp.next;
			 temp.next=n;
			 n.prev=temp.next;
			 n.next=temp1;
			 
			 
			 
			 
		 }
		
	 }
	void insertAtEnd(int data) {
		 Link n=new Link(data);
		 if(head==null) {
			 head=n;
			 tail=n;
		 }
		 else {
			 tail.next=n;
			 n.prev=tail;
			 n.next=null;
			 tail=n;
			 
		 }
		
	}
	void display() {
		 if(head==null) {
			 System.out.print("DLL is empty");
		 }
		 else {
			 Link temp=head;
			 while(temp!=null) {
			 System.out.print(temp.data+"-->");
			 temp=temp.next;
		 }
		 System.out.print("null");
	 }
}
	void Reverse() {
		if(tail==null) {
			System.out.println("DLL is empty");
		}
		else {
			Link temp=tail;
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.prev;
			}
			System.out.print("null");
			
		}
	}
	void deleteAtBeg() {
		if(head==null) {
			System.out.println("DLL is empty");
		}
		else {
			head=head.next;
		}
	}
	void deleteAtLoc(int position) {
		if(head==null) {
			System.out.println("DLL is empty");
		}
		else {
	      Link temp=head;
	      for(int i=1;i<position-1;i++) {
	    	  temp=temp.next;
	    	  
	      }
	      temp.next=temp.next.next;
			
		}
	}
	void deleteAtEnd() {
		if(head==null) {
			System.out.println("DLL is empty");
		}
		else {
		    Link temp=tail;
		    temp=temp.prev;
		    temp.next=null;
		    tail=temp;
		
		}
	}
	public static void main(String[] args) {
		DLL ll=new DLL();
		ll.create(1);
		ll.create(2);
		ll.create(3);
		ll.create(4);
		ll.create(5);
		ll.create(6);
		ll.create(7);
		ll.create(8);
		ll.insertAtBeg(4);
		ll.insertAtEnd(7);
		ll.insertAtLoc(0, 5);
		ll.insertAtLoc(90, 6);
	    ll.display();
	    System.out.println();
	    ll.deleteAtEnd();
	    ll.deleteAtEnd();
	    ll.deleteAtEnd();
		ll.display();
		System.out.println();
		ll.Reverse();
	  
		
		
		
	}
	

}

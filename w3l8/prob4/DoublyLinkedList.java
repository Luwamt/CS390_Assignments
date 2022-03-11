package w1l2.CS390_Assignments.w3l8.prob4;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){

			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			Node current = new Node();

			if (header.next==null){
				current.next=null;
				current.previous=header;
				header.next= current;
				current.value=item;
			}
			else {
				Node temp = header.next;
				while (temp.next != null) {
					temp = temp.next;
				}
				current.previous = temp;
				temp.next = current;
				current.next = null;
				current.value = item;

			}
			//implement
		}
		public boolean remove(String item){
			if (item== null) return  false;
			if (header.next==null){
				return false;
			}
		   else {
				Node toremove = header;
				while (toremove!= null) {
					if (item.equals(toremove.value)) {
						if (toremove.next != null) {
							toremove.previous.next = toremove.next;
							toremove.next.previous = toremove.previous;
						} else {
							toremove.previous.next = null;
						}
						return true;
					}
					toremove = toremove.next;
				}
			}
			//Implement
			return false;
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			public String toString() {

				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
			list.addLast("Lily");
			list.addLast("Carol");
			System.out.println("After adding at the last: "+list);
			list.remove("Carol");
			list.remove("Harry");
			list.remove("Steve");
			System.out.println("After removing:  "+list);
		}
}

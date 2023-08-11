
public class CH12_Stack {
	private ListNode head;
	
	public CH12_Stack () {
		head = null; 
	}

	public void showData () {
		System.out.println("==================");
		System.out.println("Stack Status");
		System.out.println("==================");
		ListNode position = head; 
		while (position != null){
			System.out.println (position.data);
			System.out.println("------------");
			position = position.link; 
		}
	}

	public void Push (String addData) {
		head = new ListNode (addData, head); 
	}

	public void Pop (){
		if (head != null)
			head = head.link;
		else{
			System.out.println ("Deleting from an empty list."); 
			System.exit (0);
		} 
	}

	private class ListNode {
		private String data;
		private ListNode link;
		public ListNode (String newData, ListNode linkValue) {
			data = newData;
			link = linkValue;
		}
	}
}


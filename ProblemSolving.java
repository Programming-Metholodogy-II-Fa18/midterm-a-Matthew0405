public class ProblemSolving {
		public static Data first;
		public Data last;
		public int sizeOfQueue;
		
		public ProblemSolving(){
			first = null;
			last = null;
			sizeOfQueue = 0;
		}
		
		public boolean isEmpty(){
			return first == null;
		}
		
		public int getValue(int i) {
			if (i == 0){
				return first.item;
			} else if (i == 1) {
				return first.next.item;
			} else if (i == 2) {
				return first.next.next.item;
			} else if (i == 3) {
				return first.next.next.next.item;
			} else if (i == 4) {
				return first.next.next.next.next.item;
			} else if (i == 5) {
				return first.next.next.next.next.next.item;
			}
			return -1;
		}
		
		public void add(int item){
			Data oldlast = last;
			last = new Data();
			last.item = item;
			last.next = null;
			if (isEmpty()) {
				first = last;
			} else {
				oldlast.next = last;
			}
			sizeOfQueue++;
		}
		
		public int remove(){
			int item = first.item;
			first = first.next;
			sizeOfQueue--;
			return item;
		}

	public class Data {
		public int item;
		public Data next;
	}
	
	public int ProblemThree(Data data, int value) {
		for (int i = 0; i < 9; i++){
			
		}
		return 0;
	}

	public static void main(String[] args) {
		ProblemSolving object = new ProblemSolving();
		object.add(1);
		object.add(5);
		object.add(8);
		object.add(10);
		object.add(12);
		object.add(14);
		object.add(18);
		object.add(20);
		object.add(33);
		object.add(41);
		object.ProblemThree(first, 8);
		object.ProblemThree(first, 33);
	}

}

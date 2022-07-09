package stack;

public class StackMain {
	public static void main(String[] args) {
		Stack st=new Stack(5);
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.printStack();
		
		st.pop();
		st.printStack();
		
		st.pop();
		st.printStack();
		
		System.out.println(st.peek());
	}
}

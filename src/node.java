
public class node {
	//number of adjacent bombs, -1 means a bomb is present
	int val;
	boolean show = false;
	boolean flag = false;
			
	public int flag(){
		flag = !flag;
		if(flag){
			return -1;
		}
		return 1;
	}
	
	public void shade(){
		show = false;
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	public boolean getShow(){
		return show;
	}
	public node(int val){
		this.val = val;
	}
	
	public void reveal(){
		show = true;
	}
//	public boolean activate(){
//		if(val == -1){
//			return false;
//		}
//		return true;
//	}
	
	public void setVal(int val){
		this.val = val;
	}
	
	public int getVal(){
		return val;
	}
	
	public String toString(){
		return ""+getVal();
	}
}

package garbage_collector;

public class GCDemo {

	int objId;
	
	public GCDemo(int objId){
		this.objId = objId;
		System.out.println("Created:"+this.objId);
	}
	
	@Override
	public void finalize() throws Throwable{
		System.out.println("Finalized:"+this.objId);
	}
	
	public static void main(String[] args){
		
		for (int i = 0; i < 100000000; i++){
			new GCDemo(i);
		}
	}
}

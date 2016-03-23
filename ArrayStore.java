import java.util.concurrent.atomic.AtomicInteger;

public class ArrayStore {

	static AtomicInteger nextId = new AtomicInteger();
	private int id;
	private int size;
	private int index;
	int[] arrayStorage;
	
	public ArrayStore(int size) {
		// TODO Auto-generated constructor stub
		this.setId(nextId.incrementAndGet());
		this.setSize(size);
		this.setIndex(0);
		arrayStorage = new int[getSize()];
	}

	public boolean insert(int number) {
		// TODO Auto-generated method stub
		try{
			arrayStorage[this.getIndex()] = number;
			this.setIndex(this.index++);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = nextId.incrementAndGet();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
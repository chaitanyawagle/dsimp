
public class Menu {

	String[] methodList;
	StringBuilder sbMenu;
	public Menu(String[] methods) {
		// TODO Auto-generated constructor stub
		this.methodList = methods;
	}
	
	public StringBuilder displayMenu(){
		sbMenu = new StringBuilder();
		for(int i = 0;i<methodList.length;i++){
			sbMenu.append(i+1 + "." + methodList[i] + "\n");
		}
		return sbMenu;
	}
}

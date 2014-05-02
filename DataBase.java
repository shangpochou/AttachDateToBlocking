import java.util.*;

public class DataBase {

	//Using patent ID as index
	public HashMap<String, Patent> myPtable;
	
	public String inputBlockingPath;
	
	public String inputDatePath;
	
	public String outputDatePath;
	
	//singulaton 
	private static DataBase myDataBase;
	
	private DataBase(){
		//config
		this.inputDatePath = new String("datesFinal.csv");
		this.inputBlockingPath = new String("blockingFinal.csv");
		this.outputDatePath = new String("BlockingWithDate.csv");
		
		this.myPtable = new HashMap<String, Patent>();
	}
	
	public static DataBase GetDataBase(){
		if(myDataBase == null){
			myDataBase = new DataBase();
		}
		return myDataBase;
	}
}

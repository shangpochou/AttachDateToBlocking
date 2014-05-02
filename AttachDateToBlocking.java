import java.util.ArrayList;

/*
 * Given a .CSV file contain a list, which is patents in certain year,
 * it could return a table of these patens with number of citations.
 * 
 * */
public class AttachDateToBlocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase myDB = DataBase.GetDataBase();
		
		ArrayList<Procedure> myProcAL = new ArrayList<Procedure>();
		
		ReadInputPatentsList myRIPL = new ReadInputPatentsList();
		myProcAL.add(myRIPL);
		
		AttachDates myAD = new AttachDates();
		myProcAL.add(myAD);
		
		WriteDates myWD = new WriteDates();
		myProcAL.add(myWD);
		
		for(int i = 0; i < myProcAL.size(); i++){
			myProcAL.get(i).GetData(myDB);
			myProcAL.get(i).Task();
		}
		
		
	}

}

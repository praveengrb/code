package user.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import user.bean.User;

public class RecordsManager implements Records{
@Override
	public String saveRecords(User u) throws IOException{
		
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
try{
		String accNumber= ""+System.currentTimeMillis();
		String pathToSave="./"+accNumber+".txt";
		File yourFile = new File(pathToSave);
		
		if(!yourFile.exists())
			yourFile.createNewFile();
        fileOut =
        new FileOutputStream(pathToSave);
        out = new ObjectOutputStream(fileOut);
        u.setAccNumber(accNumber);
        out.writeObject(u);
       
        System.out.printf("Serialized data is saved in "+pathToSave);
        return accNumber;

    }catch(IOException i)
    {
        i.printStackTrace();
    } finally{
    	if(out!=null)
    	 out.close();
    	if(fileOut!=null)
         fileOut.close();
    }
	return null;	
	}
@Override
	public User retriveRecords(String acNumber) throws IOException {
		User e = null;
		 FileInputStream fileIn = null;
		 ObjectInputStream in = null;
	      try
	      {
	          fileIn = new FileInputStream("./"+acNumber+".txt");
	          in = new ObjectInputStream(fileIn);
	         e = (User) in.readObject();
	        
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         
	      } finally{
	    	  if(in!=null)
	    	  in.close();
	    	  if(fileIn!=null)
		         fileIn.close();
	      }
		return e;
	}
}

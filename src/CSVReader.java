import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.List;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try { 
			String file="C:\\Users\\Administrator\\Desktop\\CSV\\data.csv";
			String file2="C:\\Users\\Administrator\\Desktop\\CSV\\data_final.csv";
	        FileReader filereader = new FileReader(file); 
	        FileWriter fileWriter = new FileWriter(file2); 
	        //FileWriter fileWriter = new FileWriter(file2); 
		  	  
	        // create csvReader object passing 
	        // file reader as a parameter 
	        com.opencsv.CSVReader csvReader = new com.opencsv.CSVReader(filereader); 
	        com.opencsv.CSVWriter csvWriter = new com.opencsv.CSVWriter(fileWriter);
	        
	        String[] nextRecord; 
	        String[] emptyLine= null; 
            System.out.println("Loading");
            // we are going to read data line by line 
            while ((nextRecord = csvReader.readNext()) != null) { 
            	csvWriter.writeNext(nextRecord);
                if(nextRecord[1].equals("0")||nextRecord[1].equals("")||nextRecord[1].equals("Q_13.1")) {
                	
                }
                else {
                	int freq=Integer.parseInt(nextRecord[1]);
                	if(freq>12) {}
                	else {
                		try {
                			emptyLine=new String[100];
                    		int count=13;
                    		for(int i=0;i<freq;i++)
                        	{
                    			emptyLine[3]=nextRecord[count];
                    			emptyLine[4]=nextRecord[count+1];
                    			emptyLine[5]=nextRecord[count+2];
                    			emptyLine[6]=nextRecord[count+3];
                    			emptyLine[7]=nextRecord[count+4];
                    			count=count+5;
                    			//3,4,5,6,7
                        		csvWriter.writeNext(emptyLine);
                        	}
                		}catch (Exception e) {
							e.printStackTrace();
						}
                			
                	}
                		
                }
            	
            } 
            csvWriter.close();
            
            System.out.println("Finished");
	     } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	}

}

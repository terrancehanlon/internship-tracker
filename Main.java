
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	import java.io.BufferedWriter;
public class Main {
	


	
	    
	    
	    public static void start(){
	        Scanner scan = new Scanner(System.in);
	        String fileName = "C:\\Users\\Ghost\\Desktop\\TestFile.txt";

	        try{
	        FileWriter fw = new FileWriter(fileName, true);
	      // BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	        boolean cont = true; 
	            while(cont){
	            System.out.println("Enter internship name: ");
	            String name = scan.nextLine();   //enter name of internship
	            fw.write("Title of Internship: " + name);
	            fw.write("\r\n");
	            
	            System.out.println("Enter a description");
	            String descrip = scan.nextLine();
	            fw.write(descrip);
	            fw.write("\r\n");
	            
	            System.out.println("Enter link: ");
	            String link = scan.nextLine();
	            fw.write("Link: " + link);
	            
	            fw.write("\r\n");
	            fw.write("******************************************************");
	            fw.write("\r\n");
	           
	                System.out.println("Enter more? Y/N");
	                String ans = scan.nextLine();
	                if(ans.equals("y")){
	                    cont = true;
	                }
	                else{
	                    cont = false;
	                    fw.close();
	                }
	            
	            
	            
	            }
	        
	        }
	        catch(IOException e){
	            System.err.println("File not found");
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        
	        start();
	        
	    }
	    
	}



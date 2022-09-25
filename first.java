import java.util.*;

public class first
{
	public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_CYAN = "\u001B[36m";	

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	
// 	public static String getColor(Scanner reader){
//     String x = reader.nextLine();
    
// 		return 
//   }

	
    public static String getDay(Scanner reader){
        
    	String day = new String();   
        System.out.println("Pick a day (1 - Sunday, 2 - Monday, 3 - Tuesday, 4 - Wednesday, 5 - Thursday, 6 - Friday, 7 - Saturday)");
        // while(reader.nextInt > 0 && reader.nextInt < 8)
	    int x = reader.nextInt();
		
	    if(x == 1){
	      day = "Sunday";
	    }
	    else if(x == 2){
	      day = "Monday";
	    }
	    else if(x == 3){
	      day = "Tuesday";
	    }
	    else if(x == 4){
	      day = "Wednesday";
	    }
      else if(x == 5){
        day = "Thursday";
      }
      else if(x == 6){
        day = "Friday";
      }
      else if(x == 7){
        day = "Saturday";
      }

      return day;
	}


	    

	public static String getDesc(Scanner reader){
        System.out.print("Please enter a description of your task: ");
        String desc = reader.next();
		return desc;
		}
	
	public static String getCategory(Scanner reader){
        System.out.println("");
        System.out.print("Please enter a category for your task: ");
        String category = reader.next();
	 	return category;
         
	 	}
	public static int getStartTime(Scanner reader){
        System.out.print("\nPlease enter a starting time (in military time) for your task: ");
        int startTime = reader.nextInt();
		return startTime;
	}
    public static int getEndTime(Scanner reader){
        System.out.print("\nPlease enter an ending time (in military time) for your task: ");
        int endTime = reader.nextInt();
        return endTime;
  }
	
	public static void main(String[] args) {
		String test = "y";
		Scanner reader = new Scanner(System.in).useDelimiter("\\n");

            
        ArrayList<String> sunArr = new ArrayList<String>();
        ArrayList<String> monArr = new ArrayList<String>();
        ArrayList<String> tueArr = new ArrayList<String>();
        ArrayList<String> wedArr = new ArrayList<String>();
        ArrayList<String> thurArr = new ArrayList<String>();
        ArrayList<String> friArr = new ArrayList<String>();
        ArrayList<String> satArr = new ArrayList<String>();
    
    
		while(test.equals("y")){
            String day = getDay(reader);
			String desc = getDesc(reader);
			String category = getCategory(reader);
			int startTime = getStartTime(reader);
			int endTime = getEndTime(reader);
			
			if(day.equals("Sunday")){
				// sunArr.add("Task name: " + desc +  ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime);
                sunArr.add("Task name: " + desc);
                sunArr.add("Category: " + category);
                sunArr.add("Start: " + startTime);
                sunArr.add("End: " + endTime+ "\n");

			}
			if(day.equals("Monday")){
				//monArr.add("Task name: " + desc +  ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime);
                monArr.add("Task name: " + desc);
                monArr.add("Category: " + category);
                monArr.add("Start: " + startTime);
                monArr.add("End: " + endTime+ "\n");
			}
            if(day.equals("Tuesday")){
				//tueArr.add("Task name: " + desc +  ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime);
                tueArr.add("Task name: " + desc);
                tueArr.add("Category: " + category);
                tueArr.add("Start: " + startTime);
                tueArr.add("End: " + endTime+ "\n");
			}
            if(day.equals("Wednesday")){
				//wedArr.add("Task name: " + desc + ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime);
                wedArr.add("Task name: " + desc);
                wedArr.add("Category: " + category);
                wedArr.add("Start: " + startTime);
                wedArr.add("End: " + endTime + "\n");
			}
            if(day.equals("Thursday")){
				//thurArr.add("Task name: " + desc +  ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime);
                thurArr.add("Task name: " + desc);
                thurArr.add("Category: " + category);
                thurArr.add("Start: " + startTime);
                thurArr.add("End: " + endTime + "\n");
			}
            if(day.equals("Friday")){
				//friArr.add("Task name: " + desc +  ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime);
                friArr.add("Task name: " + desc);
                friArr.add("Category: " + category);
                friArr.add("Start: " + startTime);
                friArr.add("End: " + endTime + "\n");
			}
            if(day.equals("Saturday")){
				//satArr.add("Task name: " + desc +  ", Category: " + category + ", Start time: " + startTime + " End time: " + endTime); 
                satArr.add("Task name: " + desc);
                satArr.add("Category: " + category);
                satArr.add("Start: " + startTime);
                satArr.add("End: " + endTime + "\n");
            }
            System.out.print("\nDo you want to add another task? (type 'y' to continue, and 'n' to stop) ");
			test = reader.next();
		}
        System.out.println("\nExiting the schedule editor...");

        String daysOfWeek[] = {"\n\nSunday: ", "Monday: ", "Tuesday: ", "Wednesday: ", "Thursday: ", "Friday: ", "Saturday: "};

        System.out.println("\n\nHere is your schedule: ");
        for(String d : daysOfWeek){
            if (d.equals("\n\nSunday: ")){
                System.out.println(ANSI_YELLOW + d + "\n");
                for(int i = 0; i < sunArr.size(); i++){
                System.out.println(sunArr.get(i));
                }
                System.out.println();
            }
            else if (d.equals("Monday: ")){
                System.out.println(ANSI_YELLOW + d + "\n");
                for(int i = 0; i < monArr.size(); i++){
                System.out.println(monArr.get(i));
                }
                System.out.println();
            }
            else if (d.equals("Tuesday: ")){
                System.out.println(ANSI_YELLOW + d + "\n");          
                for(int i = 0; i < tueArr.size(); i++){
                System.out.println(tueArr.get(i));
                }
                System.out.println();
            }
            else if(d.equals("Wednesday: ")){
                
                System.out.println(ANSI_YELLOW + d + "\n");
                for(int i = 0; i < wedArr.size(); i++){
                System.out.println(wedArr.get(i));
                }  
                System.out.println();
            }
            else if(d.equals("Thursday: ")){
                System.out.println(ANSI_YELLOW + d + "\n");
                for(int i = 0; i < thurArr.size(); i++){
                System.out.println(thurArr.get(i));
                }
                System.out.println();
            }
            else if(d.equals("Friday: ")){
                System.out.println(ANSI_YELLOW + d + "\n");
                for(int i = 0; i < friArr.size(); i++){
                System.out.println(friArr.get(i));
                }
                System.out.println();
            }
            else if(d.equals("Saturday: ")){
                System.out.println(ANSI_YELLOW + d + "\n");
                for(int i = 0; i < satArr.size(); i++){
                System.out.println(satArr.get(i));
                }
                System.out.println();
            }
            
            for (int i = 0; i < 90; i++){
                System.out.print(ANSI_YELLOW + "-");
            }
            System.out.print("\n\n\n\n");
        }
        }   


		
} 







	
	


package mascotAPP;

import java.util.ArrayList;


public class MascotAPP {
    
    public static void main(String[] args) {
      
        //Arrays
        String[] nombresArray = new String [5];
        
        for (int i = 0; i < nombresArray.length; i++){
            nombresArray[i] = "Chiquito " + (i + 1);
        }
        
        for (String var: nombresArray){
            System.out.println(var);
        }
        
        //Collecctions
        
        ArrayList<String> nombresArrayList = new ArrayList ();
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        System.out.println(nombresArrayList.size()); //3
        
        nombresArrayList.remove("Chiquito");
        System.out.println(nombresArrayList.size()); //2
    }

}

import java.util.LinkedList;
public class ArrayListDmeo {
    public static void main(String[] args){
        LinkedList siva = new LinkedList();
        LinkedList ram = new LinkedList(); 
        siva.add(100);
        siva.add(3430); 
        siva.add(34.45); 
        siva.add("suman"); 
        siva.add("ram"); 
        siva.add(true); 

            ram.add("hawa");
            ram.add("Tawa");
            ram.add("Kawa");
            ram.add("Chawa");
            ram.add("Rawa");
            ram.add("Pawa");
          siva.addAll(ram); 
          
         System.out.println("================================="); 
        for(int i = 0 ; i < siva.size(); i++){
            System.out.println(siva.get(i));
        }

       
         System.out.println("================================="); 
        for(int i = 0 ; i < siva.size(); i++){
            System.out.println(siva.get(i));
        }

    

         siva.removeAll(ram); 
         System.out.println("================================="); 
        for(int i = 0 ; i < siva.size(); i++){
            System.out.println(siva.get(i));
        }
}
}
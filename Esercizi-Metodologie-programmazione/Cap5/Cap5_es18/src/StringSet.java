public class StringSet {
    
    //attributi
    private String smallest; //rappresenta stringa più piccola
    private String largest; //rappresenta la stringa più grande
    private String middle; //rappresenta la stringa rtimanente 

    //costruttore
    public StringSet(String str1, String str2, String str3){

         largest = str1;
         smallest = str1;

         if (str2.compareTo(smallest)<0){
            smallest = str2;
         }
         if (str3.compareTo(smallest)<0){
            smallest =str3;
         }

         if (str3.compareTo(largest)<0){
            largest =str3;
         }
         if (str3.compareTo(largest)<0){
            largest =str3;
         }
         if (!str1.equals(largest) && !str1.equals(smallest))
         middle = str1;
         else if (!str2.equals(largest) && !str2.equals(smallest))
         middle = str2;
         else 
         middle = str3;

    }

    //metodi
    public String getSmallest(){
        return smallest;
    }

    public String getLargest(){
        return largest;
    }

    public String getMiddle(){
        return middle;
    }

    public static void main(String[] args) {
        
        StringSet stringhe = new StringSet("Tom", "Doe", "Harry");

        String small = stringhe.getSmallest();
        String large = stringhe.getLargest();
        String medium = stringhe.getMiddle();

        System.out.println(small);
        System.out.println("");
        System.out.println(medium);
        System.out.println("");
        System.out.println(large);

    }
}

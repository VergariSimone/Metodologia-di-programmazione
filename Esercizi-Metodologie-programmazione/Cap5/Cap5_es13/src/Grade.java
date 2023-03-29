public class Grade {
    // attributi 
    private String letterGrade ;

    //costruttore
    public Grade(String letGrade){

        letGrade = letterGrade;


    }

    //metodi
    public String getLetterGrade(){
        return letterGrade;
    }

    public double getNumericGrade()
   {
      String letter = letterGrade.substring(0,1);
      String suffix = "";
      if (letterGrade.length() > 1)
         suffix = letterGrade.substring(1,2);

      double modifier = 0;
      
      if (suffix.equals("-")){
        modifier = -0.3;
      }
         
      else if (suffix.equals("+")){
        modifier = 0.3;
      }
         
      else if (!suffix.equals("")){
        return -1;
      }
         

      double grade = 0;

      if (letter.equalsIgnoreCase("a"))
         {grade = 4;}
      else if (letter.equalsIgnoreCase("b"))
         {grade = 3;}
      else if (letter.equalsIgnoreCase("c"))
         {grade = 2;}
      else if (letter.equalsIgnoreCase("d"))
         {grade = 1;}
      else if (letter.equalsIgnoreCase("f"))
      {
         grade = 0;
         if (modifier != 0) return -1;
      }
      else
      {
         grade = -1;
         return grade;
      }

      // Compute numeric grade
      grade = grade + modifier;

      // There is no grade higher than an A
      if(grade > 4)
         grade = 4;

      return grade;
   }
    
}



public class Name {

    private String myFirst;
    private String myMiddle;
    private String myLast;
    
    public Name (String first, String middle, String last) {
       myFirst = first;
       myMiddle = middle;
       myLast = last;
       fixcase(myFirst);
       fixcase(myMiddle);
       fixcase(myLast);
    }
    
    public String lastFirst ( ) {
       return myLast + ", " + myFirst + " " + myMiddle;
    }
    
    public String fullName ( ) {
       return myFirst + " " + myMiddle + " " + myLast;
    }
    
   //  bad style
   //  private void fixFirst ( ) {
   //     myFirst = myFirst.toLowerCase().trim();
   //     myFirst = myFirst.substring(0,1).toUpperCase() + myFirst.substring(1);
   //  }
    
   //  // bad style
   //  private void fixMiddle ( ) {
   //     myMiddle = myMiddle.toLowerCase().trim();
   //     myMiddle = myMiddle.substring(0,1).toUpperCase() + myMiddle.substring(1);
   //  }
    
   //  // bad style
   //  private void fixLast (){
   //     myLast = myLast.toLowerCase().trim();
   //     myLast = myLast.substring(0,1).toUpperCase() + myLast.substring(1);
   //  }

   public String fixcase(String mp){
      mp = mp.toLowerCase().trim();
      mp = mp.substring(0,1).toUpperCase() + mp.substring(1);
      return mp;
   }

 }
public class Name {

   private String myFirst;
   private String myMiddle;
   private String myLast;

   public Name(String first, String middle, String last) {
      myFirst = fixcase(first);
      myMiddle = fixcase(middle);
      myLast = fixcase(last);
   }

   public String lastFirst() {
      return myLast + ", " + myFirst + " " + myMiddle;
   }

   public String fullName() {
      return myFirst + " " + myMiddle + " " + myLast;
   }

   public String initials() {
      String fin = myFirst.substring(0, 1);
      String min = myMiddle.substring(0, 1);
      String lin = myLast.substring(0, 1);
      return fin + min + lin;
   }

   // // bad style
   // private void fixMiddle ( ) {
   // myMiddle = myMiddle.toLowerCase().trim();
   // myMiddle = myMiddle.substring(0,1).toUpperCase() + myMiddle.substring(1);
   // }

   // // bad style
   // private void fixLast (){
   // myLast = myLast.toLowerCase().trim();
   // myLast = myLast.substring(0,1).toUpperCase() + myLast.substring(1);
   // }

   public String fixcase(String mp) {
      mp = mp.toLowerCase().trim();
      mp = mp.substring(0, 1).toUpperCase() + mp.substring(1);
      return mp;
   }

}
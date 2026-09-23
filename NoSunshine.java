public class NoSunshine {
   public static void main (String[] args) {
      String aintNo = "Ain't no sunshine when she's gone";
      String andThis = "And this house just ain't no home";
      // verse 1
      Chorus(aintNo, "It's not warm when she's away", "And she's always gone too long");
      
      // verse 2
      Chorus("Wonder this time where she's gone", "Wonder if she's gone to stay", andThis);
      
      // verse 3
      IKnowBlock();
      
      // verse 4
      System.out.println("Hey, I ought to leave young thing alone\nBut "+aintNo+", woah-woah\n");
      
      // verse 5
      Chorus(aintNo, "Only darkness every day", andThis);
      // verse 6
      for (int i=0;i<3;i++) {System.out.println("Anytime she goes away");}
   }
   public static void IKnowBlock () {
      System.out.print("And ");
      for (int i=0;i<5;i++) {
      for (int j=0;j<4;j++) {System.out.print("I know, ");}
      System.out.println("I know");
      }
      System.out.println("I know, I know\n");
   }
   public static void Chorus(String var1,String var2, String var3) {
      System.out.println(var1+"\n"+var2+"\nAin't no sunshine when she's gone\n"+var3+"\nAnytime she goes away\n");
   }
}
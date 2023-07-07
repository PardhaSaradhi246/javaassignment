import java.util.Scanner; 
class resverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String reversedStr = "";
        
    for (int i = 0; i < a.length(); i++) {
      reversedStr = a.charAt(i) + reversedStr;
    }
    
    System.out.println(reversedStr);
  }
}
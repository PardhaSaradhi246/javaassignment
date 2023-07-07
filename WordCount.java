class WordCount{
	public static void main (String[] args){
		String s = "   welcome    to    my       world        ";
		int count =0;
		int i=0,j=0;
		while(j<s.length() ){
		    if(s.charAt(i) != ' '){
		        while(  j<s.length()){
    				if(s.charAt(j)==' ' ){
    		            i =j;
		        i=i+1;
		        j=j+1;
		        count++;
    		            break;
    		        }else if(s.charAt(i)!=' ' && j==s.length()-1){
    		            count++;
    		        }
    		        else{
    		            j++;
    		        }
		        
		        }
		    }
		    else{
		        i =j;
		        i=i+1;
		        j=j+1;
		    }
		}
		System.out.println(count);

	}
}
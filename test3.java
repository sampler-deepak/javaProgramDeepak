public class test3 {
    public static void asciiValueSmallLetter(){
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println( ch + " | ASCII value: "+(int)ch );

    }
}
        public static void asciiValueCapitalLetter(){
            for(char ch='A';ch<='Z';ch++){
    
        System.out.println(ch +  " | ASCII value: "+ (int) ch);
}
    }
    public static void main(String[] args) {
        System.out.println("The Ascii value of Small character is :--");
        asciiValueSmallLetter();  
        System.out.println("The Ascii value of Capital character is :--");
        asciiValueCapitalLetter(); 
        
    }
    
}

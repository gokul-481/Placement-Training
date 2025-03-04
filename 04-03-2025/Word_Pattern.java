class Word_Pattern{
    public static void main (String[] args) {
        String a="t6hj7ui";
        int n=a.length();
        String str="";
        for(int i=0;i<n;i++){
            if(Character.isAlphabetic(a.charAt(i))){
                str=str+a.charAt(i);
            }
            else if(Character.isDigit(a.charAt(i))){
                int m=a.charAt(i)-'0';
                for(int j=0;j<m;j++){
                    System.out.print(str);
                }
                str="";
            }
            if(Character.isAlphabetic(a.charAt(n-1)) && (i==n-1)){
                System.out.print(str);
            }
        }
    }
}
class SubStr_StrBuilderObj{
    public static void main (String[] args) {
        String s="NAVAN";
        StringBuilder s1=new StringBuilder(s);
        String sub=s1.substring(1,4);
        System.out.println(sub);
    }
}
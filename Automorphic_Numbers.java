class Automorphic_number{
    public static void main(String args[]){
        for(int n=0;n<26;n++)
        {
        int s=(n*n);
        int rem=0;
        double res=0;
        int x=0;
        while(s>0){
            rem=s%10;
            s/=10;
            res=((Math.pow(10,x))*rem)+res;
            if(n==res)
            {
                System.out.println(n);
                break;
            }
            x++;
        }
        }
        
    }
}
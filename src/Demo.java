class Demo {
    public static void main(String[] args) {
        int temp, r ,sum=0;
        int no=23332;
        temp=no;
        while(no > 0) {
            r=no%10; //getting remainder
            System.out.println("remainder-----"+r);
            sum=(sum*10)+r;
           System.out.println("sum-----"+sum);
            no =no/10;
            System.out.println("no------"+no);

        }
        if(temp==sum){
            System.out.println("no is plindrom..");
        } else
        {
            System.out.println("no is not plindrom..");
        }
    }
}

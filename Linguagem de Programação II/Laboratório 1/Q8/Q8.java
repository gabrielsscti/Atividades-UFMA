class Q8{
    public static void main(String args[]){
        Integer n = 10;
        System.out.println("PADRAO A");
        for(Integer i = 1; i<=n; i++){
            for(Integer j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("PADRAO B");

        for(Integer i = n; i>0; i--){
            for(Integer j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("PADRAO C");
        for(Integer i = n; i>0; i--){
            for(Integer j = n; j>0; j--){
                if(j>i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("PADRAO D");
        for(Integer i = n; i>0; i--){
            for(Integer j = 0; j<n; j++){
                if(j+1<i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
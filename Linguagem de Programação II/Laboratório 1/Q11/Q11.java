class Q11{
    public static void main(String args[]){
        Integer tamLosango = 9, metadeLosango = (tamLosango/2)+1, printingArea = 0;
        Boolean isIncreasing = true;
        for(Integer i = 1; i<=tamLosango; i++){
            if(printingArea == metadeLosango-1)
                isIncreasing = false;
            for(Integer j = 1; j<=tamLosango; j++){
                if(j>=metadeLosango-printingArea && j<=metadeLosango+printingArea)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
            if(isIncreasing)
                printingArea++;
            else
                printingArea--;
        }
    }
}
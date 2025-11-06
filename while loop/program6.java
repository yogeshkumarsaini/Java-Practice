class program6 {
    public static void main(String[] args) {
        int i=1;
       int totalNumber=0;
        while(i<=100){
            if(i%4==0 && i%10==4){
                totalNumber++;
            }
            i++;
        }
        System.out.println(totalNumber);
    }
}

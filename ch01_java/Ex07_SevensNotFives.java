class Ex07_SevensNotFives{
    public static void main(String[] args) {
        
        for (int x = 2000; x <= 3200; x+=7){
            if (x % 5 == 0){
                continue;
            }//if
            System.out.println(x);
        }//for
    }//main
}//class
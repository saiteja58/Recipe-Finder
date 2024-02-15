public class RecipeFinder1{
    public static void main(String[] args) {
        Recipes obj=new Recipes();
        int x=5;
        for(int i=0;i<3;i++){
            for(int j=1;j<5;j++){
                if(x==obj.num[i][j])
                System.out.println("the number is: "+obj.num[i][0]);
            }
        }
    }
} 

class Recipes{
    int num[][]={
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,14,15,5}};
    
}
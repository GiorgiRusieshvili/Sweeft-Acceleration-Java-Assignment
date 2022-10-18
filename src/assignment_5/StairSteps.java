package assignment_5;

public class StairSteps {
    public static void main(String[] args) {

        int stairsCount= 6;
        System.out.println(countVariants(stairsCount));

    }


    //method counts variants of climbing on stairs with N steps
    static int countVariants(int stairsCount){
        int[] steps = new int[stairsCount+1];
        steps[0]=1;
        steps[1]=1;

        for (int i=2;i<=stairsCount;i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[stairsCount];
    }


}


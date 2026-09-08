package arrays;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost){
        int n = gas.length;
        int totalgas = 0;
        int totalcost = 0;
        for(int i = 0;i < n;i++){
            totalcost += cost[i];
            totalgas += gas[i];
        }
        if(totalcost > totalgas){
            return -1;
        }
        int availableGas = 0;
        int start = 0;
        for(int i = 0;i < n;i++){
            availableGas += gas[i] - cost[i];
            if(availableGas < 0){
                availableGas = 0;
                start = i+1;
            }
        }
        return start;
    }
}

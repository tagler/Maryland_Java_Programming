package assignments.language;

public class IntegerSet {
	
    public static void main(String args[]) {
    
        int start_value = 0;
        int goal_value = 10000;
        int set_number = 1;
        do {
            // start at 0, will loop around to all possible ints
            int temp_sum_total = 0;
            int next_value = start_value;
            // loop and check if set adds to goal value
            while (temp_sum_total < goal_value) {
                temp_sum_total += next_value;
                next_value++;
            }
            // if solution set found, print out set
            if (temp_sum_total == goal_value && start_value != 10000) {
                System.out.println("Solution Set #" + set_number + ": [" + start_value + "..." + (next_value-1) +"]");
                set_number++;
                }
            start_value++;
        } while (start_value != 0);

    }
    
}

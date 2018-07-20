package assignments.inheritance;

public class TestPlanner{
	
    public static void main(String args[]){
    	
        Planner p = new Planner(100);
        p.addDate(new SimpleDate());
        p.addDate(new Holiday(1, 1, 2005, "New Years"));
        p.addDate(new Appointment(8, 5, 2005, "Columbia", "Doctor"));

        p.addDate(new SimpleDate(4, 15, 2005));
        p.addDate(new Holiday(10, 31, 2005, "Halloween"));
        p.addDate(new Appointment(9, 6, 2005, "Bowie", "Hair Stylist"));

        p.addDate(new SimpleDate(5, 17, 2005));
        p.addDate(new Holiday(7, 4, 2005, "Independence Day"));
        p.addDate(new Appointment(10, 7, 2005, "Baltimore", "Interview"));

        System.out.println(p);

        Appointment a[] = p.getAppointments();
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }

    }
    
}
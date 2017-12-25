package in.fourbits.javabytes.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

public class TimeJobMain {

	public static void main(String[] args) {
		// Create a Job by implementing quartz job
		JobDetail job = JobBuilder.newJob(TimeJob.class).withIdentity("Time INfo", "group1").build();
		// Create a trigger with identity
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("triggerINfo", "group1")
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();
		// Tie both Job and trigger to a scheduler
		Scheduler scheduler;
		try {
			scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			scheduler.scheduleJob(null, trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

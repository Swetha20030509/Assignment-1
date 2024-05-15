package stackQueueAssignment.cpuSchedular;

import java.util.LinkedList;
import java.util.Queue;

public class CpuScheduling {
	public void process(Queue<Jop> jobDetail)
	{
		int currentTime=0;
		System.out.println("JOP NAME     "+"     PROCESS TIME   "+"    WAITINE TIME   "+"   TURNAROUND TIME   ");
		while(!jobDetail.isEmpty())
		{
			Jop currentJop=jobDetail.poll();
			currentJop.setWaitingTime(currentTime);
			currentTime+=currentJop.getProcessTime();
			currentJop.setTurnaroundTime(currentTime);
			System.out.println(currentJop.getName()+"                 "+currentJop.getProcessTime()+"       "+currentJop.getWaitingTime()+"    "+currentJop.getTurnaroundTime());
		}
	}

	public static void main(String[] args) {
		CpuScheduling cpuscheduling=new CpuScheduling();
		Queue<Jop> jobDetail=new LinkedList<>();
		Jop jop1=new Jop();
		jop1.setName("jop1");
		jop1.setProcessTime(2);
		Jop jop2=new Jop();
		jop2.setName("jop2");
		jop2.setProcessTime(4);
		Jop jop3=new Jop();
		jop3.setName("jop3");
		jop3.setProcessTime(5);	
		jobDetail.add(jop1);
		jobDetail.add(jop2);
		jobDetail.add(jop3);
		cpuscheduling.process(jobDetail);
	}
}

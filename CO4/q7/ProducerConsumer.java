import java.util.ArrayList;
import java.util.List;

class producer extends Thread
{
	List<Integer>list;
	public producer(List<Integer>list)
	{
		this.list=list;
	}
	public void run()
	{
		try
		{
			synchronized(list)
			{
				while(true)
				{
					if(list.size()>0)
					{
						list.wait();
						
					}
					else
					{
						produce();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void produce() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
			list.add(i);
			System.out.println("producer produced the element"+i);
		}
		list.notifyAll();
	}
	
}
class consumer extends Thread
{
	List<Integer>list;
	public consumer(List<Integer>list)
	{
		this.list=list;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				synchronized(list)
				{
					if(list.size()==0)
					{
						list.wait();
					}
					else
					{
						consume();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void consume() throws InterruptedException
	{
		while(!list.isEmpty())
		{
			Thread.sleep(1000);
			System.out.println("consumed the element"+list.remove(0));
		}
		list.notifyAll();
	}
}
public class ProducerConsumer {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		producer produce=new producer(list);
		consumer consume=new consumer(list);
		produce.start();
		consume.start();
	}

}

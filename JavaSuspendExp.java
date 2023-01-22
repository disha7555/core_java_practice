public class JavaSuspendExp extends Thread  
{    int i1;
    public void run()  
    {   int i=i1;
        for(i=1; i<=20; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e)
			{
				System.out.println(e);
			}    
            System.out.println(i);		
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
        JavaSuspendExp t1=new JavaSuspendExp ();    
        JavaSuspendExp t2=new JavaSuspendExp ();   
       //JavaSuspendExp t3=new JavaSuspendExp ();   
        // call run() method   
        t1.start();  
        t2.start(); 
        //if(t1.i1==5)
		//{
			t1.suspend();
		//}
		
        // suspend t2 thread   
        //t2.suspend();   
        // call run() method   
        //t3.start();  
    }    
}  

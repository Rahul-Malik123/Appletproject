import java.applet.Applet;
import java.applet.*; 
import java.awt.Graphics; 
import java.awt.Color;
import java.util.Calendar;
import java.math.*;

/* Author: Médéric Blandin
 * 
 * This Applet is the Médéric's avatar's face with a clock.
 * 
 */

public class MyAvatarClock extends MyAvatar implements Runnable {

  protected Thread mainThread;
	protected int delay;
	public void init(){
		mainThread = null;
		delay = 200;

	}
	public void start(){
		if(mainThread==null){
			mainThread = new Thread(this);
			mainThread.start();
		}
	}
	

	
	public void run(){
		while(Thread.currentThread() == mainThread){
			repaint();
			try{
					Thread.currentThread().sleep(delay);
			}
			catch(InterruptedException e){}
		}
	}
	
	public void paint(Graphics g){
		//get my avatar
		super.paint(g);
		Dimension d = this.getSize();
		Calendar c = Calendar.getInstance();
		//get the second
		int s = c.get(Calendar.SECOND);
		
		//Recreate the eyes
		g.setColor(Color.WHITE);
		g.fillOval(d.width/2+15-170,d.height/2+50-140,60,60);
		g.fillOval(d.width/2+115-60,d.height/2+50-140,60,60);
		g.setColor(Color.BLACK);
	
		int rayon=Math.min(d.width/2,d.height/2)*90/100;
		Font font= new Font("Times New Roman",0,15);
		g.setFont(font);
		g.drawOval(d.width/2+15-335,d.height/2+50-365,600,600);
		
		
		//Create the numbers of the clock
		for(int i=5;i<=60;i+=5)
		{
		g.setColor(Color.BLACK);
		double angle=i/5*Math.PI/6.0-Math.PI/2.0;
		double x=d.width/2+rayon*Math.cos(angle);
		double y=d.height/2+rayon*Math.sin(angle);
		g.drawString(" "+i,(int)x-30,(int)y-10);
		} 
		
		//Create all the points of the clocks
		for(int i=1;i<=60;i++)
		{
		g.setColor(Color.BLACK);
		double angle=i*Math.PI/30-Math.PI/2.0;
		double x=d.width/2+rayon*Math.cos(angle);
		double y=d.height/2+rayon*Math.sin(angle);
		g.fillOval((int)x-20,(int)y-10,6,6);
		
		} 
		
		//Delete the point under the numbers
		for(int i=5;i<=60;i+=5)
		{
		g.setColor(Color.WHITE);
		double angle=i/5*Math.PI/6-Math.PI/2.0;
		double x=d.width/2+rayon*Math.cos(angle);
		double y=d.height/2+rayon*Math.sin(angle);
		g.fillOval((int)x-20,(int)y-10,6,6);
		//repaint();
				
		} 
		
		//Move the point on the Clock
		double angle1=s*Math.PI/30-Math.PI/2.0;
		double x1=d.width/2+rayon*Math.cos(angle1);
		double y1=d.height/2+rayon*Math.sin(angle1);
		g.setColor(Color.GREEN);
		g.fillOval((int)x1-20,(int)y1-10,6,6);
		
		//Move the point on the eyes
		int rayon2=Math.min(d.width/2,d.height/2)*5/100;
		double angle4=s*Math.PI/30-Math.PI/2.0;
		double x4=d.width/2-125+rayon2*Math.cos(angle4);
		double y4=d.height/2-63+rayon2*Math.sin(angle4);
		double x5=d.width/2+85+rayon2*Math.cos(angle4);
		double y5=d.height/2-63+rayon2*Math.sin(angle4);
		g.setColor(Color.GREEN);	
		g.fillOval((int)x4,(int)y4,10,10);
		g.fillOval((int)x5,(int)y5,10,10);
		
		
		//Delete the point under the Number
		double angle3=s/5*Math.PI/6.0-Math.PI/2.0;
		double x3=d.width/2+rayon*Math.cos(angle3);
		double y3=d.height/2+rayon*Math.sin(angle3);
		g.setColor(Color.WHITE);
		if (s%5==0) {
			g.fillOval((int)x3-20,(int)y3-10,6,6);
		}
		
		//Write the number when it's the time
		double angle2=s/5*Math.PI/6.0-Math.PI/2.0;
		double x2=d.width/2+rayon*Math.cos(angle2);
		double y2=d.height/2+rayon*Math.sin(angle2);
		g.setColor(Color.GREEN);
		if (s==0 || s==60) {
			g.drawString(" 60",(int)x2-31,(int)y2-10);			
		}
		if (s%5==0 && s!=0) {
			g.drawString(" "+s,(int)x2-30,(int)y2-10);
		}
		
		
		
	}
	
}


import java.applet.Applet;
import java.applet.*; 
import java.awt.Graphics; 
import java.util.Calendar;
import java.math.*;
import java.awt.event.*; 

/* Author: Médéric Blandin
 * 
 * This Applet is the Médéric's avatar's face with a clock.
 * 
 */
public class MyAvatarClockBuffering extends MyAvatarClock {

     	
    public void paint(Graphics g){
		
		Dimension d = this.getSize();
		
		//Make the buffer
		Image image = createImage(d.width,d.height);
		Graphics offscreen = image.getGraphics();
		//get my avatar
		super.paint(offscreen);
		g.drawImage(image,0,0,this);
		
    }
    
    public void update(Graphics g) {
        paint(g);
    } 


}

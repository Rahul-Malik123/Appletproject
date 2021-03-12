import java.applet.Applet;
import java.applet.*; 
import java.awt.Graphics; 
import java.awt.Color;

/* Author: Médéric Blandin
 * 
 * This Applet is the Médéric's avatar's face.
 * 
 */

public class MyAvatar extends Applet {

  	
	public void paint(Graphics g){
		Dimension d = this.getSize();
		
		Color skin = new Color (255,220,180);
		
		//Ears
		g.setColor(skin);
		g.fillOval(d.width/2+22-300,d.height/2+55-100,100,150);
		g.fillOval(d.width/2+22+118,d.height/2+55-100,100,150);
		g.setColor(skin.darker());
		g.drawOval(d.width/2+22-300,d.height/2+55-100,100,150);
		g.drawOval(d.width/2+22+118,d.height/2+55-100,100,150);
		
		//Creation of Head
		g.setColor(skin);
		g.fillOval(d.width/2-220,d.height/2-220,400,500);
		g.setColor(skin.darker());
		g.drawOval(d.width/2-220,d.height/2-220,400,500);
		
		
		//Creation glasses
		//left and right
		g.setColor(Color.BLACK);
		g.fillRect(d.width/2-7-190,d.height/2+37-150,150,100);
		g.fillRect(d.width/2+93-85,d.height/2+37-150,150,100);
		g.setColor(skin);
		g.fillRect(d.width/2+3-190,d.height/2+47-150,130,80);
		g.fillRect(d.width/2+103-85,d.height/2+47-150,130,80);
		//middle
		g.setColor(Color.BLACK);
		g.fillRect(d.width/2+65-115,d.height/2+50-130,60,10);
		
		Color noisette = new Color (149, 86, 40);
		
		//Creation of eyes
		//Ocular Glob
		g.setColor(Color.WHITE);
		g.fillOval(d.width/2+15-170,d.height/2+50-140,60,50);
		g.fillOval(d.width/2+115-60,d.height/2+50-140,60,50);
		
		//Pupil
		
		g.setColor(noisette);
		g.fillOval(d.width/2+22-170,d.height/2+55-140,26,26);
		g.fillOval(d.width/2+123-62,d.height/2+55-140,26,26);
		g.setColor(Color.BLACK);
		g.fillOval(d.width/2+22-168,d.height/2+55-138,16,16);
		g.fillOval(d.width/2+123-60,d.height/2+55-138,16,16);
		
		
		//Nose
		g.setColor(skin.darker());
		g.drawArc(d.width/2+22-70,d.height/2+55-20,50,55, 180, 160);
		
		//beard
		//left
		for(int i = 1; i <= 170; i+=10) {
			for (int j=1; j<=i; j+=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2-192+i,d.height/2+115+j,1,1);
			}
		}
		
		for(int i = 1; i <= 160; i+=10) {
			for (int j=1; j<=i; j+=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2-202+i,d.height/2+115+j,1,1);
			}
		}
		
		for(int i = 11; i <= 150; i+=10) {
			for (int j=1; j<=i-10; j+=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2-212+i,d.height/2+125+j,1,1);
			}
		}
		
		for(int i = 21; i <= 150; i+=10) {
			for (int j=1; j<=i-20; j+=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2-222+i,d.height/2+135+j,1,1);
			}
		}
		
		for(int i = 31; i <= 140; i+=10) {
			for (int j=1; j<=i-30; j+=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2-212+i,d.height/2+165+j,1,1);
			}
		}
		
		//right
		
		for(int i = 1; i <= 170; i+=10) {
			for (int j=170; j>=i; j-=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2+150-j,d.height/2+115+i,1,1);
			}
		}
		
		for(int i = 1; i <= 170; i+=10) {
			for (int j=170; j>=i; j-=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2+170-j,d.height/2+115+i,1,1);
			}
		}
		
		for(int i = 1; i <= 160; i+=10) {
			for (int j=170; j>=i; j-=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2+170-j,d.height/2+125+i,1,1);
			}
		}
		
		for(int i = 1; i <= 140; i+=10) {
			for (int j=150; j>=i; j-=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2+170-j,d.height/2+135+i,1,1);
			}
		}
		
		for(int i = 1; i <= 120; i+=10) {
			for (int j=100; j>=i; j-=10) {
				g.setColor(Color.BLACK);
				g.drawOval(d.width/2+160-j,d.height/2+155+i,1,1);
			}
		}
		
		
		//Smile
		g.setColor(Color.WHITE);
		g.fillArc(d.width/2+22-115,d.height/2+55+50,150,100, 180, 180);
		g.setColor(skin.darker());
		g.drawArc(d.width/2+22-115,d.height/2+55+50,150,100, 180, 180);
		g.fillArc(d.width/2+22-115,d.height/2+55+99,150,1, 180, 360);
		
		//Eyebrow
		g.setColor(Color.BLACK);
		g.drawArc(d.width/2+22+30,d.height/2+55-165,60,45, 20, 140);
		g.drawArc(d.width/2+22-180,d.height/2+55-165,60,45, 20, 140);
				
		//Hair
		g.setColor(noisette);
		//small Strand of Hair
		g.fillArc(d.width/2+22-60,d.height/2+55-350,300,160,180,100);
		//big Strand of Hair
		g.fillArc(d.width/2+22-260,d.height/2+55-340,300,160,-20,-110);
		//top
		g.fillArc(d.width/2+22-218,d.height/2+55-300,350,160,0,180);
		//others Strand of Hair
		//right
		g.fillArc(d.width/2+22-28,d.height/2+55-328,300,160,185,100);
		g.fillRect(d.width/2+22+136,d.height/2+55-175,23,95);
		//left
		g.fillArc(d.width/2+22-358,d.height/2+55-328,300,160,250,100);	
		g.fillRect(d.width/2+22-242,d.height/2+55-175,23,95);
			
		
		//Name
		g.setColor(Color.RED);
		Font police = new Font("Times New Roman",10,40);
		g.setFont(police);
		g.drawString("Médéric".toUpperCase(), d.width/2+22+200, d.height/2+55+250);
		//g.setFont(police, d.width/2+22-358 , d.height/2+55-328);
	}
	
}

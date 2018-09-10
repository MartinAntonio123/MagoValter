import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class canvasMV extends JPanel implements Runnable, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Graphics bufferGraphics;
	private Image bufferImage;
	
	
	public canvasMV(){
		super();
		this.addMouseListener(this);

	}
	public void paint(Graphics g)
	{
		bufferImage=createImage(this.getWidth(),this.getHeight());
		bufferGraphics=bufferImage.getGraphics();
		paintComponent(bufferGraphics);
		g.drawImage(bufferImage, 0, 0, this);
	}
	public void paintComponent(Graphics g){

		Graphics2D draw= (Graphics2D) g;
		/*
		nube.paint(g);
		obstaculos.paint(g);
		miPajaro.paint(g);
		balas.paint(g);*/

		draw.setColor(Color.black);
		draw.setFont(new Font("TimesRoman", Font.PLAIN, 100)); 
		draw.drawString("hola mundo", 160, 160);

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
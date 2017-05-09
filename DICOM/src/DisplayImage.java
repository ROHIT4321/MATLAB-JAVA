import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

  
public class DisplayImage {
	
	 public static void main(String avg[]) throws IOException
	    {
	        DisplayImage abc=new DisplayImage();
	    }

	    public DisplayImage() throws IOException
	    {
	        BufferedImage img=ImageIO.read(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg"));
	        ImageIcon icon=new ImageIcon(img);
	        JFrame frame=new JFrame();
	        frame.setLayout(new FlowLayout());
	        frame.setSize(200,600);
	        JLabel lbl=new JLabel();
	        lbl.setIcon(icon);
	        frame.add(lbl);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        
	    
	        /*
	        DicomInputStream din = null;
	        try {
	            din = new DicomInputStream(new File("E:\\[01] IMAGE SAMPLES\\IM-0001-0007.dcm"));
	            //din = DicomInputStream.new(BufferedInputStream.new(FileInputStream.new("c:\\MR.dcm")));

	        }
	        catch (IOException e) {
	        	
	        	System.out.println(e);
	        	 
	            e.printStackTrace();
	           
	            return;
	        }
	        finally {
	            try {
	                din.close();
	            }
	            catch (IOException ignore) {
	            }
	        }*/

	       
	       
		
	        
	    }

}

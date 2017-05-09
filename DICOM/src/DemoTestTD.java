
import img.test;
import mat.print_int;

import com.mathworks.toolbox.javabuilder.*;

import TD_Creator.TD;
import img.*;


public class DemoTestTD {

	public static void main(String[] args) throws MWException {
		
	/*	test p = new test();  // Create object of class
		p.img(); // Call method from the class	
				
		print_int q = new print_int();   // Create object of class		
		q.mat(); // Call method from the class    
	*/	
		TD O = new TD();  // Create object of class
		
		/*E:\\[01] IMAGE SAMPLES\\CT-Meerbai_ABD*/
		/*E:\\[01] IMAGE SAMPLES\\Harshwardhan Jadhav Dicom Image\\Dummy DB*/
		
		O.TD_Creator("E:\\[01] IMAGE SAMPLES\\PETCT_Neck 1HEAD_NECK\\CT HEAD-NK 5.0 B30s.dcm\\");  // Call method from the class using object
		
		
	//	ImageJ_3D_Viewer q = new ImageJ_3D_Viewer();
		
		System.out.println("Running Successfully");		
	}
}






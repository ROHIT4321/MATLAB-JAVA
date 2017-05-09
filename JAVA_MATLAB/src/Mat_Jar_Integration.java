import com.mathworks.toolbox.javabuilder.MWException;

import TD_Creator.TD;


public class Mat_Jar_Integration {
	
	public static void main(String[] args) throws MWException {  // exception 
		
		
		TD O = new TD();  // Object created to access the method TD_Creator('Path of folder')
		
		O.TD_Creator("E:\\[01] IMAGE SAMPLES\\PETCT_Neck 1HEAD_NECK\\CT HEAD-NK 5.0 B30s.dcm");  // Path of Dicom Image folder
		
		
	}

}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteFileChunks {

	public static void main(String[] args) throws Exception{
		
		//Input File
		File file = new File("C:\\sherlock_holmes.avi");
		FileInputStream in = new FileInputStream(file);
		
		// Output File
		File out = new File("R:\\sherlock_holmes_converted.avi");
		FileOutputStream fos = new FileOutputStream(out);
		
		// Read these many bytes of data for one chunk
		byte[] data = new byte[4096];
		int readBytes;

		// Read form input file and write to output file
		try {
				while ((readBytes = in.read(data)) != -1) {
				System.out.println(new String(data));
				fos.write(data);
				System.out.println("Successfully read: " + readBytes + " bytes.");
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Close the File Objects
		finally{
			fos.close();
			in.close();
		}
	}
}
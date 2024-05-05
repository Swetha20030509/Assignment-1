package ThreadAssignment;


	import java.io.*;
	import java.net.*;

	public class Filedownloader extends Thread {
	    private String fileURL;
	    private String destinationPath;
	    private volatile boolean interrupted = false;

	    public Filedownloader(String fileURL, String destinationPath) {
	        this.fileURL = fileURL;
	        this.destinationPath = destinationPath;
	    }

	    public void interruptDownload() {
	        interrupted = true;
	    }

	    @Override
	    public void run() {
	        try {
	            URL url = new URL(fileURL);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            int fileSize = connection.getContentLength();

	            BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
	            FileOutputStream out = new FileOutputStream(destinationPath);

	            byte[] buffer = new byte[1024];
	            int bytesRead;
	            int totalBytesRead = 0;

	            while ((bytesRead = in.read(buffer)) != -1 && !interrupted) {
	                out.write(buffer, 0, bytesRead);
	                totalBytesRead += 1;
	              //  int progress = (int) ((double) totalBytesRead / fileSize * 100);
	                System.out.println("loading: " + totalBytesRead + "%");
	            }

	            if (interrupted) {
	                System.out.println("Download interrupted.");
	            } else {
	                System.out.println("Download completed.");
	              /*  String src="D:\\demo1.mp3";
	    	        FileInputStream fis=new FileInputStream(src);
	    	        Runtime r=Runtime.getRuntime();
	    	        Process pt=r.exec("cmd /c start " +src);
	    	        fis.close();*/
	            }

	            in.close();
	            out.close();
	            connection.disconnect();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        String fileURL = "https://www.youtube.com/watch?v=8iDSZtlNUI4";
	        String destinationPath = "D:\\demo1.mp3";

	        Filedownloader downloader = new Filedownloader(fileURL, destinationPath);
	        downloader.start();

	        // Simulate user interrupt after 5 seconds
	        try {
	            Thread.sleep(5000);
	            downloader.interruptDownload();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	       // System.out.println(".....");
	       
	    }
	}

package collections11_iterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
	
	private LinkedList<String> urls = new LinkedList<String>();
	
	// Inner class
	private class UrlIterator implements Iterator<String>{
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			
			StringBuilder sb = new StringBuilder();
			try {
				
				// Go to the url and download the website...
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line = null;
				
				while ( (line = br.readLine()) != null){
					sb.append(line);
					sb.append("\n");
				}
				
				br.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			
			return sb.toString();
		}	// end of next()

		@Override
		public void remove() {
			urls.remove();
		}
	}  // end of inner class UrlIterator.
	
	
	

	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.google.com");
		urls.add("http://www.msn.com");
	}

	
	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

//	@Override
//	public Iterator<String> iterator() {
//		return urls.iterator();
//	}
	
	
	

}

import graphic.Window;
import java.awt.Point;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestVonKoch {

	public static void main (String[] args) {
		final int XMAX = 400;
		final int YMAX = 400;
				
		final Window f = new Window(XMAX, YMAX, "von Koch");
		
		Point v = new Point();
		v.setLocation(XMAX/2, YMAX/8);

		Point u = new Point();
		u.setLocation(v.x - (3.0 * XMAX/10.0), v.y + (0.5196 * XMAX));
		
		Point w = new Point();
		w.setLocation(v.x + (3.0 * XMAX/10.0), u.y);

		System.out.println(Runtime.getRuntime().availableProcessors());
		ExecutorService exec = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		VonKochMono vk = new VonKochMono(f, u, v, w, exec);
	
	}	
}
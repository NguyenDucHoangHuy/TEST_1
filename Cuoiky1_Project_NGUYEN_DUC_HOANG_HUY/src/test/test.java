package test;
// NGUYEN DUC HOANG HUY
import java.awt.EventQueue;

import view.QLHSview;
import view.QLHSview_0;
public class test {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLHSview_0 frame_0 = new QLHSview_0();
					QLHSview frame = new QLHSview();
					frame_0.setVisible(true);
					//frame.setVisible(true);
				frame.showData();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
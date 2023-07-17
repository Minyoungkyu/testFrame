package testFrame;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TestFrame extends JFrame {

	private Image background = new ImageIcon(TestFrame.class.getResource("../img/img.png")).getImage();

	public TestFrame() {
		homeframe();
	}
	
	public void homeframe() {
		setTitle("1");// 타이틀
		setSize(400, 600);// 프레임의 크기
		setResizable(false);// 창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);// 창이 가운데 나오게
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);// 창이 보이게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
	}
	
	public void paint(Graphics g) {// 그리는 함수
		g.drawImage(background, 0, 0, null);// background를 그려줌
	}
	
	public static void main(String[] args) {
		TestFrame testFrame = new TestFrame();
		
		System.out.println("완료");
	}
}

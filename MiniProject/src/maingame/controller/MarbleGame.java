package maingame.controller;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import maingame.model.vo.Player;
import maingame.model.vo.Stadium;

public class MarbleGame extends JFrame
{
	public static JLayeredPane jlp; // 여러 층을 쌓을 수 있는 컨테이너
	public static Player[] p = new Player[3];
	public static Stadium[] st = new Stadium[12];
	public static int[][] pst = new int[3][3]; // 플레이어 소유 구장 기록

	private MarbleManager mm = new MarbleManager();

	public MarbleGame()
	{
		jlp = new JLayeredPane();

		// 전체 틀 프레임 설정
		setTitle("학점마블"); // 제목
		setSize(1500, 1000); // 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x표시 누르면 시스템 종료
		setResizable(false); // 사이즈 조정 불가
		setLocationRelativeTo(null); // 모니터 중앙에 위치

		// 플레이어, 구장 객체 생성
		for(int i=0;i<3;i++)
		{
			p[i] = new Player(null, 1000, i+1, 0, 0, 0, 1, 1, 0);
		}

		//String name, int owner, int price, int takePrice, int takeCount,  int toll,  int admission, int ownerCheck -> 이름, owner, 인수비, 
			//   이름    		구매		  인수비 										통행료
		st[0] = new Stadium("출발", 3, 0, 0, 0, 0, 0, 1);
		st[1] = new Stadium("java 프로그래밍", 3, 200, 200, 0, 100, 200, 0); 
		st[2] = new Stadium("알고리즘", 3, 200, 200, 0, 100, 200, 0);
		st[3] = new Stadium("축구게임", 3, 0, 0, 0, 0, 0, 1);
		st[4] = new Stadium("운영체제", 3, 250, 250, 0, 125, 200, 0);
		st[5] = new Stadium("데이터베이스", 3, 250, 250, 0, 125, 200, 0);
		st[6] = new Stadium("블랙홀", 3, 0, 0, 0, 0, 0, 1);
		st[7] = new Stadium("최적화론", 3, 300, 300, 0, 150, 200, 0);
		st[8] = new Stadium("자료구조", 3, 300, 300, 0, 150, 200, 0);
		st[9] = new Stadium("축구게임", 3, 0, 0, 0, 0, 0, 1);
		st[10] = new Stadium("컴퓨터구조론", 3, 350, 350, 0, 175, 200, 0);
		st[11] = new Stadium("션형대수학", 3, 350, 350, 0, 175, 200, 0);

		mm.startpage(); // 시작 화면 실행

		add(jlp); // 컨테이너를 프레임에 올리기

		setVisible(true); // 프레임을 보여주기
	}
}
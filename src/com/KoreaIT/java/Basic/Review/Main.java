package com.KoreaIT.java.Basic.Review;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==Start Program==");

		Scanner sc = new Scanner(System.in);

		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>();
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		System.out.println(formatter.format(calendar.getTime()));

		while (true) {

			System.out.printf("명령어: ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}

			if (command.equals("system exit")) {
				break;
			}
			
			if (command.equals("article detail 1")) {
				//저기 문장 끝에 들어가는 숫자를 따로 떼서 정수화 시킨 후에
				//그 정수와 일치하는 article id가 있는지 보고 있다면 세부정보를 출력한다.
				if (true) {
					System.out.println("번호: 1");
					System.out.println("날짜: "+date);
					
				}
				else {
					System.out.printf("1번 게시물은 존재하지 않습니다.\n");
				}
				continue;
			}
			
			if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}
				System.out.println("번호    /     제목    ");
				String tempTitle = null;
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					if (article.title.length() > 4) {
						tempTitle = article.title.substring(0, 4);
						System.out.printf("%d	/	%s\n", article.id, tempTitle + "...");
						continue;
					}

					System.out.printf("%d	/	%s\n", article.id, article.title);
				}
			} else if (command.equals("article write")) {
				int id = lastArticleId + 1;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d번 글이 생성 되었습니다\n", id);
				lastArticleId++;
			}

			else {
				System.out.println("존재하지 않는 명령어입니다");
			}

		}

		System.out.println("==End Program==");

		sc.close();
	}
}

class Article {
	int id;
	String title;
	String body;
	String date;

	Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.date = date;
	}
}
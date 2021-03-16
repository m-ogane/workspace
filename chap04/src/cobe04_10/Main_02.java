package cobe04_10;

public class Main_02 {
	public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			int[] scores = { 20, 30, 40, 50, 80 };
			int sum = 0;
			// ↑忘れるな
			for (int i = 0; i < scores.length; i++) {
				int max = 0;
				max = Math.max(max,scores[i]);
				int min = 100;
				
				for(int i =0;i<scores.length;i++) {
						min = Math.min(min, scores[i]);
				}

				
				int mul = 1;
				for (int i = 0; i<scores.length;i++);
				mul *=scores[i];






				sum += scores[i];
				int avg = sum / scores.length;
				System.out.println("合計点" + sum);
				System.out.println("平均点" + avg);
			}

				}


			}
	}

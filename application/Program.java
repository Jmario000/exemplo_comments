	package application;
	
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import entities.Comment;
	import entities.Posts;
	
	public class Program {
	
		public static void main(String[] args) throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
			Comment c1 = new Comment("Have a nice trip!");
			Comment c2 = new Comment("Wow that's awesome!");
			Posts p1 = new Posts(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
					"I'm goind to visit this wonderful country", 12);
			p1.addComments(c1);
			p1.addComments(c2);
			
			System.out.println(p1);
			
			Comment c3 = new Comment("Good Night");
			Comment c4 = new Comment("May the Force be with you");
			Posts p2 = new Posts(sdf.parse("28/07/2018 23:45:40"), "Good night guys",
					"See you tomorrow", 5);
			p2.addComments(c3);
			p2.addComments(c4);
			
			System.out.println();
			System.out.println(p2);
		}
	}

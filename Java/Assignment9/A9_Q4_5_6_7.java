
import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class News{
	int newId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newId = newId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newId=" + newId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
}
public class A9_Q4_5_6_7 {

	private static final char[] Map = null;

	public static void main(String[] args) {
		News n1=new News(1,"A","xxx","budget is going high");
		News n2=new News(1,"A","xyx","budget is balanced");
		News n3=new News(1,"A","zzz","budget is low");
		News n4=new News(2,"B","zzx","budget is balanced");
		News n5=new News(2,"B","zz","budget is low");
		News n6=new News(2,"B","aaa","budget is balanced");
		News n7=new News(3,"C","abc","budget");
		News n8=new News(3,"C","aa","budget is high");
		News n9=new News(4,"D","abc","budget is balanced");
		
		List<News> news=new ArrayList<>();
		news.add(n1);
		news.add(n2);
		news.add(n3);
		news.add(n4);
		news.add(n5);
		news.add(n6);
		news.add(n7);
		news.add(n8);
		news.add(n9);
			
		int l = 0;
		//Q4
		System.out.println("NewsId which received max comments:");
		for(News i:news) {
			if(i.getComment().length()>l) {
				l=i.getComment().length();
			}
		}
		for(News i:news) {
			if(i.getComment().length()==l) {
				System.out.println(i.getNewId());
			}
		}
		
		//Q5
		System.out.println("'Budget' appeared in comments: ");
		Long count=news.stream().filter(i->i.getComment().contains("budget")).count();
		System.out.println(count);
		
		
		
		// Q7
        System.out.println();
        news.forEach((News)-> {
       	 System.out.println("usercomments: " + News.getCommentByUser() + "," + " Number of comments: "+ News.getComment());
        });
	}

}
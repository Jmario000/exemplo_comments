package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Posts() {
	}

	public Posts(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void addComments(Comment comment) {
		comments.add(comment);
	}

	public void removeComments(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title).append("\n").append(likes).append(" Likes - ").append(sdf.format(moment)).append("\n")
				.append(content).append("\n").append("Comments:\n");
		for(Comment c : comments) {
			sb.append(c.getText()).append("\n");
		}
		return sb.toString();
	}
}
